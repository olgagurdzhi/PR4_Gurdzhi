package com.example.pr4_gurdzhi.data.datasources.room;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.pr4_gurdzhi.data.models.BookInfoEntity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {BookInfoEntity.class}, version = 1, exportSchema = false)
public abstract class BookInfoRoomDatabase extends RoomDatabase {
    public abstract BookDao bookDao();
    private static volatile BookInfoRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);
    public static BookInfoRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (BookInfoRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    BookInfoRoomDatabase.class, "film_db")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    public static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.
                BookDao dao = INSTANCE.bookDao();
                for (int i = 0; i < 100; i++) {
                    BookInfoEntity book = new BookInfoEntity("Star Wars" + i, 1, 1);
                    dao.insert(book);
                }
            });
        }
    };
}

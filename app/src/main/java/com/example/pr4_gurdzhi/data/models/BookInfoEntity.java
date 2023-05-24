package com.example.pr4_gurdzhi.data.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "book_table")
public class BookInfoEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;

    private int data;
    private int personCount;

    public BookInfoEntity(String name, int data, int personCount){
        this.name=name;
        this.data=data;
        this.personCount=personCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public BookInfo toBookInfo(){
        return new BookInfo(this.name, this.data, this.personCount);
    }
}



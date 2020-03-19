package com.example.myroomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities={MyDataList.class},version = 1,exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public abstract MyDao myDao();
}


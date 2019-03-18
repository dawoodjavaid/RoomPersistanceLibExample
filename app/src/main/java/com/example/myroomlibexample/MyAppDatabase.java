package com.example.myroomlibexample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = User.class,version = 1,exportSchema = false)
public abstract class MyAppDatabase extends RoomDatabase {

    public abstract MyDao myDao();


}

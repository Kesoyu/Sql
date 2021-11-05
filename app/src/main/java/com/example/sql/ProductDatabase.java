package com.example.sql;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Product.class,exportSchema = false,version = 1)
public abstract class ProductDatabase extends RoomDatabase {
    private static final String DB_NAME = "produktyDB";
    private static ProductDatabase instance;
    public abstract ProductDao productDao();
    public static ProductDatabase getInstance(Context context){
     if (instance==null){
         instance = Room.databaseBuilder(context.getApplicationContext(),ProductDatabase.class,DB_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build();
     }
     return instance;
    }
}

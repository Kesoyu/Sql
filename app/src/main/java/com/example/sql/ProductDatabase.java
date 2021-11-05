package com.example.sql;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = Product.class,exportSchema = false,version = 1)
public abstract class ProductDatabase extends RoomDatabase {
    private static final String DB_NAME = "produktyDB";
    private static volatile ProductDatabase instance;
    public abstract ProductDao productDao();

    private static final ExecutorService databaseWriterExecutor = Executors.newFixedThreadPool(4);
    public static ProductDatabase getDatabase(Context context){
        if(instance == null){
            synchronized (ProductDatabase.class){
                if (instance==null){
                    instance = Room.databaseBuilder(context.getApplicationContext(),ProductDatabase.class,DB_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build();
                }
            }
        }
        return instance;
    }
}

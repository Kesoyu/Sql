package com.example.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProductDatabase db = ProductDatabase.getDatabase(getApplicationContext());
        Product p1 = new Product("komputer",3000);
        db.productDao().wstawProdukt(p1);
        Product p2 = new Product("Monitor",1200);
        db.productDao().wstawProdukt(p2);
    }
}
/*
Witam o to Plan działania
- Doddajemy w app 2 implementsy
- Tworzymy klase dla naszych danych Product
- Tworzymy interfejs dla naszych produktów ProductDao
- Tworzymy klase ProducDataBase musi byc abstrakcyjna i rozeszerzac klase RoomDatabase
- W ProductDataBase sie skup bo skomplikowany kod jest
 */
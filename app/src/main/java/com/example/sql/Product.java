package com.example.sql;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "produkty")
public class Product {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "nazwa_prod")
    private String nazwa;

    @ColumnInfo(name = "cena")
    private double cena;

    public Product(int id, String nazwa, double cena) {
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }
}

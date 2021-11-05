package com.example.sql;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProductDao {
    @Insert
    void wstawProdukt(Product product);

    @Insert
    void wstawProdukty(List<Product> products);

    @Delete
    void usunProdukt(Product product);

    @Query("SELECT * FROM produkty")
    List<Product> pobierWszystko();

    @Query("SELECT nazwa_prod FROM produkty WHERE cena<:cenka")
    List<String> nazwyProduktowTanszychNiz(int cenka);
    //Jeżeli coś przekazujemy do naszego selecta to popieramy do dwukropkiem
}

package com.example.sql;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ProductRepository {
    private ProductDao productDao;
    private LiveData<List<Product>> produkty;
    private LiveData<List<String>> nazwyProdukty;
    ProductRepository(Application application){
        ProductDatabase db=ProductDatabase.getDatabase(application.getApplicationContext());
        productDao = db.productDao();
        produkty = productDao.pobierWszystko();
        nazwyProdukty = productDao.pobierzNazwy();
    }
    LiveData<List<Product>> pobierzProdukty(){
        return produkty;
    }
    LiveData<List<String>> pobierzNazwy(){
        return nazwyProdukty;
    }
}

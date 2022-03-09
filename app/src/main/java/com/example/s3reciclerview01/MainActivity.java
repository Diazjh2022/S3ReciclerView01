package com.example.s3reciclerview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Personaje> listDatos = new ArrayList<>();
    RecyclerView myRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = findViewById(R.id.myRecyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos.add(new Personaje(R.drawable.uno,"Audifonos Pro","especificaciones tecnicas Gammer"));
        listDatos.add(new Personaje(R.drawable.dos,"cargador Pro","220v 110 v"));
        listDatos.add(new Personaje(R.drawable.tres,"mouse Pro","gammer 200 dp "));
        listDatos.add(new Personaje(R.drawable.cuatro,"notebook Pro","DELL STUDIO"));
        AdapatadorDatos adapatadorDatos = new AdapatadorDatos(listDatos, this);

        myRecyclerView.setAdapter(adapatadorDatos);

    }

}
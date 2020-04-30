package com.example.examenu2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Mostrar extends AppCompatActivity {
    private ListView lista_restaurantes;
    private AdaptadorBase adaptadorBase;
    private List<Restaurantes> restaurantesList;

    int  contador;
    String[] nombres = new String[5];
    String[] descripciones = new String[5];
    String[] direcciones = new String[5];
    int[] imagenes = new int[5];
    float[] calificaciones = {3,3,3,3,3};

    Intent recibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        lista_restaurantes = findViewById(R.id.lista_restaurantes);

        restaurantesList = new ArrayList<>();
        recibiendo();

        restaurantesList.add( new Restaurantes(nombres[0], descripciones[0], direcciones[0], imagenes[0], calificaciones[0]));
        restaurantesList.add( new Restaurantes(nombres[1], descripciones[1], direcciones[1], imagenes[1], calificaciones[1]));
        restaurantesList.add( new Restaurantes(nombres[2], descripciones[2], direcciones[2], imagenes[2], calificaciones[2]));
        restaurantesList.add( new Restaurantes(nombres[3], descripciones[3], direcciones[3], imagenes[3], calificaciones[3]));
        restaurantesList.add( new Restaurantes(nombres[4], descripciones[4], direcciones[4], imagenes[4], calificaciones[4]));

        adaptadorBase = new AdaptadorBase(getApplicationContext(), restaurantesList);
        lista_restaurantes.setAdapter(adaptadorBase);
        lista_restaurantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent rating = new Intent(view.getContext(), Restaurante.class);
                rating.putExtra("Nombre", nombres[position]);
                rating.putExtra("Descripcion", descripciones[position]);
                rating.putExtra("Dirtel", direcciones[position]);
                rating.putExtra("Imagen", imagenes[position]);
                rating.putExtra("posicion", position);
                startActivity(rating);
            }
        });

    }

    public void recibiendo(){
        recibir = getIntent();
        contador = recibir.getExtras().getInt("contador");

        if(contador==0) {
            recibirExtras1();
           }
        if(contador==1) {
            recibirExtras1();
            recibirExtras2();
            }
        if(contador==2) {
            recibirExtras1();
            recibirExtras2();
            recibirExtras3();
        }
        if(contador==3) {
            recibirExtras1();
            recibirExtras2();
            recibirExtras3();
            recibirExtras4();
        }
        if(contador==4) {
            recibirExtras1();
            recibirExtras2();
            recibirExtras3();
            recibirExtras4();
            recibirExtras5();
        }

    }


    public void recibirExtras1(){
        nombres[0] = recibir.getExtras().getString("nombre");
        descripciones[0] = recibir.getExtras().getString("descripcion");
        direcciones[0] = recibir.getExtras().getString("direccion");
        imagenes[0] = recibir.getExtras().getInt("imagen");
    }
    public void recibirExtras2(){
        nombres[1] = recibir.getExtras().getString("nombre1");
        descripciones[1] = recibir.getExtras().getString("descripcion1");
        direcciones[1] = recibir.getExtras().getString("direccion1");
        imagenes[1] = recibir.getExtras().getInt("imagen1");
    }
    public void recibirExtras3(){
        nombres[2] = recibir.getExtras().getString("nombre2");
        descripciones[2] = recibir.getExtras().getString("descripcion2");
        direcciones[2] = recibir.getExtras().getString("direccion2");
        imagenes[2] = recibir.getExtras().getInt("imagen2");
    }
    public void recibirExtras4(){
        nombres[3] = recibir.getExtras().getString("nombre3");
        descripciones[3] = recibir.getExtras().getString("descripcion3");
        direcciones[3] = recibir.getExtras().getString("direccion3");
        imagenes[3] = recibir.getExtras().getInt("imagen3");
    }
    public void recibirExtras5(){
        nombres[4] = recibir.getExtras().getString("nombre4");
        descripciones[4] = recibir.getExtras().getString("descripcion4");
        direcciones[4] = recibir.getExtras().getString("direccion4");
        imagenes[4] = recibir.getExtras().getInt("imagen4");
    }


}

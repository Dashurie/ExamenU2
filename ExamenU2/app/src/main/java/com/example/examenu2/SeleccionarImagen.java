package com.example.examenu2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SeleccionarImagen extends AppCompatActivity implements ListView.OnItemClickListener, View.OnClickListener{
    ListView lista_imagenes;
    Imagenes[] imagenes = {
            new Imagenes(R.drawable.imagen1),
            new Imagenes(R.drawable.imagen2),
            new Imagenes(R.drawable.imagen3),
            new Imagenes(R.drawable.imagen4),
            new Imagenes(R.drawable.imagen5)

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_imagen);
        lista_imagenes = findViewById(R.id.lista_imagenes);
        lista_imagenes.setAdapter(new ArrayAdapter<Imagenes>(this, android.R.layout.simple_list_item_1, imagenes));
        lista_imagenes.setOnItemClickListener(this);
        lista_imagenes.setAdapter(new Adaptador(this,R.layout.layout_imagenes, imagenes));
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in_imagen = new Intent();


        in_imagen.putExtra("img", imagenes[position].getImagen());
        setResult(Activity.RESULT_OK, in_imagen);
        finish();

    }


}

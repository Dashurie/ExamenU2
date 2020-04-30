package com.example.examenu2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Capturar extends AppCompatActivity {
    Button b_seleccionar;
    Button b_guardar;
    EditText et_nombre;
    EditText et_descripcion;
    EditText et_direccion;
    Intent in_seleccionar;
    final int ima = 1000;
    int imagen;
    String nombre, descripcion, direccion;
    int contador ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capturar);
        b_seleccionar = findViewById(R.id.b_seleccionar);
        b_guardar = findViewById(R.id.b_guardar);
        et_nombre = findViewById(R.id.et_nombre);
        et_descripcion = findViewById(R.id.et_descripcion);
        et_direccion = findViewById(R.id.et_direccion);
        in_seleccionar = new Intent(this,SeleccionarImagen.class);
        imagen = R.drawable.imagen1;

    }

    public void onClickSeleccionar(View v){
        startActivityForResult(in_seleccionar,ima);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        switch (requestCode){
            case ima:
                if(resultCode == Activity.RESULT_OK){

                    imagen = data.getExtras().getInt("img");

                    b_seleccionar.setBackgroundResource(imagen);
                }
                else {

                }
                break;
        }



    }

    public void onClickGuardar(View v){
        Intent recibirContador = getIntent();
        Bundle recibirBundle = recibirContador.getExtras();
        contador = recibirBundle.getInt("contador2");
        Toast.makeText(getApplicationContext(),"Contador: "+contador, Toast.LENGTH_LONG).show();


        Intent in_datos = new Intent();
         nombre = et_nombre.getText().toString();
         descripcion = et_descripcion.getText().toString();
        direccion = et_direccion.getText().toString();
        float calificacion = 3;


        if(contador == -1){
            in_datos.putExtra("img", imagen);
            in_datos.putExtra("nom", nombre);
            in_datos.putExtra("des", descripcion);
            in_datos.putExtra("dir", direccion);
            in_datos.putExtra("cal", calificacion);}

        if (contador == 0){

        in_datos.putExtra("img1", imagen);
        in_datos.putExtra("nom1", nombre);
        in_datos.putExtra("des1", descripcion);
        in_datos.putExtra("dir1", direccion);
        in_datos.putExtra("cal", calificacion);}

        if (contador == 1){

            in_datos.putExtra("img2", imagen);
            in_datos.putExtra("nom2", nombre);
            in_datos.putExtra("des2", descripcion);
            in_datos.putExtra("dir2", direccion);
            in_datos.putExtra("cal", calificacion);}

        if (contador == 2){

            in_datos.putExtra("img3", imagen);
            in_datos.putExtra("nom3", nombre);
            in_datos.putExtra("des3", descripcion);
            in_datos.putExtra("dir3", direccion);
            in_datos.putExtra("cal", calificacion);}

        if (contador == 3){

            in_datos.putExtra("img4", imagen);
            in_datos.putExtra("nom4", nombre);
            in_datos.putExtra("des4", descripcion);
            in_datos.putExtra("dir4", direccion);
            in_datos.putExtra("cal", calificacion);}


        setResult(Activity.RESULT_OK, in_datos);
        finish();


    }
}

package com.example.examenu2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView3;
    String texto = "2DA EVALUACIÓN PARCIAL \n Leoncio Rodríguez \n Sergio Ortíz \n Lesly Sifuentes" ;
    Intent in_captutar;
    Intent in_mostrar;
    final int num = 2000;

    int[] ima = new int[5];
    String[] nom = new String[5];
    String[] des = new String[5];
    String[] dir = new String[5];

    int  cal;
    int contador=-1;
    Intent enviarContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView3 = findViewById(R.id.textView3);
        textView3.setText(texto);
        in_captutar = new Intent(this, Capturar.class);
        in_mostrar = new Intent(this,Mostrar.class);
    }

    public void onClickCapturar (View v){
        Bundle bundle1 = new Bundle();
        bundle1.putInt ("contador2", contador);
        in_captutar.putExtras(bundle1);

        startActivityForResult(in_captutar,num);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case num:
                if(resultCode == Activity.RESULT_OK){
                    if (contador ==-1){
                    ima[0] = data.getExtras().getInt("img");
                   nom[0] = data.getExtras().getString("nom");
                   des[0] =  data.getExtras().getString("des");
                    dir[0] = data.getExtras().getString("dir");
                    cal = data.getExtras().getInt("cal");
                    }
                    if(contador == 0){
                        ima[1] = data.getExtras().getInt("img1");
                        nom[1] = data.getExtras().getString("nom1");
                        des[1] =  data.getExtras().getString("des1");
                        dir[1] = data.getExtras().getString("dir1");
                        cal = data.getExtras().getInt("cal");
                    }
                    if(contador == 1){
                        ima[2] = data.getExtras().getInt("img2");
                        nom[2] = data.getExtras().getString("nom2");
                        des[2] =  data.getExtras().getString("des2");
                        dir[2] = data.getExtras().getString("dir2");
                        cal = data.getExtras().getInt("cal");
                    }
                    if(contador == 2){
                        ima[3] = data.getExtras().getInt("img3");
                        nom[3] = data.getExtras().getString("nom3");
                        des[3] =  data.getExtras().getString("des3");
                        dir[3] = data.getExtras().getString("dir3");
                        cal = data.getExtras().getInt("cal");
                    }
                    if(contador == 3){
                        ima[4] = data.getExtras().getInt("img4");
                        nom[4] = data.getExtras().getString("nom4");
                        des[4] =  data.getExtras().getString("des4");
                        dir[4] = data.getExtras().getString("dir4");
                        cal = data.getExtras().getInt("cal");
                    }

                    contador++;

                }
                else {
                }
                break;
        }


    }

    public void onClickMostrar (View v){

        if(contador==0){
           ponerExtras1();
        }
        if(contador==1){
           ponerExtras1();
           ponerExtras2();
            }
        if(contador==2){
            ponerExtras1();
            ponerExtras2();
            ponerExtras3();
        }
        if(contador==3){
            ponerExtras1();
            ponerExtras2();
            ponerExtras3();
            ponerExtras4();
        }
        if(contador==4){
            ponerExtras1();
            ponerExtras2();
            ponerExtras3();
            ponerExtras4();
            ponerExtras5();
        }

        startActivity(in_mostrar);
    }

    public void ponerExtras1(){
        in_mostrar.putExtra("imagen", ima[0]);
        in_mostrar.putExtra("nombre", nom[0]);
        in_mostrar.putExtra("descripcion", des[0]);
        in_mostrar.putExtra("direccion", dir[0]);
        in_mostrar.putExtra("calificacion", cal);
        in_mostrar.putExtra("contador",contador);
    }
    public void ponerExtras2(){
        in_mostrar.putExtra("imagen1", ima[1]);
        in_mostrar.putExtra("nombre1", nom[1]);
        in_mostrar.putExtra("descripcion1", des[1]);
        in_mostrar.putExtra("direccion1", dir[1]);
        in_mostrar.putExtra("calificacion", cal);
        in_mostrar.putExtra("contador",contador);
    }
    public void ponerExtras3(){
        in_mostrar.putExtra("imagen2", ima[2]);
        in_mostrar.putExtra("nombre2", nom[2]);
        in_mostrar.putExtra("descripcion2", des[2]);
        in_mostrar.putExtra("direccion2", dir[2]);
        in_mostrar.putExtra("calificacion", cal);
        in_mostrar.putExtra("contador",contador);
    }
    public void ponerExtras4(){
        in_mostrar.putExtra("imagen3", ima[3]);
        in_mostrar.putExtra("nombre3", nom[3]);
        in_mostrar.putExtra("descripcion3", des[3]);
        in_mostrar.putExtra("direccion3", dir[3]);
        in_mostrar.putExtra("calificacion", cal);
        in_mostrar.putExtra("contador",contador);

    }
    public void ponerExtras5(){
        in_mostrar.putExtra("imagen4", ima[4]);
        in_mostrar.putExtra("nombre4", nom[4]);
        in_mostrar.putExtra("descripcion4", des[4]);
        in_mostrar.putExtra("direccion4", dir[4]);
        in_mostrar.putExtra("calificacion", cal);
        in_mostrar.putExtra("contador",contador);
    }

    public void onClickSalir (View v){
        finish();
    }


}

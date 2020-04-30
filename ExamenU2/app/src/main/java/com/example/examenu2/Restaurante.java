package com.example.examenu2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Restaurante extends AppCompatActivity {
    TextView tv_nombreRes;
    TextView tv_descripcionRes;
    TextView tv_direccionRes;
    ImageView iv_imagenRes;
    RatingBar rtBar_res;
    Button valorar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        tv_nombreRes = findViewById(R.id.tv_nombreRes);
        tv_descripcionRes = findViewById(R.id.tv_descripcionRes);
        tv_direccionRes= findViewById(R.id.tv_direccionRes);
        iv_imagenRes = findViewById(R.id.iv_imagenRes);
        rtBar_res = findViewById(R.id.rtBar_res);
        valorar = findViewById(R.id.button);

        Intent recibo = getIntent();
        Bundle b = recibo.getExtras();

        if(b!=null){
            tv_nombreRes.setText(b.getString("Nombre"));
            tv_descripcionRes.setText(b.getString("Descripcion"));
            tv_direccionRes.setText(b.getString("Dirtel"));
            iv_imagenRes.setImageResource(b.getInt("Imagen"));

        }

        final int posicion = b.getInt("posicion");

        valorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guardar = new Intent(getApplicationContext(), Mostrar.class);
                guardar.putExtra("calificacion", rtBar_res.getRating());
                guardar.putExtra("posicion", posicion);
                finish();
            }
        });
    }


    public void valorar(View view) {
    }
}




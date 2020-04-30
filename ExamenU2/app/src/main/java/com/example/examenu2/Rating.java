package com.example.examenu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Rating extends AppCompatActivity {

    TextView txVwNombre, txVwDescripcion, txVwDirtel;
    ImageView imgVwFoto;
    RatingBar rtBarR;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        txVwNombre = findViewById(R.id.txVwNombre);
        txVwDescripcion = findViewById(R.id.txVwDescripcion);
        txVwDirtel = findViewById(R.id.txVwDirtel);
        imgVwFoto = findViewById(R.id.imgVwRating);
        rtBarR = findViewById(R.id.ratingBar);
        btnOk = findViewById(R.id.btnOk);


        Intent recibo = getIntent();
        Bundle b = recibo.getExtras();

        if(b!=null){
            txVwNombre.setText(b.getString("Nombre"));
            txVwDescripcion.setText(b.getString("Descripcion"));
            txVwDirtel.setText(b.getString("Dirtel"));
            imgVwFoto.setImageResource(b.getInt("Imagen"));

        }

        final int posicion = b.getInt("posicion");

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guardar = new Intent(getApplicationContext(), Mostrar.class);
                guardar.putExtra("calificacion", rtBarR.getRating());
                guardar.putExtra("posicion", posicion);
               finish();
            }
        });
    }
}

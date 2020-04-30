package com.example.examenu2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adaptador2 extends ArrayAdapter<Restaurantes> {
    private Restaurantes[] objects;
    private Context context;
    private int resource;


    public Adaptador2(@NonNull Context context, int resource, @NonNull Restaurantes[] objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if(convertView == null){
            convertView = ((Activity)context).getLayoutInflater().inflate(resource, parent, false);
        }

        ImageView iv_imagen = convertView.findViewById(R.id.imgVwImagen);
        TextView tv_nombre = convertView.findViewById(R.id.txVwName);
        TextView tv_descripcion = convertView.findViewById(R.id.txVwDesc);
        TextView tv_direccion = convertView.findViewById(R.id.txVwDirtel);
        RatingBar barra = convertView.findViewById(R.id.rtBar);

        if(objects[position]==null){

        }else {
            iv_imagen.setImageResource(objects[position].getImagen());
            tv_nombre.setText(objects[position].getNombre());
            tv_descripcion.setText(objects[position].getDescripcion());
            tv_direccion.setText(objects[position].getDireccion());
            barra.setRating(objects[position].getCalificacion());
        }

        return convertView;}


}

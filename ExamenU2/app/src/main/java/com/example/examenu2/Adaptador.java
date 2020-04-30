package com.example.examenu2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adaptador extends ArrayAdapter<Imagenes> {
    Imagenes[] objects;
    Context context;
    int resource;

    public Adaptador(@NonNull Context context, int resource, @NonNull Imagenes[] objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {

            convertView = ((Activity)context).getLayoutInflater().inflate(resource,parent, false);


        }


        ImageView iv_imagenes;
        iv_imagenes= convertView.findViewById(R.id.iv_imagenes);
        iv_imagenes.setImageResource(objects[position].getImagen());




        return convertView;}




}

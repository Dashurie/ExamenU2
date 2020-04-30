package com.example.examenu2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class AdaptadorBase extends BaseAdapter {
    private Context context;
    private List<Restaurantes> restaurantesLista;
    private int resource;

    public AdaptadorBase(Context context, List<Restaurantes> restaurantesLista) {
        this.context = context;
        this.resource = resource;
        this.restaurantesLista = restaurantesLista;

    }

    @Override
    public int getCount() {
        return restaurantesLista.size();
    }

    @Override
    public Object getItem(int position) {
        return restaurantesLista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
           LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
           convertView = layoutInflater.inflate(R.layout.layout_restaurantes, null);
        }
        ImageView iv_imagen = convertView.findViewById(R.id.imgVwImagen);
        TextView tv_nombre = convertView.findViewById(R.id.txVwName);
        TextView tv_descripcion = convertView.findViewById(R.id.txVwDesc);
        TextView tv_direccion = convertView.findViewById(R.id.txVwDirtel);
        RatingBar barra = convertView.findViewById(R.id.rtBar);

        iv_imagen.setImageResource(restaurantesLista.get(position).getImagen());
        tv_nombre.setText(restaurantesLista.get(position).getNombre());
        tv_descripcion.setText(restaurantesLista.get(position).getDescripcion());
        tv_direccion.setText(restaurantesLista.get(position).getDireccion());
        barra.setNumStars(3);
        barra.setRating(restaurantesLista.get(position).getCalificacion());

        return convertView;
    }




}

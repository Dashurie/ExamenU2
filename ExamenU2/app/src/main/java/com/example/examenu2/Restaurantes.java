package com.example.examenu2;

public class Restaurantes {
    private String nombre, descripcion, direccion;
    private int imagen;
    private float calificacion;

    public Restaurantes(String nombre, String descripcion, String direccion, int imagen, float calificacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.imagen = imagen;
        this.calificacion = calificacion;
    }


    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getImagen() {
        return imagen;
    }
    public float getCalificacion() {
        return calificacion;
    }


}

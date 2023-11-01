package com.example.apptienda;

import java.io.Serializable;

//Que hace "implements Serializable"???
public class CProduct implements Serializable {
    private int imagen;
    private String nombre;
    private float precio;
    private String descripcion;

    public CProduct(int imagen, String nombre, float precio, String descripcion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package com.example.apptienda;

public class CProducto {
    public static class Producto {
        int imagen;
        /*para setear, en una view, la imagen guardada en esta variable, se haria de la siguiente manera:
        imageView.setImageResource(R.drawable.pan);*/

        String nombre;
        int precio;

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

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }
    }


}

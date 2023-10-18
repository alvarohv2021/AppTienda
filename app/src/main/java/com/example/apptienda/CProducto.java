package com.example.apptienda;

import android.os.Parcel;
import android.os.Parcelable;

public class CProducto implements Parcelable {
    private String nombre;
    private int precio;

    public CProducto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Implementa el constructor Parcelable
    protected CProducto(Parcel in) {
        nombre = in.readString();
        precio = in.readInt();
    }

    // Implementa el método writeToParcel para escribir los datos en el Parcel
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(precio);
    }

    // Implementa el método describeContents
    @Override
    public int describeContents() {
        return 0;
    }

    // Agrega un Creator para Parcelable
    public static final Parcelable.Creator<CProducto> CREATOR = new Parcelable.Creator<CProducto>() {
        @Override
        public CProducto createFromParcel(Parcel in) {
            return new CProducto(in);
        }

        @Override
        public CProducto[] newArray(int size) {
            return new CProducto[size];
        }
    };

    // Getter y Setter de los atributos nombre y precio
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    // Resto de la clase...
}

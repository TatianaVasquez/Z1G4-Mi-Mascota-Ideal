package com.example.mascota1;

public class Mascota {

    //Atributos
    private String nombre, direccion, foto, url, comentario;
    private int telefono;
    private float valoracion;

    //constructor

    public Mascota() {
        //constructor vacio
    }

    public Mascota(String nombre, String direccion, String url, String comentario, int telefono, float valoracion) {
        //constructor que pide todos los datos
        this.nombre = nombre;
        this.direccion = direccion;
        this.url = url;
        this.comentario = comentario;
        this.telefono = telefono;
        this.valoracion = valoracion;
    }

    //metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", foto='" + foto + '\'' +
                ", url='" + url + '\'' +
                ", comentario='" + comentario + '\'' +
                ", telefono=" + telefono +
                ", valoracion=" + valoracion +
                '}';
    }

}

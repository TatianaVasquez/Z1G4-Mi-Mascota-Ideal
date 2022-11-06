package com.example.mascota1;

public class Mascota {

    //Atributos
    private String nombre, direccion, foto, url, comentario;
    private GeoPunto posicion;
    private int telefono;
    private float valoracion;
    private double longitud, latitud;
    private TipoLugar tipo;

    //constructor

    public Mascota() {
        //constructor vacio
    }

    public Mascota(String nombre, String direccion, String comentario, int telefono, float valoracion, double longitud, double latitud, TipoLugar tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.comentario = comentario;
        this.telefono = telefono;
        this.valoracion = valoracion;
        this.longitud = longitud;
        this.latitud = latitud;
        this.tipo = tipo;
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

    public GeoPunto getPosicion() {
        return posicion;
    }

    public void setPosicion(GeoPunto posicion) {
        this.posicion = posicion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public TipoLugar getTipo() {
        return tipo;
    }

    public void setTipo(TipoLugar tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", foto='" + foto + '\'' +
                ", url='" + url + '\'' +
                ", comentario='" + comentario + '\'' +
                ", posicion=" + posicion +
                ", telefono=" + telefono +
                ", valoracion=" + valoracion +
                ", longitud=" + longitud +
                ", latitud=" + latitud +
                ", tipo=" + tipo +
                '}';
    }

}

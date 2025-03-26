/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Libro {
    // ATRIBUTOS
    private String titulo;
    private ArrayList<String> autores;
    private double precio;
    private String ISBN;
    private int cantidad;


    // CONSTRUCTOR
    public Libro(String titulo, ArrayList<String> autores, double precio, String ISBN, int cantidad) {
        this.titulo = titulo;
        this.autores = autores;
        this.precio = precio;
        this.ISBN = ISBN;
        this.cantidad = cantidad;
    }

    // GETTERS
    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public double getPrecio() {
        return precio;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getCantidad() {
        return cantidad;
    }

    // SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // TO STRING

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autores=" + autores + ", precio=" + precio + ", ISBN=" + ISBN + ", cantidad=" + cantidad + '}';
    }

    // HASHCODE ()
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    // EQUALS ()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.titulo, other.titulo);
    }

}

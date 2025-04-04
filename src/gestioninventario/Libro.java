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
    private int cantidadEnInventario;

    // CONSTRUCTOR
    public Libro(String titulo, ArrayList<String> autores, double precio, int cantidadEnInventario, String ISBN) {
        this.titulo = titulo;
        this.autores = autores;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
        this.ISBN = ISBN;
    }

    // GETTERS & SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    // HASHCODE
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    // TO STRING (por si lo necesitamos en algun caso)
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autores=" + autores + ", precio=" + precio + ", ISBN=" + ISBN + ", cantidadEnInventario=" + cantidadEnInventario + '}';
    }
}

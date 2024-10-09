package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    private String id;

    @Column
    private String titulo;

    @Column
    private String autor;

    @Column
    private Date fechaLanzamiento;

    public Pelicula() {

    }
    public Pelicula(String id, String titulo, String autor, Date fechaLanzamiento) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }


}

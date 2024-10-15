package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 50, unique = true, nullable = false)
    private String titulo;

    @Column(name = "autor", length = 50, nullable = false)
    private String autor;

    @Column(name = "fechaLanzamiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaLanzamiento;

    public Pelicula() {

    }
    public Pelicula(String titulo, String autor, Date fechaLanzamiento) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Long getId() {
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

    public void setId(Long id) {
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

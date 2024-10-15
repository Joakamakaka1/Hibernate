package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "director")
public class Director {

    @Id
    private String dni;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellidos", length = 50, nullable = false)
    private String apellidos;
    @Column(name = "edad", nullable = false)
    private int edad;
    @Column(name = "telefono", length = 13, nullable = false)
    private String telefono;

    @OneToOne(mappedBy = "director", fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cine")
    private Cine cine;

    public Director(){

    }

    public Director(String dni, String nombre, String apellidos, int edad, String telefono, Cine cine) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.cine = cine;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}

package org.example.instuto;

import jakarta.persistence.*;

@Entity(name = "directorGeneral")
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
    @Column(name = "telefono", unique = true, length = 13, nullable = false)
    private String telefono;

    @OneToOne(mappedBy = "director" , fetch = FetchType.LAZY)
    @JoinColumn(name = "id_instituto")
    private Instituto instituto;

    public Director(){

    }

    public Director(String dni, String nombre, String apellidos, int edad, String telefono, Instituto instituto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.instituto = instituto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
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

}

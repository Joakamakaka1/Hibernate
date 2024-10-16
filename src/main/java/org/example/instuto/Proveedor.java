package org.example.instuto;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    @Column(name = "telefono", length = 50, unique = true, nullable = false)
    private String telefono;

    @Column(name = "email", length = 50, unique = true, nullable = false)
    private String email;

    @ManyToMany(mappedBy = "proveedor", fetch = FetchType.LAZY)
    private List<Instituto> instituto;

    public Proveedor() {

    }

    public Proveedor(Long id, String nombre, String direccion, String telefono, String email, List<Instituto> instituto) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.instituto = instituto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Instituto> getInstituto() {
        return instituto;
    }

    public void setInstituto(List<Instituto> instituto) {
        this.instituto = instituto;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

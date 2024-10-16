package org.example.instuto;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "instituto")
public class Instituto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50, unique = true, nullable = false)
    private String nombre;
    @Column(name = "capacidad", nullable = false)
    private int capacidad;

    // Cuando se inserte un objeto de tipo instituo se va a insertar tambien el objeto de tipo director
    @OneToOne(cascade = CascadeType.PERSIST , fetch = FetchType.LAZY)
    @JoinColumn(name = "id_director")
    private Director director;

    @OneToMany(mappedBy = "instituto" , fetch = FetchType.LAZY)
    List<Departamento> departamento;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_inspector")
    private Inspector inspector;

    @ManyToMany(cascade = CascadeType.PERSIST , fetch = FetchType.LAZY)
    @JoinTable(name = "instituto_proveedor", joinColumns = @JoinColumn(name = "id_instituto"), inverseJoinColumns = @JoinColumn(name = "id_proveedor"))
    private List<Proveedor> proveedor;

    public Instituto() {

    }

    public Instituto(Long id, String nombre, int capacidad, Director director, List<Departamento> departamento, Inspector inspector, List<Proveedor> proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.director = director;
        this.departamento = departamento;
        this.inspector = inspector;
        this.proveedor = proveedor;
    }

    public List<Proveedor> getProveedor() {
        return proveedor;
    }

    public void setProveedor(List<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public List<Departamento> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(List<Departamento> departamento) {
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

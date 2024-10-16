package org.example.instuto;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "inspector")
public class Inspector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column (name = "apellidos", length = 50, nullable = false)
    private String telefono;

    @OneToMany(mappedBy = "inspector", fetch = FetchType.LAZY)
    private List<Instituto> instituto;

    public Inspector() {

    }

    public Inspector(Long id, String nombre, String apellidos, List<Instituto> instituto) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = apellidos;
        this.instituto = instituto;
    }

    public Long getId() {
        return id;
    }

    public List<Instituto> getInstituto() {
        return instituto;
    }

    public void setInstituto(List<Instituto> instituto) {
        this.instituto = instituto;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

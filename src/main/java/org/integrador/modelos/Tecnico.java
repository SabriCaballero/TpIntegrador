package org.integrador.modelos;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private List<Especialidad> especialidades;

    @OneToMany(mappedBy = "tecnicoAsignado", cascade = CascadeType.ALL)
    private List<Incidente> incidentesAsignados;

    // Otros atributos y Getters/Setters
}
package org.integrador.modelos;

import javax.persistence.*;
import java.util.*;

@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    @ManyToMany(mappedBy = "especialidades")
    private List<Tecnico> tecnicos;

}

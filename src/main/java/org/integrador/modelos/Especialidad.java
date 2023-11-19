package org.integrador.modelos;

import javax.persistence.*;

@Entity
public class Especialidad {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
<<<<<<< HEAD

    public Especialidad(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    @ManyToMany(mappedBy = "especialidades")
=======
    
   // @ManyToMany(mappedBy = "especialidades")
>>>>>>> cf73332360c57dc639cd65666104016f6af43847
    private List<Tecnico> tecnicos;
}

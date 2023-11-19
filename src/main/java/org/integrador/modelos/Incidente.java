package org.integrador.modelos;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Incidente {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String tipoProblema;
    
    private String descripcion;
    
    private Date tiempoResolucion;
    public enum Estado {
        PENDIENTE,
        RESUELTO
    }
    private Estado estadoIncidente;

<<<<<<< HEAD
    private boolean esComplejo;
    
    private int colchonHoras;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
=======
   // @ManyToOne
   // @JoinColumn(name = "cliente_id")
>>>>>>> cf73332360c57dc639cd65666104016f6af43847
    private Cliente cliente;

  //  @ManyToOne
   // @JoinColumn(name = "tecnico_id")
    private Tecnico tecnicoAsignado;

<<<<<<< HEAD
    public Long getId() {
        return id;
    }

    public Incidente(Long id, String tipoProblema, String descripcion, Date tiempoResolucion, org.example.modelos.Incidente.Estado estadoIncidente, Cliente cliente, Tecnico tecnicoAsignado, Operador operador) {
        this.id = id;
        this.tipoProblema = tipoProblema;
        this.descripcion = descripcion;
        this.tiempoResolucion = tiempoResolucion;
        this.estadoIncidente = estadoIncidente;
        this.cliente = cliente;
        this.tecnicoAsignado = tecnicoAsignado;
        this.operador = operador;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getTiempoResolucion() {
        return tiempoResolucion;
    }

    public void setTiempoResolucion(Date tiempoResolucion) {
        this.tiempoResolucion = tiempoResolucion;
    }

    public org.example.modelos.Incidente.Estado getEstadoIncidente() {
        return estadoIncidente;
    }

    public void setEstadoIncidente(org.example.modelos.Incidente.Estado estadoIncidente) {
        this.estadoIncidente = estadoIncidente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    @ManyToOne
    @JoinColumn(name = "operador_id")
=======
   // @ManyToOne
   // @JoinColumn(name = "operador_id")
>>>>>>> cf73332360c57dc639cd65666104016f6af43847
    private Operador operador;
}

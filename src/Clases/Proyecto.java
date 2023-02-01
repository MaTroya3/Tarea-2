/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;

/**
 * Nombre: Marlyn Troya 
 * GRUPO ACOSTA EMPRESA DE CONSULTORÍA AMBIENTAL
 */
public class Proyecto {
    public int idProyecto;
    public String codigo;
    public String descripcion;
    public String Informacion;
    public AntiguoCliente Antiguocliente;
    public NuevoCliente Nuevocliente;
    public EstadoProyecto[] estados = new EstadoProyecto[2];

    public Proyecto() { //constructor vacio
    }
    
    // constructor sobrecargado
    public Proyecto(int idProyecto, String codigo, String descripcion, String Informacion, AntiguoCliente AntiguoCliente,
            NuevoCliente Nuevocliente) {
        this.idProyecto = idProyecto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.Informacion = Informacion;
        this.Antiguocliente = AntiguoCliente;
        this.Nuevocliente = Nuevocliente;
        // cuando cree el paquete se creará el estado inicial
        CrearEstados();
    }
    
    public void CrearEstados(){
        this.estados[0] = new EstadoProyecto(0,"Creación", new Date());
        this.estados[1] = new EstadoProyecto(0,"Finalización", new Date());
     
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInformacion() {
        return Informacion;
    }
    }
    //agregado

    public Nuevocliente getNuevoCliente() {
        return Nuevocliente;
    }
    public AntiguoCliente getAntiguoCliente() {
        return Nuevocliente;
    }

    public EstadoProyecto[] getEstados() {
        return estados;
    }

    

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setInformacion(String Informacion) {
        this.Informacion = Informacion;
    }

    public void setAntiguocliente(AntiguoCliente Antiguocliente) {
        this.Antiguocliente = AntiguoCliente;
    }
    public void setCliente(NuevoCliente NuevoCliente) {
        this.NuevoCliente = NuevoCliente;
    }
    public void setEstados(EstadoProyecto[] estados) {
        this.estados = estados;
    }

    
    @Override
    public String toString() {
        return "Proyecto{" + "idProyecto=" + idProyecto + ", codigo=" + codigo + ", descripcion=" + descripcion + ", Informacion=" + Informacion + ", estados=" + estados + '}';

}

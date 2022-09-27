/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baquiax.universidad.modelo.entidades;

import java.io.Serializable;

/**
 *
 * @author luis
 */
public class Profesor implements Serializable{

    private String colegiado;
    private String carne;
    private String nombre;
    private String apellido;
    private String correo;

    /**
     *
     * @param colegiado
     * @param carne
     * @param nombre
     * @param apellido
     * @param correo
     */
    public Profesor(String colegiado, String carne, String nombre, String apellido, String correo) {
        this.colegiado = colegiado;
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    /**
     * @return the colegiado
     */
    public String getColegiado() {
        return colegiado;
    }

    /**
     * @param colegiado the colegiado to set
     */
    public void setColegiado(String colegiado) {
        this.colegiado = colegiado;
    }

    /**
     * @return the carne
     */
    public String getCarne() {
        return carne;
    }

    /**
     * @param carne the carne to set
     */
    public void setCarne(String carne) {
        this.carne = carne;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}

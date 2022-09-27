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
public class Estudiante implements Serializable {

    private String carne;
    private String nombre;
    private String apellido;
    private String correo;

    /**
     * Para crear un estudiante en la BD
     *
     * @param carne
     * @param nombre
     * @param apellido
     * @param correo
     */
    public Estudiante(String carne, String nombre, String apellido, String correo) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    /**
     * @return the carne
     */
    public String getCarne() {
        return carne;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

}

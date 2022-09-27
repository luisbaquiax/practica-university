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
public class Asignacion implements Serializable{

    private int id;
    private String carneEstudiante;
    private String codigoCurso;
    private String fecha;
    private int nota;
    private boolean estado;
    private int oportunidad;

    /**
     * Para recuperar informacion de la tabla asigancion
     *
     * @param id
     * @param carneEstudiante
     * @param codigoCurso
     * @param fecha
     * @param nota
     * @param estado
     * @param oportunidad
     */
    public Asignacion(int id, String carneEstudiante, String codigoCurso, String fecha, int nota, boolean estado, int oportunidad) {
        this.id = id;
        this.carneEstudiante = carneEstudiante;
        this.codigoCurso = codigoCurso;
        this.fecha = fecha;
        this.nota = nota;
        this.estado = estado;
        this.oportunidad = oportunidad;
    }

    /**
     * Para crear un asigación
     *
     * @param carneEstudiante
     * @param codigoCurso
     * @param fecha
     * @param nota
     * @param estado
     * @param oportunidad
     */
    public Asignacion(String carneEstudiante, String codigoCurso, String fecha, int nota, boolean estado, int oportunidad) {
        this.carneEstudiante = carneEstudiante;
        this.codigoCurso = codigoCurso;
        this.fecha = fecha;
        this.nota = nota;
        this.estado = estado;
        this.oportunidad = oportunidad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the carneEstudiante
     */
    public String getCarneEstudiante() {
        return carneEstudiante;
    }

    /**
     * @return the codigoCurso
     */
    public String getCodigoCurso() {
        return codigoCurso;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @return the oportunidad
     */
    public int getOportunidad() {
        return oportunidad;
    }

}

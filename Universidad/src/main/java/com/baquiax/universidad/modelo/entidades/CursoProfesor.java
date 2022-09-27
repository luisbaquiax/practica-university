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
public class CursoProfesor implements Serializable{

    private String colegiado;
    private String codigoCurso;

    public CursoProfesor(String colegiado, String codigoCurso) {
        this.colegiado = colegiado;
        this.codigoCurso = codigoCurso;
    }

    /**
     * @return the colegiado
     */
    public String getColegiado() {
        return colegiado;
    }

    /**
     * @return the codigoCurso
     */
    public String getCodigoCurso() {
        return codigoCurso;
    }

}

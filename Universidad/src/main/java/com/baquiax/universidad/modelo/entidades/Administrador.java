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
public class Administrador implements Serializable{

    private String codigo;
    private String password;

    /**
     *
     * @param codigo
     * @param password
     */
    public Administrador(String codigo, String password) {
        this.codigo = codigo;
        this.password = password;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

}

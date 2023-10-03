/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.util.List;

/**
 *
 * @author niqog
 */
public class Brigada {
    
    private String clave;
    private int codBrigada;
    private String especialidad;
    private List <Bombero> bomberos;

    public Brigada(String clave, int codBrigada, String especialidad, List<Bombero> bomberos) {
        this.clave = clave;
        this.codBrigada = codBrigada;
        this.especialidad = especialidad;
        this.bomberos = bomberos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Bombero> getBomberos() {
        return bomberos;
    }

    public void setBomberos(List<Bombero> bomberos) {
        this.bomberos = bomberos;
    }
 
    
}

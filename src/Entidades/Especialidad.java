/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Lucas E. Sayago
 */
public enum Especialidad {

    INCENDIOS("Incendios en viviendas e industrias"),
    DERRUMBES("Salvamento en derrumbes"),
    RESCATE_MONTAÑA("Rescates en ámbito montaña"),
    RESCATE_TRAFICO("Rescate de personas atrapadas en accidentes de tráfico"),
    INUNDACIONES("Socorrer inundaciones"),
    PREVENCION("Operativos de prevención");

    private final String descripcion;

    Especialidad(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}

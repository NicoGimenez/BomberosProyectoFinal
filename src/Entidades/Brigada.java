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
    
    private String nombre_br;
    private int codBrigada;
    private String especialidad;
    private List <Bombero> bomberos;
    private boolean libre;
    private int codCuartel;
    
    public Brigada() {
    }

    public Brigada(String nombre_br, String especialidad, List<Bombero> bomberos, boolean libre, int codCuartel) {
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.bomberos = bomberos;
        this.libre = libre;
        this.codCuartel = codCuartel;
    }

    public Brigada(String nombre_br, int codBrigada, String especialidad, List<Bombero> bomberos, boolean libre, int codCuartel) {
        this.nombre_br = nombre_br;
        this.codBrigada = codBrigada;
        this.especialidad = especialidad;
        this.bomberos = bomberos;
        this.libre = libre;
        this.codCuartel = codCuartel;
    }

    public String getNombre_br() {
        return nombre_br;
    }

    public void setNombre_br(String nombre_br) {
        this.nombre_br = nombre_br;
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

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }
    
    

}

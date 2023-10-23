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
    private Especialidad tipo;
    private List <Bombero> bomberos;
    private boolean libre;
    private int codCuartel;
    private boolean activo;
    
    public Brigada() {
    }

    public Brigada(String nombre_br, Especialidad tipo, List<Bombero> bomberos, boolean libre, int codCuartel) {
        this.nombre_br = nombre_br;
        this.tipo = tipo;
        this.bomberos = bomberos;
        this.libre = libre;
        this.codCuartel = codCuartel;
    }

    public Brigada(String nombre_br, int codBrigada, Especialidad tipo, List<Bombero> bomberos, boolean libre, int codCuartel,boolean activo) {
        this.nombre_br = nombre_br;
        this.codBrigada = codBrigada;
        this.tipo = tipo;
        this.bomberos = bomberos;
        this.libre = libre;
        this.codCuartel = codCuartel;
        this.activo=activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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

  

    public Especialidad getTipo() {
        return tipo;
    }

    public void setTipo(Especialidad tipo) {
        this.tipo = tipo;
    }
  @Override
    public String toString() {
        return "Brigada{" + "nombre_br=" + nombre_br + ", codBrigada=" + codBrigada + ", especialidad=" + tipo + ", bomberos=" + bomberos + ", libre=" + libre + ", codCuartel=" + codCuartel + ", activo=" + activo + '}';
    }
   

}

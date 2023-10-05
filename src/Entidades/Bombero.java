
package Entidades;

import java.time.LocalDate;

/*
 * @author Enzo
 */
public class Bombero{
    
    private int cod_bombero;
    private int dni;
    private String nombre;
    private String grupo_sanguineo;
    private LocalDate fechaNac;
    private int codigoDeBrigada;
    private int celular;
    private boolean activo;
    
    
    public Bombero(){    
    }

    public Bombero(int dni, String nombre, String grupo_sanguineo, LocalDate fechaNac, int codigoDeBrigada, int celular, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.grupo_sanguineo = grupo_sanguineo;
        this.fechaNac = fechaNac;
        this.codigoDeBrigada = codigoDeBrigada;
        this.celular = celular;
        this.activo = activo;
    }

    public int getCod_bombero() {
        return cod_bombero;
    }

    public void setCod_bombero(int cod_bombero) {
        this.cod_bombero = cod_bombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getCodigoDeBrigada() {
        return codigoDeBrigada;
    }

    public void setCodigoDeBrigada(int codigoDeBrigada) {
        this.codigoDeBrigada = codigoDeBrigada;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "cod_bombero=" + cod_bombero + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", codigoDeBrigada=" + codigoDeBrigada + ", activo=" + activo + '}';
    }
    

    
    public Bombero(int cod_bombero, int dni, String nombre, String grupo_sanguineo, LocalDate fechaNac, int codigoDeBrigada, int celular, boolean activo) {
        this.cod_bombero = cod_bombero;
        this.dni = dni;
        this.nombre = nombre;
        this.grupo_sanguineo = grupo_sanguineo;
        this.fechaNac = fechaNac;
        this.codigoDeBrigada = codigoDeBrigada;
        this.celular = celular;
        this.activo = activo;
    }

    
    
    public void actualizarDatos(int dni, String nombre, String cod_bombero, LocalDate fechaNac, int nro) {
    this.dni = dni;
    this.nombre = nombre;
    this.grupo_sanguineo = cod_bombero;
    this.fechaNac = fechaNac;
    this.celular = nro;
}

    public void BajaPorInactividad() {
        activo = false;
    }
    
}




package Entidades;

import java.time.LocalDate;

/*
 * @author Lucas E. Sayago
 */
public class Siniestro {
    private int codigo;
    private Especialidad tipo;
    private LocalDate fecha_siniestro;
    private int coord_x;
    private int coord_Y;
    private String detalles;
    private LocalDate fecha_resol;
    private int puntuacion;
    private int codBrigada;

    public Siniestro() {
    }

    public Siniestro(Especialidad tipo, LocalDate fecha_siniestro, int coord_x, int coord_Y, String detalles) {
        this.tipo = tipo;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_x = coord_x;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
    }

    public Siniestro(Especialidad tipo, LocalDate fecha_siniestro, int coord_x, int coord_Y, String detalles, LocalDate fecha_resol, int puntuacion, int codBrigada) {
        this.tipo = tipo;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_x = coord_x;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fecha_resol = fecha_resol;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }
    

    public Siniestro(int codigo, Especialidad tipo, LocalDate fecha_siniestro, int coord_x, int coord_Y, String detalles, LocalDate fecha_resol, int puntuacion, int codBrigada) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_x = coord_x;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fecha_resol = fecha_resol;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Especialidad getTipo() {
        return tipo;
    }

    public void setTipo(Especialidad tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha_siniestro() {
        return fecha_siniestro;
    }

    public void setFecha_siniestro(LocalDate fecha_siniestro) {
        this.fecha_siniestro = fecha_siniestro;
    }

    public int getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(int coord_x) {
        this.coord_x = coord_x;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(int coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFecha_resol() {
        return fecha_resol;
    }

    public void setFecha_resol(LocalDate fecha_resol) {
        this.fecha_resol = fecha_resol;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", tipo=" + tipo + ", fecha_siniestro=" + fecha_siniestro + ", coord_x=" + coord_x + ", coord_Y=" + coord_Y + ", detalles=" + detalles + ", fecha_resol=" + fecha_resol + ", puntuacion=" + puntuacion + ", codBrigada=" + codBrigada;
    }

   
}

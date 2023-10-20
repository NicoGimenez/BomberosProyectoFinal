package Entidades;

/*
 * @author Lucas E. Sayago
 */
public class Cuartel {

    private int codigoCuartel;
    private String nombreDeCuartel;
    private String direccion;
    private int coordenadaEnX;
    private int coordenadaEnY;
    private String telefono;
    private String correo;
    private boolean activo;

    public Cuartel() {
    }

    public Cuartel(int codigoCuartel, String nombreDeCuartel, String direccion, int coordenadaEnX, int coordenadaEnY, String telefono, String correo, boolean activo) {
        this.codigoCuartel = codigoCuartel;
        this.nombreDeCuartel = nombreDeCuartel;
        this.direccion = direccion;
        this.coordenadaEnX = coordenadaEnX;
        this.coordenadaEnY = coordenadaEnY;
        this.telefono = telefono;
        this.correo = correo;
        this.activo = activo;
    }

    public Cuartel(String nombreDeCuartel, String direccion, int coordenadaEnX, int coordenadaEnY, String telefono, String correo, boolean activo) {
        this.nombreDeCuartel = nombreDeCuartel;
        this.direccion = direccion;
        this.coordenadaEnX = coordenadaEnX;
        this.coordenadaEnY = coordenadaEnY;
        this.telefono = telefono;
        this.correo = correo;
        this.activo = activo;
    }

    public int getCodigoCuartel() {
        return codigoCuartel;
    }

    public void setCodigoCuartel(int codigoCuartel) {
        this.codigoCuartel = codigoCuartel;
    }

    public String getNombreDeCuartel() {
        return nombreDeCuartel;
    }

    public void setNombreDeCuartel(String nombreDeCuartel) {
        this.nombreDeCuartel = nombreDeCuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCoordenadaEnX() {
        return coordenadaEnX;
    }

    public void setCoordenadaEnX(int coordenadaEnX) {
        this.coordenadaEnX = coordenadaEnX;
    }

    public int getCoordenadaEnY() {
        return coordenadaEnY;
    }

    public void setCoordenadaEnY(int coordenadaEnY) {
        this.coordenadaEnY = coordenadaEnY;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    public double distanciaAlSiniestro(Siniestro siniestro) {
        
        //usamos el teorema de pitagoras para sacar la distancias entre dos puntos en el plano
        double distancia = Math.sqrt(Math.pow(siniestro.getCoord_x() - coordenadaEnX, 2) + Math.pow(siniestro.getCoord_Y() - coordenadaEnY, 2));

        return distancia;
        
    }

    @Override
    public String toString() {
        return " Nombre: " + nombreDeCuartel ;
    }

}

package Entidades;

import AccesoADatos.BomberoData;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainTest {

    public static void main(String[] args) {

        BomberoData bData = new BomberoData();
        
        Bombero bombero = new Bombero(37000000, "Bombita Explo", "A+", LocalDate.of(1990, Month.MARCH, 23),21    ,01114565, true);
        
        //1 ++++++++++++++++++++++++++++++ Agregar Bombero (funciona)

        // se Agrega el bombero a la base de datos.

        bData.agregarBombero(bombero);
        JOptionPane.showMessageDialog(null, bombero.toString());
        
        
        //2++++++++++++++++++++++++++++++Buscar Bombero por ID (Funciona)
        /*
        Bombero bombero2= new Bombero();
        
        bombero2= bData.obtenerBomberoPorCodigo(1);
        JOptionPane.showMessageDialog(null, bombero2.toString());
         */
         
         //3++++++++++++++++++++++++++++++ listar bomberos
         
         ArrayList<Bombero> bomberos = new  ArrayList<>();
                 bomberos=(ArrayList<Bombero>) bData.obtenerTodosLosBomberos();
         
                 for (Bombero bombero1 : bomberos) {
                     System.out.println(bombero1.toString());
        }
         
    }

}

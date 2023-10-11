package Entidades;

import AccesoADatos.BomberoData;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MainTest {

    public static void main(String[] args) {

        BomberoData bData = new BomberoData();

        //Bombero bombero = new Bombero("787", "Piro 9", "B+", LocalDate.of(1984, Month.MARCH, 23),8  ,"144155166", true);
        //1 ++++++++++++++++++++++++++++++ Agregar Bombero (funciona DE VERDAD RECONTRA FUNCIONA JE :D)
        //se Agrega el bombero a la base de datos.
       //bData.agregarBombero(bombero);
        //JOptionPane.showMessageDialog(null, bombero.toString());
        //2++++++++++++++++++++++++++++++Buscar Bombero por ID (Funciona)
        /*
        Bombero bombero2= new Bombero();
        
        bombero2= bData.obtenerBomberoPorCodigo(1);
        JOptionPane.showMessageDialog(null, bombero2.toString());
         */
 /*
         //3++++++++++++++++++++++++++++++ listar bomberos FUNCIONANDO
         
         ArrayList<Bombero> bomberos = new  ArrayList<>();
                 bomberos=(ArrayList<Bombero>) bData.obtenerTodosLosBomberos();
         
                 for (Bombero btest : bomberos) {
                     System.out.println(btest.toString());
        }
         */
 /* // 4 ++++++++++++++++++++++++++++++++++ ACTUALIZAR BOMBERO FUNCIONANDO
        Bombero bombero = new Bombero();
        bombero=bData.obtenerBomberoPorCodigo(40);
        bombero.setNombre("Piro");
        bData.actualizarBombero(bombero);
        JOptionPane.showMessageDialog(null,"bombero actualizado");
         */
 
 
     //5*********************************ELIMINAR BOMBERO
    
     //Bombero bombero = new Bombero();
     //bombero=bData.obtenerBomberoPorCodigo(40);
     //bData.darDeBajaBombero(40);
    
    //6********************************listar bomberos 
    
    //List<Bombero> bomberos = bData.listBomberosPorBrigada(28);
    //System.out.println(bomberos.size());
    
    
    }

}

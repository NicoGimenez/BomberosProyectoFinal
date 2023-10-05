package Entidades;

import AccesoADatos.BomberoData;
import java.time.LocalDate;
import java.time.Month;

public class MainTest {

    public static void main(String[] args) {

        BomberoData bData = new BomberoData();
        
        Bombero bombero = new Bombero(37000000, "Bombita Explo", "A+", LocalDate.of(1990, Month.MARCH, 23),21    ,01114565, true);
        System.out.println(bombero.toString());
        // se Agrega el bombero a la base de datos.
       
        
        bData.agregarBombero(bombero);
        

    }

}

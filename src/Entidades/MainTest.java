package Entidades;

import AccesoADatos.BomberoData;
import java.time.LocalDate;
import java.time.Month;

public class MainTest {

    public static void main(String[] args) {

        BomberoData bData = new BomberoData();
        
        Bombero bombero = new Bombero(37000000, "Bombita Explo", "A+", LocalDate.of(1990, Month.MARCH, 23),1 ,01115664565, true);
        
        // se Agrega el bombero a la base de datos.
        bData.agregarBombero(bombero);
        

    }

}

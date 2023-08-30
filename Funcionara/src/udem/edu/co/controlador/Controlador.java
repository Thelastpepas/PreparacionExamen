package udem.edu.co.controlador;

import udem.edu.co.modelo.entidad.Gato;
import udem.edu.co.modelo.entidad.Perro;
import udem.edu.co.modelo.interfac.Animal;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    public static void lista() {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Gato("h", "MESSI",  2, 34) );
        animales.add(new Perro("messi","perro",32,24));
        System.out.printf(animales.toString());
    }
}

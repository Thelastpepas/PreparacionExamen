package udem.edu.co.modelo.entidad;

import udem.edu.co.modelo.clases.Felino;

public class Gato extends Felino {
    private String nombre;
    private String dueño;
    private  int id;

    public Gato(String nombre, String dueño, int id, int edad) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.id = id;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" +
                "\"nombre\": \"" + nombre + "\"," +
                " \"dueño\": \"" + dueño + "\"," +
                " \"id\": " + id + "," +
                " \"edad\": " + edad +
                "}";
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private int edad;


    @Override
    public void mover() {

    }
}

package udem.edu.co.modelo.entidad;

import udem.edu.co.modelo.clases.Canino;

public class Perro extends Canino {


    private String nombre;
    private String dueño;
    private int id;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public Perro(String nombre, String dueño, int id, int edad) {
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

    @Override
    public void mover() {

    }
}

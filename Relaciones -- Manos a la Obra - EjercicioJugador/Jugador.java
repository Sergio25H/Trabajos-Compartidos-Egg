
package Jugador;


import java.util.Scanner;


public class Jugador {
    
    Scanner leer = new Scanner(System.in);
    
    private String Nombre;
    private String Apellido;
    private String Posicion;
    private Integer numero;

    public Jugador() {
    }

    public Jugador(String Nombre, String Apellido, String Posicion, Integer numero) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Posicion = Posicion;
        this.numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "leer=" + leer + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Posicion=" + Posicion + ", numero=" + numero + '}';
    }
    
}

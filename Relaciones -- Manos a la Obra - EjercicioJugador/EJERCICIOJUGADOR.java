package ejercicio.jugador;

import Equipo.Equipo;
import Jugador.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class EJERCICIOJUGADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Realiza un programa en donde exista una clase Jugador que contenga
         * nombre, apellido, posición y número. Luego otra clase Equipo que
         * contenga una colección de jugadores. Una vez hecho esto, desde el
         * main recorreremos el equipo mostrando la información de cada jugador.
         */
        
        Scanner leer = new Scanner(System.in);
        
        
        String resp = "";
        do {

            Jugador jugador1 = new Jugador(); // CARGO DATOS DE JUGADOR
            System.out.println("Ingrese el Nombre del jugador");
            String nombre = leer.next();
            System.out.println("Ingrese el Apellido del jugador");
            String apellido = leer.next();
            System.out.println("Ingrese la Posición del jugador");
            String posicion = leer.next();
            System.out.println("Ingrese el número del jugador");
            Integer numero = leer.nextInt();
            jugador1.setNombre(nombre);
            jugador1.setApellido(apellido);
            jugador1.setPosicion(posicion);
            jugador1.setNumero(numero);
            
            ArrayList <Jugador> jugadores = new ArrayList(); // AGREGO EL JUGADOR A LA LISTA
            jugadores.add(jugador1);
            
            Equipo equipo = new Equipo(); // SETEO LA LISTA AL EQUIPO
            equipo.setJugadores(jugadores);

            System.out.println("¿Quieres ingresar otro jugador?");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("si"));
        
        

    }

}

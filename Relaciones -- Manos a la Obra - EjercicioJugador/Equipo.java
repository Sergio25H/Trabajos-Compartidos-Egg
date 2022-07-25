package Equipo;

import Jugador.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equipo {
    
    Scanner leer = new Scanner(System.in);

    ArrayList <Jugador> jugadores = new ArrayList();

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "leer=" + leer + ", jugadores=" + jugadores + '}';
    }
    
    
    
}

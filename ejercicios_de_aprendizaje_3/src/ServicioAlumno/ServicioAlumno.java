package ServicioAlumno;

import Alumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> alumno = new ArrayList(); // Creo una LISTA de tipo Alumno.

    public void crearAlumno() {

        String resp = "";

        do {

            Alumno a1 = new Alumno(); // Creo un OBJETO en cada vuelta, para meterlo en la lista.

            System.out.println("Ingrese nombre del Alumno");
            String nombre = leer.next();
            System.out.println("Ingrese nota 1");
            int nota1 = leer.nextInt();
            System.out.println("Ingrese nota 2");
            int nota2 = leer.nextInt();
            System.out.println("Ingrese nota 3");
            int nota3 = leer.nextInt();

            a1.setNombre(nombre);
            a1.setNota1(nota1);
            a1.setNota2(nota2);
            a1.setNota3(nota3);

            alumno.add(a1); // Agrego el OBJETO lleno a la LISTA.

            System.out.println("¿Quiere ingresar otro Alumno?");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("si"));
    }

    public void notaFinal(ArrayList<Alumno> alumno) { // No estoy pudiendo pasarle los datos de la lista

        System.out.println("Ingrese el nombre del Alumno a calcular nota Final");
        String resp = leer.next();

        for (Alumno aux : alumno) {
            
            System.out.println("Llegan los datos");

            }
        }
    }

//    public Integer promedioNotas(ArrayList<Alumno> alumno) {
//        Integer promedio = 0;
//        for (Alumno alumno1 : alumno) {
//            promedio = (alumno1.getNota1() + alumno1.getNota2() + alumno1.getNota3()) / 3; 
//        }
//        return promedio;
//    }



/*
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 */
package S1Ej5;

/**
 *
 * @author Steven Dual
 */
public class S1Ej5 {
    public static void main(String[] args) {
        System.out.println("\033[31m\t\t\t\tHorario de clases");
        System.out.println("\033[034mFac.\tCod.\tNombre del Curso\tHora\t\t\tAula\tSec.");
        System.out.println("\033[036m0905\t018\tCalculo II\t\tSA.11:00 13:00\t\t1\tA");
        System.out.println("\033[032m0905\t017\tProgramacion II\t\tSA.09:00 11:00\t\t1\tA");
        System.out.println("\033[035m0905\t019\tEstadistica II\t\tSA.16:00 18:00\t\t1\tB");
    }
}

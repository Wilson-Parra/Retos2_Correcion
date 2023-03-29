import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        System.out.println("¡Bienvenido a la competencia de natación!");
        System.out.print("Por favor, ingrese la cantidad de nadadores: ");
        int numNadadores = lea.nextInt();

        String [] nNadador= new String [numNadadores];
        double [] tNadador= new double [numNadadores];
        String noganador="luis";
        double tiGanador=100000000;
        for (int i = 0; i < numNadadores; i++) {
            System.out.println("Datos del nadador " + (i+1) + ":"); 
            System.out.println("Nombre: ");
            nNadador[i] = lea.next();
            System.out.print("Tiempo (en segundos): ");
            tNadador[i] = lea.nextDouble();
            if (tNadador[i] <tiGanador) {
               tiGanador = tNadador[i];
            noganador=nNadador[i];
            }
        }
        for (int j = 0; j < numNadadores; j++) {
            System.out.println("El resumen de la carrera es "+nNadador[j]+" con un tiempo de "+tNadador[j]);
        }

        System.out.println("El ganador de la competencia es  " +noganador+ " con un tiempo de " + tiGanador+ " segundos.");
        
        lea.close();
    }
}
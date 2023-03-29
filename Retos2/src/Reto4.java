import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        int tamano,numero,sumafila,sumacolumna;
        Scanner lec= new Scanner (System.in);
        System.out.println("Ingrese el tamaño que de sea para el sodoku");
        tamano=lec.nextInt();
        int [][] sodoku= new int [tamano][tamano];
       
        for (int j = 0; j < tamano; j++) {
            for (int i = 0; i < tamano; i++) {
                System.out.println("Digite el valor de la Fila "+(j+1)+" columna "+(i+1));
       numero=lec.nextInt();
       sodoku[j][i]=numero;
            }  
        }
        for (int l = 0; l < tamano; l++) {
            for (int w = 0; w < tamano; w++) {
                System.out.print(sodoku[l][w]);
            }
            System.out.println(" ");
        }
        for (int k = 0; k < tamano; k++) {
            sumafila = 0;
            for (int q = 0; q < tamano; q++) {
               sumafila += sodoku[k][q];
            }
            System.out.println("La suma de la fila " + (k+1) + " es: " + sumafila);
         }
         
         for (int i = 0; i < tamano; i++) {
            sumacolumna = 0;
            for (int j = 0; j < tamano; j++) {
               sumacolumna += sodoku[j][i];
            }
            System.out.println("La suma de la columna " + (i+1) + " es: " + sumacolumna);
         }
         lec.close();
    }
}

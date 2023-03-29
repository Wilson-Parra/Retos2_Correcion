import java.util.Scanner;
public class Reto1 {
    
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int cantidad; 
        float nfinal;
        float sumador=0;
        
     System.out.println("Ingresar la cantidad de notas");
     cantidad = lectura.nextInt();
     float notas []= new float[cantidad];


     for (int nt = 0; nt < cantidad; nt++) {
        System.out.print("Ingrese la nota " + (nt+1) + ": ");
        float nota = lectura.nextFloat();
        notas[nt] = nota;
    }

    for (float nota : notas) {
        sumador += nota;
    }

    nfinal= sumador / cantidad;

    if (nfinal < 3) {
        System.out.println("Nota final: " + nfinal + " - Reprobaste");
    } else if (nfinal < 4) {
        System.out.println("Nota final: " + nfinal + " - Pasaste Raspando");
    } else {
        System.out.println("Nota final: " + nfinal + " - Aprobaste con buenos resultados");
    }
    lectura.close();
    }
}
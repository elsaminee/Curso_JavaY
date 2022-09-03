/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

/**
 *
 * @author El Samin
 */

import java.util.Scanner;

public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer nota");
        Float nota1 = sc.nextFloat();
        System.out.println("Ingrese la segunda nota");
        Float nota2 = sc.nextFloat();
        System.out.println("Ingrese la tercer nota");
        Float nota3 = sc.nextFloat();
        System.out.println("Ingrese la cuarta nota");
        Float nota4 = sc.nextFloat();
        
        total = nota1*0.2 + nota2*0.2 + nota3*0.3 + nota4*0.3;
      
        System.out.println("La nota final es de: " + total);
        
        if (total<=60 ) {
            System.out.println("Perdida");
        }else if (total <=70) {
            System.out.println("decente");
        }else if (total<=80) {
            System.out.println("Aceptable");
        }else if (total<=100) {
            System.out.println("Excelente");
        }
        
        
    }
    
}

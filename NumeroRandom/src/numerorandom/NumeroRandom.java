/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerorandom;

/**
 *
 * @author El Samin
 */

import java.util.Scanner;

public class NumeroRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 99999");
        
        float num1 = sc.nextFloat();
        
        if (num1>=0 && num1<10) {
            System.out.println("Tiene 1 digito");
        }else if (num1>0 && num1<100) {
            System.out.println("Tiene 2 digitos");
        }else if (num1>0 && num1<1000) {
            System.out.println("Tiene 3 digitos");
        }else if (num1>0 && num1< 10000) {
            
            System.out.println("Tiene 4 digitos");
        }else if (num1>0 && num1<100000) {
            System.out.println("Tiene 5 digitos");
        }else {
            
            System.out.println("No esta dentro del rango");
        }
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosparnegativo;

import java.util.Scanner;

public class EjerciciosParNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();
        
        int residuo= num1 % 2;
        
        if (residuo == 0) {
            
            System.out.println("Es un numero par");
                      
            
            } else{
                    
                    System.out.println("Es un numero impar");
                    
                    
                    }
        
        
        if (num1 <0) {
                System.out.println("Es negativo");
            }else{
                
                System.out.println("Es positivo");  
            
        }
        
    }
    
}

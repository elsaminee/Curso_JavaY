/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_humano;



import java.util.Scanner;
      

public class Ejercicio_Humano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner edades = new Scanner (System.in);
        System.out.println("Ingrese edad");
        int edad = edades.nextInt();
        
        if (edad<2) {
            
            System.out.println("Es un bebé");
            

        }else if (edad<11) {
            
            System.out.println("Es un niño");
            
        }else if (edad <18) {
            
            System.out.println("Es un adolescente");
            
        }else if (edad <50) {
            System.out.println("Es un adulto");
        }else {
            
            System.out.println("Es un adulto mayor");
            
        }
        
    }
    
}

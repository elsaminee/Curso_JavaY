/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejernumerosenteros;

/**
 *
 * @author El Samin
 */
import java.util.Scanner;

public class EjerNumerosEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");        
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero entero");
        int num2 = sc.nextInt();
        
        if (num1> num2) {
            System.out.println("El numero " +num1 + " es mayor a " + num2);
        } else{
         
            System.out.println("El numero " +num2 + " es mayor a " + num1);
            
        }
        
        
    }
        
        
    
    
}

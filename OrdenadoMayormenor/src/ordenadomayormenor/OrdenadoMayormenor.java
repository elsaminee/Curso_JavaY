/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenadomayormenor;

/**
 *
 * @author El Samin
 */
import java.util.Scanner;

public class OrdenadoMayormenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo1 numero");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = sc.nextInt();
        
        if (num1>=num2 && num2>=num3) {
            
            System.out.println("El orden es: " + num1+ ", "+ num2+" y " +num3);
            
        }else {
            
            if (num1>=num3 && num3>=num2) {
                System.out.println("El orden es: " + num1+ ", "+ num3+" y " +num2);
            } else{
                
                if (num2>=num3 && num3>=num1) {
                    System.out.println("El orden es: " + num2+ ", "+ num3+" y " +num1);
                } else{
                    
                    if (num2>=num1 && num1>=num3) {
                        System.out.println("El orden es: " + num2+ ", "+ num1+" y " +num3);
                    }else{
                        
                        if (num3>=num1 && num1>= num2) {
                            System.out.println("El orden es: " + num3+ ", "+ num1+" y " +num2);
                        } else{
                            
                            if (num3>=num2 && num2>=num1) {
                                System.out.println("El orden es: " + num3+ ", "+ num2+" 3y " +num1);
                                
                            }
                        }
                    }
                }
                
            }
            
        
        }
        
    }
    
}

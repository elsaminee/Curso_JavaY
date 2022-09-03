/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios1;

import java.lang.Math;
import java.util.Scanner;


public class Ejercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double resul;
        double resul2;
                
        double carno= 15.58;
        double pte= 7.5;
        int mascota= 150;
        int collar= 10;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantas piernas de carnotauro comprará");
        int mcarno= sc.nextInt();
        System.out.println("Cuantas piernas de carnotauro comprará");
        int mpte= sc.nextInt();
        System.out.println("Cuantas piernas de carnotauro comprará");
        int mmascota= sc.nextInt();
        System.out.println("Cuantas piernas de carnotauro comprará");
        int mcollar= sc.nextInt();
                     
        
        resul = carno*mcarno+pte*mpte+mascota*mmascota+collar*mcollar;
       
        System.out.println("El total gastado sera:" +resul);
        
       double div= (int)(resul/20);
      
        double resi = resul%20;
       if(resi>0){
       
           resul2 = div+1;
           System.out.println("El total de billetes que se dara sera de: "+ resul2);
                 
                   
       } else {
           
           resul2= div;
           System.out.println("El total de billetes que se dara sera de :"+resul2); 
             
       }
       
       double resultado= 20-resi;
       System.out.println("El cambio que te daran sera de:" + resultado);
       
       
    }
    
}

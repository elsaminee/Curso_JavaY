/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

/**
 *
 * @author El Samin
 */

import java.util.Scanner;

public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float igv;
        float total;
        System.out.println("Cual es tu numbre");
        String nom1 = sc.next();
        
        System.out.println("Se tendran enumerada la facultad en numeros seleccione la deseada");
        System.out.println("1. Ing. de sistemas");
        System.out.println("2. Derecho");
        System.out.println("3.Ing. Naviera");
        System.out.println("4. Ing. Pesquera");
        System.out.println("5. Contabilidad");
        System.out.println("6. Administracion");       
        int fac1 = sc.nextInt();
        
        switch (fac1){
            
            case 1 -> {
                igv = (float) ((350+ 650)*0.18) ;
                total = 350 + 650 + igv;
                System.out.println("El nombre del estudiante "+nom1+" facultad de Ing. de Sistemas");
                System.out.println("El importe de matricula es: 350, mensualidad:650 y su IGV es: " + igv);
                System.out.println("El total es: " +total);
            }
                
                
            case 2 -> {
                igv = (float) ((300+550)*0.18) ;
                total = 300 + 550 + igv;
                System.out.println("El nombre del estudiante "+nom1+" facultad de Derecho");
                System.out.println("El importe de matricula es: 300, Mensualidad: 550 y su IGV es: " + igv);
                System.out.println("El total es: "+total);
            }
                
            case 3 -> {
                igv = (float) ((300+500)*0.18) ;
                total = 300 + 500 + igv;  
                System.out.println("El nombre del estudiante "+nom1+" facultad de Ing.Naviera");
                System.out.println("El importe de matricula es: 300, Mensualidad: 500 y su IGV es: " + igv);
                System.out.println("El total es: "+total);              
            }
            
            case 4 -> {
                igv = (float) ((310+460)*0.18) ;
                total = 310 + 460 + igv;  
                System.out.println("El nombre del estudiante "+nom1+" facultad de Ing.Pesquera");
                System.out.println("El importe de matricula es: 310, Mensualidad: 460 y su IGV es: " + igv);
                System.out.println("El total es: "+total);              
            }
            case 5 -> {
                igv = (float) ((280+490)*0.18) ;
                total = 280 + 490 + igv;  
                System.out.println("El nombre del estudiante "+nom1+" facultad de Contabilidad");
                System.out.println("El importe de matricula es: 280, Mensualidad: 490 y su IGV es: " + igv);
                System.out.println("El total es: "+total);              
            }
            
            case 6 -> {
                igv = (float) ((360 + 520)*0.18) ;
                total = 360 + 520 + igv;  
                System.out.println("El nombre del estudiante "+nom1+" facultad de Administracion");
                System.out.println("El importe de matricula es: 360, Mensualidad: 520 y su IGV es: " + igv);
                System.out.println("El total es: "+total);              
            }
            
            default -> {
                
                System.out.println("Ingrese una opcion correcta porfavor");
            }
        }
        
        
    }
    
}

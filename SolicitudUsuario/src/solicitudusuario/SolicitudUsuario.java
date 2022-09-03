/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitudusuario;

/**
 *
 * @author El Samin
 */
import java.util.Scanner;

public class SolicitudUsuario {

    /**
     * 
     * 
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        String UserMain = "s03";
        String ContraMain = "1";
        
        System.out.println("Ingresa usuario");
        String user1 = sc.next();
        System.out.println("Ingresa usuario");
        String contra1 = sc.next();
        
        if (UserMain.equals(user1) && ContraMain.equals(contra1)) {
            System.out.println("Inicio de sesion correcto");
        }else{
            System.out.println("Nombre de usuario incorrecto");
        }
        
        
    }
    
}

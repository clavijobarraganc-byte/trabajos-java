/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocacola.java;
import java.util.Scanner;
public class CocacolaJava {
    
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombre = "";
    int clave = 1;
    int antiguedad = 1;
        System.out.println("**********************************************************");
    System.out.println("*bienvenido al sistema vacacional de coca-cola company*");
    System.out.println("*****************************************************************");
    System.out.println("");
    System.out.println("");
    
    
          System.out.println("digite el nombre del empleado");
          nombre = entrada.nextLine();
          System.out.println("digite la antiguedad  del empleado");
          antiguedad = entrada.nextInt();
          System.out.println("digite la clave del empleado");
          clave = entrada.nextInt();
          
          
               if(clave == 1){
                   
     if(antiguedad == 1){
         System.out.println("el trabajador" + nombre + " tiene derecho a 6 dias vacaciones");
     } else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println("el trabajador " + nombre + "tiene derecho a 14 dias de vacaciones");
     } else if(antiguedad >= 7){
       System.out.println("el trabajador " + nombre + "tiene derecho a 20 dias de vacaciones");
     } else {
       System.out.println("el trabajador aun no tiene derecho a vacaciones");
         
     }
               }
               

               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
    } 
}
       
     
    
              
          
          
       
         
         
         
         
              
         
         
              
          
          
       
       
     
       
         
         
         
         
              
          
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombre;

import java.util.Scanner;


 
public class Nombre {

   
     
    
    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        
        String nombre = "";
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        
        
        
        System.out.println("cual es su nombre");
        nombre = entrada.nextLine();
        System.out.println("ingrese el primer valor");
        numero1 = entrada.nextLine();
        System.out.println("ingrese el segundo valor");
        numero2 = entrada.nextLine();
        System.out.println("");
        resultado = numero1 + numero2;
        System.out.println("hola" + nombre + "el resultado de la suma es : " + );
        
        
        
        
    }
    
}

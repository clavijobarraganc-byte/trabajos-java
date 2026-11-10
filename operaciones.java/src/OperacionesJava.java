/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class OperacionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero1 = 2;
       int numero2 = 4;
       int numero3 = 5;
       int numero4 = 4;
       int resultado = 0;
       
       
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("seleccione una opcion:");
        System.out.println("1 - suma");
        System.out.println("2 - resta");
        System.out.println("3 - multiplicacion");
        System.out.println("4 - division");
        System.out.println("opcion: ");
        
        
        int parametro = entrada.nextInt();
        
        
        switch(parametro){
        
            case 1 : resultado = numero1 + numero2;
                System.out.println("el resultado de la suma es: " + resultado);
                
                break;
             case 2 : resultado = numero1 - numero2;
                System.out.println("el resultado de la resta es: " + resultado);
        
                break;
             case 3 : resultado = numero1 * numero2 * numero3;
                System.out.println("el resultado de la multiplicacion es: " + resultado);
        
                
                break;
             case 4 : resultado = numero1 * numero2 * numero3;
                System.out.println("el resultado de la division es: " + resultado);
        }
        
    }
    
}

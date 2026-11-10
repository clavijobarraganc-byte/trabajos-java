/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
package menu;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class comidas {

    Scanner teclado = new Scanner(System.in);

    public double paisa(double total, double descuento, double adicion) {
        System.out.println("Desea la adicion (1 para si / 2 para no) ");
        adicion = teclado.nextInt();

        if (adicion == 1) {
            total = 25000;
            adicion = 25000*0.10;
            total = total + adicion;
            descuento = total - descuento;
            System.out.println("Bandeja paisa");
            System.out.println("Descuento " + descuento);
            System.out.println("Adicion " + adicion);
            System.out.println("Total   " + total);
            return total;
        }
        else{
            total = 25000;
            descuento = total*0.10;
            total = total-descuento;
            System.out.println("Bandeja paisa");
            System.out.println("Descuento " + descuento);
            System.out.println("Total    " + total);
            return total;
        }
        
    
    
    }
    
      public double mondongo(double total, double descuento, double adicion) {
        System.out.println("Desea la adicion (1 para si / 2 para no) ");
        adicion = teclado.nextInt();
        
        
        if (adicion == 1) {
            total = 20000;
            adicion = 20000*0.15;
            total = total + adicion;
            descuento = total - descuento;
            System.out.println("mondongo");
            System.out.println("Descuento " + descuento);
            System.out.println("Adicion " + adicion);
            System.out.println("Total   " + total);
            return total;
        }
        else{
            total = 25000;
            descuento = total*0.15;
            total = total-descuento;
            System.out.println("mondongo");
            System.out.println("Descuento " + descuento);
            System.out.println("Total    " + total);
            return total;
        }
 }
      public double sancocho(double total, double descuento, double adicion) {
        System.out.println("Desea la adicion (1 para si / 2 para no) ");
        adicion = teclado.nextInt();
        
        
        if (adicion == 2) {
            total = 20000;
            adicion = 20000*0.10;
            total = total + adicion;
            descuento = total - descuento;
            System.out.println("sancocho");
            System.out.println("Descuento " + descuento);
            System.out.println("Adicion " + adicion);
            System.out.println("Total   " + total);
            return total;
        
       }
      else{
            total = 25000;
            descuento = total*0.10;
            total = total-descuento;
            System.out.println("sancocho");
            System.out.println("Descuento " + descuento);
            System.out.println("Total    " + total);
            return total;
        }
   
      }     public double menuDia(double total){
       
       total = total + 200000;
       System.out.println("menuDia");
       System.out.println("total " + total);
       return total;
       
      
           
       }
}

      
      
      
      

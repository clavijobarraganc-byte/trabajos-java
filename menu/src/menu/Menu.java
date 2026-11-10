
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        String aparecerM;
        int menu;
        double descuento = 0, total = 0, adicion = 0;
        

        comidas op = new comidas ();

        System.out.println("Desea el menu? (ingrese si o no)");
        aparecerM = teclado.next();

        switch (aparecerM) {

            case "SI":
            case "Si":
            case "si":

                System.out.println("        Menu                 Precio        adicion          Descuento");
                System.out.println("");

                System.out.println("1) bandeja paisa            25.000        Chicharro/Chorizo    Descuento10%");
                System.out.println("2) mondongo                 20.000       Ensalada/patacon     Descuento15%");
                System.out.println("3) sancocho                25.000        Ensalada/Arroz       Descuento10%");
                System.out.println("4) Menu del dia             20.000             N/A                  N/A");

                System.out.println("");
                System.out.println("Seleccione una opcion:");
                menu = teclado.nextInt();

                switch (menu) {

                    case 1:
                        total = op.paisa(total, descuento, adicion);
                        break;

                    case 2:
                        total = op.mondongo(total, descuento, adicion);
                        break;

                    case 3:
                        total = op.sancocho(total, descuento, adicion);
                        break;

                    case 4:
                        total = op.menuDia(total);
                        break;

                    default:
                        System.out.println("Opcion no valida");
                }

                
        }
    }
}
  

    


    





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int suma;
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        System.out.println("Numero entero 1");
        n1 = entradaEscaner.nextInt();
        System.out.println("Numero entero 2");
        n2 = entradaEscaner.nextInt();
        suma = n1+n2;
        System.out.println("Suma: " + suma);
        
        
    }
    
}

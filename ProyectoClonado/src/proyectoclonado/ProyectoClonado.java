/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclonado;

import java.util.Scanner;

/**
 *
 * @author Fabrizzio Quintana
 */
public class ProyectoClonado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cosme god");
        String hola ="bb";
        String a ="a";
        
        //Ordenamiento de insercion
        Scanner in = new Scanner(System.in);
        int n, pos, aux;
        int []array = new int [100];
        System.out.print("Ingrese la cantidad de elementos del array: ");
        n = in.nextInt();
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            pos = i;
            aux = array[i];
            while(pos > 0 && array[pos-1] > aux){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos]=aux;
        }
        System.out.println("El array ordenado es: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}

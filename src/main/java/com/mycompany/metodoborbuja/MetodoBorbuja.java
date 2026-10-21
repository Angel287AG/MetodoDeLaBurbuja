/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodoborbuja;

/**
 *
 * @author angel angelino Gonzalez
 */
public class MetodoBorbuja {

    public static void main(String[] args) {
       int[] arreglo = {5, 2, 9, 1, 5, 6};
       System.out.print("Arreglo desordenado: ");
       
       for (int i = 0; i < arreglo.length; i++) {
         System.out.print(arreglo[i] + " ");
        }
       System.out.println();
       
         ordenamientoBurbuja(arreglo);
       
       System.out.print("Arreglo ordenado: ");
       for (int i = 0; i < arreglo.length; i++) {
          System.out.print(arreglo[i] + " ");
       }
       System.out.println();
       
    }
    public static void ordenamientoBurbuja(int[] arreglo) {
       int n = arreglo.length;
       for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                   int temp = arreglo[j];
                   arreglo[j] = arreglo[j + 1];
                   arreglo[j + 1] = temp;
                }
            }
        }
    }
}


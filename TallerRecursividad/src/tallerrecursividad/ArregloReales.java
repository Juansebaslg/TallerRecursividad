/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrecursividad;
import java.util.Scanner;
/**
 *
 * @author Juan Sebastian
 */
public class ArregloReales {
    
    static Scanner entrada = new Scanner(System.in);
    
    static boolean busquedaRecursiva(int [] Arreglo, int n, int dato){
       
        if(n == 0 && Arreglo [n] == dato)
           return true;
        else if(n == 0)
            return false;
            else if(Arreglo [n] == dato)
                return true;
        else
            return busquedaRecursiva(Arreglo, n-1, dato);
    }
    
    public static void main(String [] args){
    
    int n, dato;
    
    System.out.print("Ingrese el número de posiciones del arreglo: ");
    n = entrada.nextInt();
    
    int[] Arreglo = new int [n];
    
    for(int i = 0; i < n; i++){
        Arreglo [i] = (int)(Math.random() * 101);
        System.out.println(Arreglo [i] + "\t");
    }
    
    System.out.print("Ingresar el dato a buscar: ");
    dato = entrada.nextInt();
    
    if(busquedaRecursiva(Arreglo, n-1, dato))
        System.out.print("El dato existe en el arreglo");
    else
        System.out.print("El dato NO existe en el arreglo");
    
    }
}

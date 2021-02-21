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
public class Tribonacci {

    public static void main(String [] args){
    
    int n;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese el número de posiciones de la serie: ");
    n = entrada.nextInt();
    System.out.println("La serie de Tribonacci es: "+ serieTribonacci(n));
    
    for(int i = 0;i <= n;i++){
    System.out.print(serieTribonacci(i) + "\t");
    
    }
    
}
    
    public static int serieTribonacci(int n){
    
        if(n == 0){
            return 0;
        }
       if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        
            return serieTribonacci(n-1) + serieTribonacci(n-2) + serieTribonacci(n-3);
    }
}


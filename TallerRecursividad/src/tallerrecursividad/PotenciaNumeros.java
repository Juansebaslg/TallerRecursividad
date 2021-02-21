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
public class PotenciaNumeros {
    
    public static void main(String [] args){
    
    int n;
    int m;
    
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese el número que quiere elevar: ");
    n = entrada.nextInt();
    System.out.print("Ingrese el número al cuál quiere elevarlo: ");
    m = entrada.nextInt();
    System.out.println("La potencia entre los dos números es de: "+ potenciaRecursiva(n, m));

}
    static int potenciaRecursiva(int n, int m){
    
        if(m == 0)
          return 1;
        else
            return n * potenciaRecursiva(n, m-1);
    }

}

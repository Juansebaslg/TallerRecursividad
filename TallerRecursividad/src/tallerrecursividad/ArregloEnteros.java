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
public class ArregloEnteros {
    
    public static void main(String[] args){
    
        int n;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de posiciones del arreglo: ");
        n = entrada.nextInt();
        
        int [] Arreglo = new int [n];
        
        for(int i = 0; i < n; i++){
            Arreglo[i] = (int) (Math.random() * 101);
            System.out.println(Arreglo[i] + "\t");
        }
        
        System.out.println("El menor valor del arreglo es: "+ MenorValorArreglo(Arreglo, n-1, Arreglo[0]));
    }
    
    static int MenorValorArreglo(int [] Arreglo, int n, int menor)
    {
        if(n == 0 && Arreglo[n] < menor)
            return Arreglo[n];
  
        else if(n == 0)
            return menor;
        
        else{
            
              if(Arreglo [n] < menor)
                 menor = Arreglo [n];
            
              return MenorValorArreglo(Arreglo, n-1, menor);
           }   
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrecursividad;
/**
 *
 * @author Juan Sebastian
 */
public class Palindromo {
    public static void main(String[] args) {
    System.out.println("Resultado:" + esPalindromo("szs"));
}
 public static boolean esPalindromo(String texto)
{
  if(texto.length() <= 1)
  {
    return true;
  }else
  {
    if(texto.charAt(0) == texto.charAt(texto.length()-1))
    {
      return esPalindromo(texto.substring(1,texto.length()-1));
    }else
      {
          return false;
      }
  }  
}
}

/**
 * Este programa te mostrar todos los numeros menores al que introduzcas en primer lugar y no divisibles por el segundo numero que introduzcas
 *
 *  Jose Navarro Ortiz
 */

public class noDivisible{
  public static void main(String[] args) {
  
    System.out.println("Este programa te mostrar todos los numeros menores al que introduzcas");
    System.out.println("en primer lugar y no divisibles por el segundo numero que introduzcas");
    System.out.println("Introduce el primer numero");
    int pNumero=Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo numero");
    int sNumero= Integer.parseInt(System.console().readLine());
    for(int i = 0; i< pNumero;i++){
      if(i%sNumero!=0){
      System.out.print(i+",");
      }
      
    }
    
    }
  }

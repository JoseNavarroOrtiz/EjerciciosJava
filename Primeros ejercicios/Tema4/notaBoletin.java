/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class notaBoletin{
  public static void main(String[] args) { 
  
      System.out.println("Este programa calcula la media de 3 numeros");
      System.out.println("Introduce el primer numero");
      double primerNumero = Double.parseDouble(System.console().readLine());
      System.out.println("Introduce el segundo numero");
      double segundoNumero = Double.parseDouble(System.console().readLine());
      System.out.println("Introduce el tercer numero");
      double tercerNumero = Double.parseDouble(System.console().readLine());
      double suma = (primerNumero+segundoNumero+tercerNumero)/3;
      if(((primerNumero >= 0)&&(primerNumero <=10))&&((segundoNumero >= 0)&&(segundoNumero <=10))&&((tercerNumero >= 0)&&(tercerNumero <=10))){
          System.out.println("el resultado de la media es " + ((primerNumero+segundoNumero+tercerNumero)/3));
          if(suma<5){
        System.out.println("Tu media es insuficiente");
      }
      if((suma>=5)&&(suma<6)){
        System.out.println("Tu media es suficiente");
        }
      if ((suma>=6)&&(suma<7)){
        System.out.println("Tu media es un bien");
        }
      if((suma>=7)&&(suma<9)){
        System.out.println("Tu nota media es notable");
        }
      if(suma>9){
        System.out.println("Tu nota media es sobresaliente");
        }
  
  
      }else{
        System.out.println("El numero no es correcto porque has introducido un numero que no esta entre el cero y el 10");
      }
      
  
    }
  }

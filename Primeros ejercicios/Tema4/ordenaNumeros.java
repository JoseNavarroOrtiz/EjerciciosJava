/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class ordenaNumeros{
  public static void main(String[] args) {
  
  System.out.println("Este programa ordenara tres numeros enteros que metas por pantalla");
  System.out.println("Introduce el primer numero entero");
  int primerNumero = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el segundo numero entero");
  int segundoNumero = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el tercer numero entero");
  int tercerNumero = Integer.parseInt(System.console().readLine());
  
  if ((primerNumero <= segundoNumero)&&(primerNumero <= tercerNumero)&&(segundoNumero <= tercerNumero)){
    System.out.printf("El orden de los numeros de menor a mayor es %d < %d < %d", primerNumero,segundoNumero,tercerNumero);
    }
  if((segundoNumero <= primerNumero)&&(segundoNumero <= tercerNumero)&&(primerNumero <= tercerNumero)){
    System.out.printf("El orden de los numeros de menor a mayor es %d < %d < %d",segundoNumero, primerNumero, tercerNumero);
    }
  if((tercerNumero <= segundoNumero)&&(tercerNumero <= primerNumero)&&(primerNumero <= segundoNumero)){
    System.out.printf("El orden de los numeros de menor a mayor es %d < %d < %d",tercerNumero,primerNumero,segundoNumero);
    }
  if((tercerNumero <= segundoNumero)&&(primerNumero <= tercerNumero)&&(primerNumero <= segundoNumero)){
    System.out.printf("El orden de los numeros de menor a mayor es %d < %d < %d",primerNumero,tercerNumero,segundoNumero);
    }
  if((segundoNumero <= tercerNumero)&&(segundoNumero <= primerNumero)&&(tercerNumero <= primerNumero)){
    System.out.printf("El orden de los numeros de menor a mayor es %d < %d < %d",segundoNumero,tercerNumero,primerNumero);
    }
  if((tercerNumero <= segundoNumero)&&(segundoNumero <= primerNumero)&&(tercerNumero <= primerNumero)){
    System.out.printf("El orden de los numeros de menor a mayor es %d < %d < %d",tercerNumero,segundoNumero,primerNumero);
    }
  
  
  
  
  
    }
  }

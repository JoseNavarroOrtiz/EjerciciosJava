/**
 * Este programa es una caja fuerte donde tienes 4 intentos para abrirla
 *
 * @author 
 */

public class cajaFuerte{
  public static void main(String[] args) {
  
  System.out.println("Este programa es una caja fuerte donde tienes 4 intentos para abrirla");
  System.out.println("Introduce la combinacion de 4 digitos");
  int contraseña = Integer.parseInt(System.console().readLine());
  int respuesta = 1234;
  int contador= 0;
  while (contador  < 3){
      
      contador++;
      
      if (respuesta != contraseña){
        System.out.println("Lo siento es no es la combinacion");
        System.out.println("vuelve a intentarlo");
        contraseña = Integer.parseInt(System.console().readLine());
      }
    }
  if (respuesta == contraseña){
    System.out.println("La caja fuerte se ha abierto satisfactoriamente");
  }
      

  
  
    }
  }

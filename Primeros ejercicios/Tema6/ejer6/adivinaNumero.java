/**
 * Tienes 5 oportunidades para adivinar este numero entre 0 y 100
 *
 *  Jose Navarro Ortiz
 */

public class adivinaNumero{
  public static void main(String[] args) {
  
    System.out.println("Tienes 5 oportunidades para adivinar este numero entre 0 y 100");
    
    int numero=(int)(Math.random()*101);
    int prueba=0;
    
    for(int i =0;i<5;i++){
      
      System.out.println("Adivina el numero");
      prueba= Integer.parseInt(System.console().readLine());
     
      if (numero<prueba){
        System.out.println("El numero es menor");
      }
      if(numero>prueba){
        System.out.println("El numero es mayor");
      }
      if(numero==prueba){
        System.out.println("Lo has adivinado");
        }
    }
    System.out.println("El numero era "+ numero+"\n Has fallado todas tus oportunidades");  
  }
}

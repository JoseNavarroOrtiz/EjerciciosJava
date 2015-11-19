/**
 * El ordenador tiene 5 oportunidades para adivinar el numero entre 0 y 100 que introduzcas
 *
 *  Jose Navarro Ortiz
 */

public class OrdenadoAdivinaNumero{
  public static void main(String[] args) {
  
    System.out.println("El ordenador tiene 5 oportunidades para adivinar el numero entre 0 y 100 que introduzcas");
    System.out.println("Introduce un numero entre el 0 y el 100");
    int numero=Integer.parseInt(System.console().readLine());
    int prueba=0;
    
    while((numero<0)||(numero>100)){
      System.out.println("El numero no es correcto, introduce uno entre el 0 y el 100");
      numero=Integer.parseInt(System.console().readLine());
      }
    for(int i =0;i<5;i++){
      
      
      prueba= (int)(Math.random()*101);
      System.out.println(prueba);
     
      if (numero<prueba){
        System.out.println("El numero es menor");
      }
      if(numero>prueba){
        System.out.println("El numero es mayor");
      }
      if(numero==prueba){
        System.out.println("Lo has adivinado");
        i=5;
        }
    }
    System.out.println("El numero era "+ numero+"\n Has fallado todas tus oportunidades");  
  }
}

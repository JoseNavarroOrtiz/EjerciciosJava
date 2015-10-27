/**
 * pinta una piramide con un simbolo dentro introduciendo la altura y el caracter con el que quieres pintarlo.
 *
 *  Jose Navarro Ortiz
 */

public class piramideConNumero{
  public static void main(String[] args) {
  
      System.out.print("Por favor, introduzca la altura de la pirámide: ");
		int alturaIntroducida = Integer.parseInt(System.console().readLine());

		System.out.print("Introduzca el carácter de relleno: ");
		int numero = Integer.parseInt(System.console().readLine());
    
		int contador=0;
		for(int x=0; x < alturaIntroducida;x++){
      
      for(int i=0;i<= (alturaIntroducida-x)-1;i++){
        
        System.out.print(" ");
      }
      
      for(int j=0; j<=(x*2);j++){
          System.out.print(numero%10);
         
          
          
      }
      System.out.println();
      contador++;
      
      
    }
	}
}
        

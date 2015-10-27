/**
 * pinta una piramide con un simbolo introduciendo la altura y el caracter con el que quieres pintarlo.La piramide estara vacia
 *
 *  Jose Navarro Ortiz
 */

public class piramideSinRelleno{
  public static void main(String[] args) {
  
      System.out.print("Por favor, introduzca la altura de la pirámide: ");
		int alturaIntroducida = Integer.parseInt(System.console().readLine());

		System.out.print("Introduzca el carácter de relleno: ");
		String relleno = System.console().readLine();
		int contador=0;
		for(int x=0; x < alturaIntroducida;x++){
      
      for(int i=0;i<= (alturaIntroducida-x)-1;i++){
        
        System.out.print(" ");
      }
      
      for(int j=0; j<=(x*2);j++){
          
          
          if(j <=(alturaIntroducida-1)){
              System.out.print(relleno);
              
            }
             
            
      }
          
      
      System.out.println();
      contador++;
      
      
    }
	}
}
        

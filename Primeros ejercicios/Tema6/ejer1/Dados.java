/**
 * Muestra y suma tres tiradas de dados
 *
 *  Jose Navarro Ortiz
 */

public class Dados{
  public static void main(String[] args) {
  
  System.out.println("Muestra y suma 3 tiradas de dados");
  
  int tirada=0;
  int suma=0;
  for(int i=0;i<3;i++){
    
   tirada=(int)(Math.random()*6+1);
   System.out.println(tirada);
   suma= suma+tirada;
    }
  
  System.out.println("La suma de las tres tiradas es "+suma);
  
  }
}

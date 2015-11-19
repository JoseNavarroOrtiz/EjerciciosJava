/**
 * quiniela
 *
 *  Jose Navarro Ortiz
 */

public class quinielaNueva{
  public static void main(String[] args) {
  
  System.out.println("Este programa te realiza la quiniela");
  int numero=0;
    for (int i=0;i<15;i++){
      numero=((int)(Math.random()*6+1));
      if ((numero>0)&&(numero<4)){
        System.out.println("1");
        }
      if ((numero>3)&&(numero<6)){
        System.out.println("X");
      }
      if(numero==6){
        System.out.println("2");
      }
    }
  }
}

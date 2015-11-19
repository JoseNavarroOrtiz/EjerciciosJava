/**
 * Muestra en pantalla una carta de la baraja francesa
 *
 *  Jose Navarro Ortiz
 */

public class carta{
  public static void main(String[] args) {
  
  System.out.println("Muestra una carta de la baraja francesa");

  String palo="";
  String numero="";
    
    
      int numeroCarta=(int)(Math.random()*13+1);
      switch(numeroCarta){
        case 1:
        numero="AS";
        break;
        case 11:
        numero="J";
        break;
        case 12:
        numero="Q";
        break;
        case 13:
        numero= "K";
        break;
        default:
        numero =Integer.toString(numeroCarta);
        }
      int clasePalo= (int)(Math.random()*4+1);
      switch(clasePalo){
        case 1:
        palo="Diamantes";
        break;
        case 2:
        palo="Corazones";
        break;
        case 3:
        palo= "Picas";
        break;
        case 4:
        palo="Treboles";
        break;
        default:
        }
    System.out.println(numero+" de "+palo);
  }
}

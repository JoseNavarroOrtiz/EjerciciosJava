/**
 * Muestra una carta de la baraja española
 *
 *  Jose Navarro Ortiz
 */

public class cartaEspañola{
  public static void main(String[] args) {
  
  System.out.println("Muestra una carta de la baraja española");

  String palo="";
  String numero="";
   
      int numeroCarta=(int)(Math.random()*10+1);
      switch(numeroCarta){
        case 1:
        numero="AS";
        break;
        case 8:
        numero="Sota";
        break;
        case 9:
        numero="Caballo";
        break;
        case 10:
        numero= "Rey";
        break;
        default:
        numero = String.valueOf(numeroCarta);
        }
      int clasePalo= (int)(Math.random()*4+1);
      switch(clasePalo){
        case 1:
        palo="Bastos";
        break;
        case 2:
        palo="Oros";
        break;
        case 3:
        palo= "Copas";
        break;
        case 4:
        palo="Espadas";
        break;
        default:
        }
        
      
    System.out.println(numero+" de "+palo);
  }
}

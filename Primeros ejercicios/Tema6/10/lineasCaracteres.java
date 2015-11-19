/**
 * Este programa pinta 10 lineas de caracteres de forma aleatoria
 *
 *  Jose Navarro Ortiz
 */

public class lineasCaracteres{
  public static void main(String[] args) {
  
  System.out.println("Este programa pinta 10 lineas de caracteres de forma aleatoria");
  int numero=0;
  String caracter="";
  
  
    for(int i=0;i<10;i++){
      int tipoCaracter = (int)((Math.random()*6+1));
      switch(tipoCaracter){
        
        case 1:
          caracter="*";
        break;
        case 2:
          caracter="-";
        break;
        case 3:
          caracter="=";
        break;
        case 4:
          caracter=".";
        break;
        case 5:
          caracter="|";
        break;
        case 6:
          caracter="@";
        break;
        default:
      }
      System.out.println();
      for(int j=0;j<40;j++){
      System.out.print(caracter);
      }
    }
  }
}

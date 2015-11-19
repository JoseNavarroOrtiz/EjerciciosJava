/**
 * Este programa dice
 *  20 notas
 *
 *  Jose Navarro Ortiz
 */

public class NotaClase{
  public static void main(String[] args) {
  
  System.out.println("Este programa pinta 10 lineas de caracteres de forma aleatoria");
  int numero=0;
  String nota="";
  int insuficiente=0;
  int suficiente=0;
  int bien=0;
  int notable=0;
  int sobresaliente=0;
  
  
    for(int i=0;i<20;i++){
      int tipoCaracter = (int)((Math.random()*21));
      switch(tipoCaracter){
        case 0:
          nota="Insuficiente";
        break;
        case 1:
          nota="Insuficiente";
        break;
        case 2:
          nota="Insuficiente";
        break;
        case 3:
          nota="Insuficiente";
        break;
        case 4:
          nota="Insuficiente";
        break;
        case 5:
          nota="Suficiente";
        break;
         case 6:
          nota="Bien";
        break;
        case 7:
          nota="Notable";
        break;
        case 8:
          nota="Notable";
        break;
        case 9:
          nota="Sobresaliente";
        break;
        case 10:
          nota="Sobresaliente";
        break;
        
        default:
      }
      if(nota.equals("Insuficiente")){
        insuficiente++;
      }
      if(nota.equals("Suficiente")){
        suficiente++;
      }
      if(nota.equals("Bien")){
          bien++;
      }
      if(nota.equals("Notable")){
        notable++;
        }
      if(nota.equals("Sobresaliente")){
        sobresaliente++;
        }
    }
    System.out.println("La cantidad de insuficientes es "+insuficiente+"\nLa cantidad de suficientes es "+suficiente);
    System.out.println("La cantidad de bienes es "+ bien+"\nLa cantidad de notables es "+ notable+"\nLa cantidad de sobresalientes es "+sobresaliente);
  }
}

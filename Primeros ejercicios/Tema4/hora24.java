/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class hora24{
  public static void main(String[] args) {
  
  System.out.println("Dira los segundos que faltan hasta medianoche, introduciendo la hora y los minutos");
  System.out.println("Introduce la hora");
  double hora = Double.parseDouble(System.console().readLine());
  System.out.println("Introduce los minutos");
  double minutos = Double.parseDouble(System.console().readLine());
      if ((hora <24)&&(hora>=0)&&(minutos<60)&&(minutos>=0)){
        double resultado = ((hora*3600)+(minutos *60));
        System.out.println("La cantidad de segundos que fatan hasta media noche es " + (86400-resultado));
      }else{
        System.out.println("La hora no es correcta");
        }
    }
  }

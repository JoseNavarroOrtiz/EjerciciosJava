/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class areaRectangulo{
  public static void main(String[] args) {
    
  String numero="";
  double base=0;
  double altura=0;
  
  
  
    System.out.println("introduzca la base del rectangulo ");
    numero = System.console().readLine();
    base = Double.parseDouble(numero);
    
    System.out.println("introduzca la altura del rectangulo");
    numero = System.console().readLine();
    altura = Double.parseDouble(numero);
    double area = (base*altura);
    
    System.out.printf("El area del rectangulo es %.2f",area);
    
   }
  }

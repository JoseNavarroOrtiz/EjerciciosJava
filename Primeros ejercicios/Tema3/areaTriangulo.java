/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class areaTriangulo{
  public static void main(String[] args) {
    
  String numero="";
  double base=0;
  double altura=0;
  
  
  
    System.out.println("introduzca la base del triangulo ");
    numero = System.console().readLine();
    base = Double.parseDouble(numero);
    
    System.out.println("introduzca la altura del triangulo");
    numero = System.console().readLine();
    altura = Double.parseDouble(numero);
    double area = (base*altura/2);
    
    System.out.printf("El area del triangulo es %.2f",area);
    
   }
  }

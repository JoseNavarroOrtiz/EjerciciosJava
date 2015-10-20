/**
 * Escribe la base y el exponente y calculare la potencia
 *
 *  Jose Navarro Ortiz
 */
 
public class calculaPotencia{
  public static void main(String[] args) {
  
      System.out.println("Introduce la base y exponente(entero positivo) y se calculara la potencia");
      System.out.println("Introduce la base");
      int base = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce el exponente positivo y entero");
      int exponente = Integer.parseInt(System.console().readLine());
      int contador = 0;
      int suma = 1;
      do{
      
      
        suma = (base * suma);
        contador++;
      
        }while (exponente != contador);
      System.out.println("La potencia del numero "+ base+ " con exponete " + exponente + " es "+ suma);
    
    }
  }

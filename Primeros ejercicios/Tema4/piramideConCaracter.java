/**
 * pinta una piramide con un simbolo dentro
 *
 *  Jose Navarro Ortiz
 */

public class piramideConCaracter{
  public static void main(String[] args) {
  
  System.out.println("Este programa te pintara en panatalla una piramide normal o inversa con un caracter dentro");
  System.out.println("Elige el caracter que quieres que se refleje en la piramide");
  String simbolo = System.console().readLine();
  System.out.println("Elige la forma de la piramide que prefieras en el menu");
  System.out.println("1 Normal");
  System.out.println("2 Inversa");
  System.out.println("3 Derecha");
  int opcion = Integer.parseInt(System.console().readLine());
  
  switch (opcion){
    case 1:
    
    System.out.printf("       %s", simbolo);
    System.out.printf("\n      %s %s", simbolo,simbolo);
    System.out.printf("\n     %s   %s", simbolo,simbolo);
    System.out.printf("\n    %s     %s", simbolo,simbolo);
    System.out.printf("\n   %s%s%s%s%s%s%s%s%s", simbolo, simbolo,simbolo, simbolo, simbolo,simbolo, simbolo, simbolo,simbolo);
    break;
    
    case 2:
    System.out.printf("   %s%s%s%s%s%s%s%s%s", simbolo, simbolo,simbolo, simbolo, simbolo,simbolo, simbolo, simbolo,simbolo);
    System.out.printf("\n    %s     %s", simbolo,simbolo);
    System.out.printf("\n     %s   %s", simbolo,simbolo);
    System.out.printf("\n      %s %s", simbolo,simbolo);
    System.out.printf("\n       %s", simbolo);
    break;
    
    case 3:
    
    System.out.printf("   %s", simbolo);
    System.out.printf("\n   %s %s", simbolo,simbolo);
    System.out.printf("\n   %s   %s", simbolo,simbolo);
    System.out.printf("\n   %s     %s", simbolo,simbolo);
    System.out.printf("\n   %s       %s", simbolo,simbolo);
    System.out.printf("\n   %s         %s", simbolo,simbolo);
    System.out.printf("\n   %s       %s", simbolo,simbolo);
    System.out.printf("\n   %s    %s", simbolo,simbolo);
    System.out.printf("\n   %s  %s    ", simbolo,simbolo);
    System.out.printf("\n   %s", simbolo);
    
    break;
    
    default:
    }
  
  
    }
  }

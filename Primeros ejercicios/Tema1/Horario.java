/**
 * 1. Salida por pantalla
 *
 * 1. Escribe una programa que muestre el horario por pantalla.
 *
 * 
 */

public class Horario{
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println(rojo + "lunes " +verde+ "martes " +naranja+ "miercoles "  +azul+"jueves " +morado+ "viernes");
    System.out.println( rojo +" FOL "    +verde+ "   PRO "    +naranja+  "    SIN "       +azul+"      PRO "     +morado+ "   BD");
    System.out.println(rojo + " FOL "    +verde+"   PRO "     +naranja+ "    SIN "       +azul+"      PRO "     +morado+"   BD");
    System.out.println( rojo +" FOL "    +verde+"   PRO "     +naranja+ "    SIN "       +azul+"      PRO "      +morado+"   BD");
    System.out.println( rojo +" PRO "    +verde+"   BBDD "    +naranja+ "   SIN "       +azul+"      ED "      +morado+ "   PRO");
    System.out.println( rojo +" ED "     +verde+"    BBDD "    +naranja+ "    LM "        +azul+"      LM "       +morado+"   SIN ");
    System.out.println( rojo + "ED "     +verde+"     BBDD "    +naranja+ "    LM "       +azul+"      LM "       +morado+"    SIN");
    
  }
}


/**
 *Ejercicio 12: Realiza un minicuestionario con 10 preguntas tipo test sobre las
 *asignaturas que se imparten en el curso. Cada pregunta acertada sumará un 
 *punto. El programa mostrará al final la calificación obtenida. Pásale el 
 *minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal 
 *andan de conocimientos en las diferentes asignaturas del curso.
 *
 *@author 
 */
 
public class cuestionarioInfidelidad {
  public static void main (String[] args){
    System.out.println("Vámos a hacer el cuestionario de DAW!!!");
    System.out.println("---------------------------------------");
    
    int puntos = 0;
    String respuesta = "";
    
    System.out.println("Pregunta Nº 1: ¿Tenemos en total 6 asignaturas?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")){
      puntos += 1;
    }
    
    System.out.println("Pregunta Nº 2: ¿Eva nos da 2 asignaturas?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("no")){
      puntos += 1;
    }
    
    System.out.println("Pregunta Nº 3: ¿Luis es el profesor de programación?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")){
      puntos += 1;
    }
    
    System.out.print("Pregunta Nº 4: ¿En programación estamos aprendiendo");
    System.out.println(" java?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")){
      puntos += 1;
    }
    
    System.out.println("Pregunta Nº 5: ¿Vamos a aprender sql en el curso?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")){
      puntos += 1;
    }
    
    System.out.println("Pregunta Nº 6: ¿Es html un lenguaje de marcas?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")){
      puntos += 1;
    }
    
    System.out.print("Pregunta Nº 7: ¿Es 'Cobol' un lenguaje de");
    System.out.println(" programación?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")){
      puntos += 1;
    }
    
    System.out.print("Pregunta Nº 8: ¿Es la RAM más rápida que el");
    System.out.println(" procesador?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("no")){
      puntos += 1;
    }
    
    System.out.println("Pregunta Nº 9: ¿Es <meta> una etiqueta html?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")){
      puntos += 1;
    }
    
    System.out.println("Pregunta Nº 10: ¿Va a bajar Costy el precio del café?");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("no")){
      puntos += 1;
    }
    
    System.out.print("Has conseguido " + puntos + " puntos.");
  }
}

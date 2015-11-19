/**
 * Este programa te dira las horas que falta entre dos dias
 *
 *  Jose Navarro Ortiz
 */

public class horas{
  public static void main(String[] args) {
  
    System.out.println("Este programa te dira las horas que falta de un dia");
    System.out.println("y una hora hasta otro dia con otra hora");
   
    
    
    int hora = 0;
    int hora2=0;
    System.out.println("1. Lunes");
    System.out.println("2. Martes");
    System.out.println("3. Miercoles");
    System.out.println("4. Jueves");
    System.out.println("5. viernes");
    System.out.println("6. Sabado");
    System.out.println("7. Domingo");
    
    System.out.println("elige un dia de la semana");
    String dia1 = System.console().readLine();
    int fecha=0;
    
    switch (fecha){
      case 1:
        dia1= "lunes";
        fecha =1;//mirar si fuciona asi o cambiar fecha por dia1
      break;
      case 2:
        dia1= "martes";
        fecha =2;
      break;
      case 3:
        dia1= "miercoles";
        fecha =3;
      break;
      
      case 4:
        dia1= "jueves";
        fecha =4;
      break;
      
      case 5:
        dia1= "viernes";
        fecha =5;
      break;
      case 6:
        dia1= "sabado";
        fecha =6;
        
      break;
      case 7:
        dia1= "domingo";
        fecha =7;
      break;
      
      default:
      dia1= "no existe ese dia";
    
  }
    
    System.out.println("1. Lunes");
    System.out.println("2. Martes");
    System.out.println("3. Miercoles");
    System.out.println("4. Jueves");
    System.out.println("5. viernes");
    System.out.println("6. Sabado");
    System.out.println("7. Domingo");
    System.out.println("elige el segundo dia de la semana");
    String dia2 = System.console().readLine();
    int fecha2=0;
    switch (fecha2){
      case 1 :
        dia2= "lunes";
        fecha2 =1;
      break;
      case 2 :
        dia2= "martes";
        fecha2 =2;
      break;
      case 3 :
        dia2= "miercoles";
      break;
      
      case 4 :
        dia2= "jueves";
      break;
      
      case 5 :
        dia2= "viernes";
      break;
      case 6 :
        dia2= "sabado";
        
      break;
      case 7 :
        dia2= "domingo";
      break;
      
      default:
      dia2= "no existe ese dia";
    }
      System.out.println("Introduce una hora entre 1 y 24");
      hora=Integer.parseInt(System.console().readLine());
      System.out.println("Introduce la segunda hora entre 1 y 24");
      hora2=Integer.parseInt(System.console().readLine());
      while((hora<1)||(hora>24)||(hora2<1)||(hora2>24)){
        System.out.println("La hora no es correcta, insertela de nuevo");
        System.out.println("Introduce una hora entre 1 y 24");
        hora=Integer.parseInt(System.console().readLine());
        System.out.println("Introduce la segunda hora entre 1 y 24");
        hora2=Integer.parseInt(System.console().readLine());
      }
      if(dia1!=dia2){
          System.out.println("La horas que faltan entre el dia "+dia1+" y el dia "+dia2+" es "+(((fecha2*24+(hora)-(fecha*24-(hora))))));
      }else{
       System.out.println("La diferencia de horas es "+(hora2-hora)); 
      }
  }
}


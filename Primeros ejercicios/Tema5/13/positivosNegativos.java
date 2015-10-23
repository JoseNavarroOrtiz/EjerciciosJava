/**
 * Lee 10 numeros y diga cuantos son positiosvos y cuantos negativ
 *
 *  Jose Navarro Ortiz
 */
 
public class positivosNegativos{
  public static void main(String[] args) {
  
    System.out.println("Introduce 10 numeros y el programa te dira cuantos son negativos y positivos");{}
    
    int contador = 0;
     int positivo= 0;
     int negativo =0;
     int numero = 0;
    
    do{
    
     System.out.println("Introduce el primer numero");
     numero = Integer.parseInt(System.console().readLine());
     
     if(numero<0){
       negativo++ ;
       }else{
         positivo++ ;
        }
      contador++;
      
      
    }while(contador!=10);
    
    
    System.out.println(" el numero de positivos es " + positivo + " y el numero de negativos es "+ negativo);
    
    }
  }

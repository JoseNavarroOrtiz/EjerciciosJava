/*
 * Este programa te mostrara los numeros multiplos de 3 te los cuenta y te los suma entre el 1 y el numero que se introduzca por pantalla 
 *
 *  Jose Navarro Ortiz
 */
 
public class multiplo3{
  public static void main(String[] args) {
  
    System.out.println("Este programa te mostrara los numeros multiplos de 3");
    System.out.println(",te los cuenta y te los suma entre el 1 y el numero que se introduzca por pantalla");
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    int suma =0;
    int contador=1;
    int contador2=0;
    while(contador<numero){
      if(contador %3==0){
        System.out.print(contador+",");
        suma= suma+contador;
        
        contador2++;
        }  
      contador++; 
    }
    System.out.println();
    System.out.println("La suma de los numeros multiplos de 3 es "+ suma+" y el numero de multiplos que tiene es " + contador2);
    
    }
  }

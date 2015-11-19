/**
 * Muestra 50 numeros aleatorios entre el 100 y el 199
 *
 *  Jose Navarro Ortiz
 */

public class Numero199{
  public static void main(String[] args) {
  
    System.out.println("Muestra numeros entre 100 y 199 y realiza la media numero mayor y menor");
    int suma = 0;
    int numero=0;
    double media=0;
    int mayor=0;
    int menor=259;
    for(int i =0;i<50;i++){
      numero=(int)(Math.random()*100+100);
      suma=suma+numero;
      System.out.print(numero+" ");
      if (numero<menor){
        menor=numero;
      }
      if(numero>mayor){
        mayor=numero;
      }
    }
    System.out.println("\n El numero mayor es "+mayor+"\n El numero menor es "+menor+"\n La media de los numeros es "+suma/50);  
  }
}
  

/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class ejer7{
  public static void main(String[] args) {
  
      System.out.println("se mostraran 100 valores entre el 0 y el 20,debes introducir dos valores y el el valor primero se sutituira por el segundo");
      int [] numero=new int [100];
      System.out.println("Introduce el primer valor");
      int pValor=Integer.parseInt(System.console().readLine());
      System.out.println("Introduce el segundo valor");
      int sValor=Integer.parseInt(System.console().readLine()); 
      for(int i =0;i<100;i++){
          numero [i]=(int)(Math.random()*21);
          if(numero[i]==pValor){
            System.out.print("'"+sValor+"'");
          }else{
            System.out.print(numero[i]+" ");
          }
        }
      
  }
}

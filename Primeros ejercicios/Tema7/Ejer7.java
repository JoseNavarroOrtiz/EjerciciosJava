/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class Ejer7{
  public static void main(String[] args) {
  
      System.out.println("Introduce las temperaturas medias de ls meses del año");
      int [] mes= new int [12];
     
     int grado=0;
     String caracter="+";
     
     
      for(int i =0;i<12;i++){
          mes[i]=Integer.parseInt(System.console().readLine());
      }
         
      for(int k=0;k<12;k++){
        if(mes[k]>0){
          for(int j=0;j<mes[k];j++){
            System.out.print(caracter);
          }
        }else{
           for(int l=0;l>mes[k];l--){
            System.out.print("-");
          } 
        }
        System.out.println();
      }   
  }
}

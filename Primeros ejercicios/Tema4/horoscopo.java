/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class horoscopo{
  public static void main(String[] args) {
  
  System.out.println("Este programa te dira que horoscopo eres segun el dia de tu nacimiento\nelige un mes");
  System.out.println("1 Enero");
  System.out.println("2 Febrero");
  System.out.println("3 Marzo");
  System.out.println("4 Abril");
  System.out.println("5 Mayo");
  System.out.println("6 Junio");
  System.out.println("7 Julio");
  System.out.println("8 Agosto");
  System.out.println("9 Septiembre");
  System.out.println("10 Octubre");
  System.out.println("11 Noviembre");
  System.out.println("12 Diciembre");
  
  int mes = Integer.parseInt(System.console().readLine());
  
  System.out.println("Escriba el dia de nacimiento");
  int dia = Integer.parseInt(System.console().readLine());
  
  
  
  switch (mes){
    case 1:

      if ((dia < 22) && (dia > 0)){
        System.out.println("Tu horoscopo es capricornio");
       } 
      if ((dia > 21) && (dia < 32)){
        System.out.println("Tu horoscopo es acuario");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
    case 2:
     
      if ((dia < 21) && (dia > 0)){
        System.out.println("Tu horoscopo es acuario");
      }
      if ((dia > 21) && (dia > 29)){
        System.out.println("Tu horoscopo es piscis");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
    case 3:
      if ((dia < 22) &&(dia > 0)){
        System.out.println("Tu horoscopo es piscis");
      }if ((dia > 21) && (dia < 32)){
        System.out.println("Tu horoscopo es aries");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
    case 4:
      if ((dia < 22)&&(dia > 0)){
        System.out.println("Tu horoscopo es aries");
      }if ((dia > 21) && (dia < 31)){
        System.out.println("Tu horoscopo es tauro");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
      
    case 5:
      if ((dia < 22)&&(dia > 0)){
        System.out.println("Tu horoscopo es tauro");
      }if ((dia < 32 ) && (dia > 21)){
        System.out.println("Tu horoscopo es geminis");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
      
    case 6:
      if ((dia < 22)&& (dia > 0)){
        System.out.println("Tu horoscopo es geminis");
      }if ((dia < 31) && (dia > 21)){
        System.out.println("Tu horoscopo es cancer");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
    case 7:
      if ((dia < 22) && (dia > 0)){
        System.out.println("Tu horoscopo es cancer");
      }if ((dia < 32) && (dia > 21)){
        System.out.println("Tu horoscopo es leo");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
      
    case 8:
      if ((dia < 22) && (dia > 0)){
        System.out.println("Tu horoscopo es leo");
      }if ((dia < 32) && (dia > 21)){
        System.out.println("Tu horoscopo es virgo");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
        case 9:
      if ((dia < 22) && (dia > 0)){
        System.out.println("Tu horoscopo es virgo");
      }if ((dia < 31) && (dia > 21)){
        System.out.println("Tu horoscopo es libra");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
    case 10:
      if ((dia < 22) && (dia > 0)){
        System.out.println("Tu horoscopo es libra");
      }if ((dia < 32) && (dia > 21)){
        System.out.println("Tu horoscopo es escorpio");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
      
    case 11:
      if ((dia < 22) && (dia > 0)){
        System.out.println("Tu horoscopo es escorpio");
      }if ((dia < 31) && (dia > 21)){
        System.out.println("Tu horoscopo es sagitario");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
      break;
      
    default:
      if ((dia < 22)&&(dia > 0)){
        System.out.println("Tu horoscopo es sagitario");
      }if ((dia < 32) && (dia > 21)){
        System.out.println("Tu horoscopo es capricornio");
      }else{
        System.out.println("Tu fecha no es correcta");
        }
    
    }
    
  
    }
  }

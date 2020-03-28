
package pruebagith;


public class PruebaGITH {

  
    public static void main(String[] args) {
        
        int[]lista = new int[6];
          
        //rellenando el contenido del array
        for(int i=0; i<lista.length; i++){
              lista[i]=(int)(Math.random()*100);
              
          }    
        //imprimiendo el contenido del array
        System.out.println("lista original");
      for(int i=0; i<lista.length; i++){
          System.out.print(+lista[i]); 
           System.out.print(", ");
       
      }
      
      //intercambio del contenido de la primera posicion del array con la última
      int aux=lista[0];
      lista[0]=lista[lista.length-1];
      lista[lista.length-1]=aux;
      //imprimiendo el contenido del array con el intercambio hecho
      System.out.println("");
      
        System.out.println("lista cambiada");
      for(int i=0; i<lista.length; i++){
         System.out.print(+lista[i]); 
         System.out.print(", "); 
      }
    }
    }
    
    

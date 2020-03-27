
package pruebagith;


public class PruebaGITH {

  
    public static void main(String[] args) {
        
        int[]lista = new int[6];
          
        //rellenando el contenido del array
        for(int i=0; i<lista.length; i++){
              lista[i]=(int)(Math.random()*100);
              
          }    
        //imprimiendo el contenido del array
      for(int i=0; i<lista.length; i++){
          System.out.print(lista[i]); 
           System.out.print(", ");
       
      }
    }
    }
    

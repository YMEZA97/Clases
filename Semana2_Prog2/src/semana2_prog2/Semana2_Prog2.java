
package semana2_prog2;

class Ciudad
     {
     
     String nombre;
    int habitantes, extension;
 
     Ciudad (String nombre, int habitantes, int extension)
     {
         this.nombre =nombre;
         this.habitantes = habitantes;
         this.extension = extension;
     }
     
     
     int obtenerdensidad()
     {
       int densidad = habitantes / extension;
       return densidad;
     }
     
 }


public class Semana2_Prog2 {

      
 public static void main(String[] args) {
        
              Ciudad sps = new Ciudad("San Pedro Sula",100000000,2450080);
        
             System.out.println("nombre: "+sps.nombre); 
              System.out.println("habitantes: "+sps.habitantes); 
              System.out.println("Extension: "+sps.extension); 
              System.out.println("Densidad:" +sps.obtenerdensidad());  
 
 }
    
}

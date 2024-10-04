
package FICHERO;
// 1. Importar las herramientas
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class lectura {
    public static void main(String[] args) {
         // 2. Creamos los flujos de lectura   
        String ruta = "src/FICHERO/datos/macarena.txt";
        BufferedReader buf=null;
        
        //Try with resources - Es un try más limpio. INVESTIGAR
        try{
            buf = new BufferedReader(new FileReader(ruta));
            
            // 3. Leer y jugar con el contenido
            
            //Lectura línea a línea
//            String linea=buf.readLine();
//            do{
//                linea= buf.readLine();
//                if(linea!=null) System.out.println(linea);
//            }while(linea!=null);
            
            System.out.println("------------------------------------------");
            
            //Lectura caracter a caracter
            int misterio=0;
            do{
                misterio=buf.read();
                if(misterio!=-1) System.out.print((char)misterio);
            }while(misterio!=-1);
            
            //Cuando termina misterio es = -1

           
        }
        catch(FileNotFoundException e){
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error: No se han podido cerrar los "
                    + "flujos de datos o problema leyendo.");
            System.out.println(e.getMessage());
        }       
        finally{
            // 4. Cierro todos los flujos
            try{
                if(buf!=null) buf.close();    
            }
            catch(IOException e){
                System.out.println("Error: Cerrando flujo de datos");
            System.out.println(e.getMessage());
            }
        }
    } 
}

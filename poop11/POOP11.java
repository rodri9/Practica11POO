package poop11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ドディス
 */
public class POOP11 {

    public static void main(String[] args) 
    {
        /*---- Actividad 1 - File ----*/
        System.out.println("---- Actividad 1 - File ----");
        try{
            File archivo = new File("miArchivo.txt");
            System.out.println(archivo.exists());
            boolean seCreo = archivo.createNewFile();
            System.out.println(seCreo);
            System.out.println(archivo.exists());
        }catch(IOException e){}
        
        /*---- Actividad 2 - FileOutputStream ----*/
        System.out.println("\n---- Actividad 2 - FileOutputStream ----");
        
        FileOutputStream fos = null;
        byte [] buffer = new byte[500];
        int nBytes;
        try{
            System.out.println("Escribe el texto a guardar en el archivo.");
            nBytes = System.in.read(buffer);
            fos = new FileOutputStream("fos.txt");
            fos.write(buffer, 0, nBytes);
            
        }catch(IOException ioe){
        }finally{
            try{
                if(fos != null)
                    fos.close();
            }catch(IOException ioe){}
        }
        
        /*---- Actividad 3 - FileInputStream ----*/
        System.out.println("\n---- Actividad 3 - FileInputStream ----");
        
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("fos.txt");
            nBytes = fis.read(buffer, 0, 500);
            String textoLeido = new String(buffer, 0, nBytes);
            System.out.println(textoLeido);
        }catch(IOException ioe){
        }finally{
            try{
                if(fis != null)
                    fis.close();
            }catch(IOException ioe){}
        }
    }    
}

package bufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author ドディス
 */
public class ClaseFileWriter {
    public static void main(String[] args) 
    {
        /*---- Actividad 4 ----*/
        System.out.println("---- Actividad 4 FileWriter ----");
        String texto = "";
        BufferedReader br;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe tu texto.");
            texto = br.readLine();
            System.out.println(texto);
            
            FileWriter fw = new FileWriter("fw.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.println(texto);
            salida.println("Segunda linea."); //Se escribe esta línea estaticamente, no desde el teclado.
            salida.close();
        }catch(IOException ioe){}
        
        /*---- Actividad 5 ----*/
        System.out.println("\n---- Actividad 5 FileReader ----");
        
        try{
            FileReader fr = new FileReader("fw.txt");
            br = new BufferedReader(fr);
            System.out.println("El contenido del archivo es:");
            String  linea = br.readLine(); //Lee la primer línea.
            while(linea != null)
            {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            
        }catch(IOException ioe){}
    }
}

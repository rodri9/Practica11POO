package serializar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 *
 * @author ドディス
 */
public class DeSerializador {

    public DeSerializador() {
        Date d = null;
        
        try{
            FileInputStream fis = new FileInputStream("objetoDate.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (Date) ois.readObject();
            ois.close();
            
        }catch(IOException ioe){
        }catch(ClassNotFoundException cnfe){}
        
        System.out.println("Objeto deSerializado: ");
        System.out.println(d);
        d = new Date();
        System.out.println("Fecha actual: "+ d);
    }
    
}

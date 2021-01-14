package serializar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author ドディス
 */
public class Serializador {
    
    public Serializador(){
        Date d = new Date();
        System.out.println(d);
        
        try{
            FileOutputStream fos = new FileOutputStream("objetoDate.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
        }catch(IOException ioe){}
        
    }
}

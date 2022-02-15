
package serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author karol
 */
public class Serializacao {
    
    public static ArrayList read(String path){
        ArrayList data = new ArrayList();

        try {
            
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(path));
            data = (ArrayList)ois.readObject();
            ois.close();
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Erro ao converter o arquivo em objeto");
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }

        return data;
    }
    
    public static void write(ArrayList data, String path){
        try {
            
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(path));
            oos.writeObject(data);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao ler o arquivo: " + path);
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }
    }
    
}
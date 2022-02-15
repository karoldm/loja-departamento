
package model;

/**
 *
 * @author karol
 */
public class Utilidades {
    
    public static boolean hasNull(String[] itens){
         for(String item: itens){
             if(item.equals("")) return true;
         }
         return false;
     }
}

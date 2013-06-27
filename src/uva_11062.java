//11062 - Andy's Second Dictionary

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;
import java.util.Collections;

public class uva_11062 {
    public static void main(String args[]) throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("input.txt"));
        String str;

        Vector<String> p = new Vector<String>();
        Vector<String> p2 = new Vector<String>();
        //se captura linea por linea en un vector
        while(sc.hasNextLine()){
            str = sc.nextLine().toLowerCase();
            p.add(str);
        }
        
        /* A la linea que termine en '-' se le añade la linea siguiente, 
         * considerando que la nueva puede terminar en '-'.
         */
        for(int i=0; i<p.size(); i++){
            str = p.elementAt(i);
            if(str.length()>0 && str.charAt(str.length()-1)=='-'){
                str = str.substring(0, str.length()-1);
                if(i<p.size()-1){
                    p.setElementAt(str+p.elementAt(i+1), i);
                    String aux = p.elementAt(i+1);
                    p.remove(i+1);
                    if(aux.length()>0)i--;
                }
                else p.setElementAt(str, i);
            }
        }
        
        // Se reemplazan los caracteres que no son letras ni guiones por espacio en blanco

        for(int i=0; i<p.size(); i++){
            str = p.elementAt(i);
            for(int j=0; j<str.length(); j++){
                if((str.charAt(j) < 'a' || str.charAt(j) > 'z') && str.charAt(j) != '-') str = str.replace(str.charAt(j), ' ');
            }
            p.setElementAt(str, i);
        }
        
        // Se guarda cada palabra en el vector p2 sin repetir palabra
        for(String linea : p){
            sc = new Scanner(linea);
            while(sc.hasNext()){
                str = sc.next();
                if(!p2.contains(str)) p2.add(str);
            }
        }
        
        //ordena las palabras
        Collections.sort(p2);
        
        for(String linea : p2) System.out.println(linea);
    }
}
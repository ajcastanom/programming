import java.io.*;
import java.util.*;

public class uva_102 {
    public static void main(String Args[])throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        
        StringTokenizer st;
        String s;
        int b[] = new int[3];
        int g[] = new int[3];
        int c[] = new int[3];
        while((s=br.readLine())!=null){;
            st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                for(int i=0; i<3; i++){
                    b[i]= Integer.parseInt(st.nextToken());
                    g[i]= Integer.parseInt(st.nextToken());
                    c[i]= Integer.parseInt(st.nextToken());
                }
            }
            
            int min;            
            String orden="BGC";
            min=sumas(b,g,c);
            
            int valor;
            if(min>=(valor=sumas(b,c,g))){
                if(min==valor && orden.compareTo("BCG")>0)orden = "BCG";
                else if(min>valor){
                    orden = "BCG";
                    min = valor;
                }                
            }
            if(min>=(valor=sumas(c,b,g))){
                if(min==valor && orden.compareTo("CBG")>0)orden = "CBG";
                else if(min>valor){
                    orden = "CBG";
                    min = valor;
                }                
            }
            if(min>=(valor=sumas(c,g,b))){
                if(min==valor && orden.compareTo("CGB")>0)orden = "CGB";
                else if(min>valor){
                    orden = "CGB";
                    min = valor;
                }                
            }
            if(min>=(valor=sumas(g,b,c))){
                if(min==valor && orden.compareTo("GBC")>0)orden = "GBC";
                else if(min>valor){
                    orden = "GBC";
                    min = valor;
                }                
            }
            if(min>=(valor=sumas(g,c,b))){                
                if(min==valor && orden.compareTo("GCB")>0)orden = "GCB";
                else if(min>valor){
                    orden = "GCB";
                    min = valor;
                }                
            }
            System.out.println(orden+" "+min);
        }
    }
    
    static int sumas(int v1[], int v2[], int v3[]){        
        return v1[1]+v1[2]+v2[0]+v2[2]+v3[0]+v3[1];
    }
}

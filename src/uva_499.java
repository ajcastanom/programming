import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uva_499 {
    public static void main(String Args[]) throws IOException{
        //BufferedReader br = new BufferedReader(new FileReader("entrada"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str, r;
        char c;
        int n, mayor, dif;
        while((str=br.readLine()) != null){
            str=str.replaceAll(" ", "");  
            n=0;
            mayor=0;
            dif=0;
            r="";
            while(str.length()>0){
                c = str.charAt(0);
                //se valida que solo sean letras
                if(!((c>='a' && c<= 'z') || (c>='A' && c<= 'Z'))){
                    str=str.substring(1);
                    continue;
                }
                n=str.length();
                //System.out.println(str+" tamaño antes: "+str.length());
                if(str.length()> 1){
                    str=str.replaceAll(""+c, "");
                    dif = str.length();
                }
                else{
                    str = "";
                    dif = 0;
                }
                //System.out.println(str+" tamaño: "+str.length());
                
                if(n-dif>mayor){
                    r=""+c;
                    mayor = n-dif;
                }
                else if(n-dif == mayor){
                    r+=c;
                }
            }
            //si hay mas de un caracter se ordenan alfabeticamente
            if(r.length()>1){
                char cr[] = r.toCharArray();
                char aux;
                r="";
                for(int i=0; i<cr.length-1; i++){
                    for(int j=i+1; j< cr.length; j++){
                        if(cr[j]<cr[i]){
                            aux = cr[i];
                            cr[i] = cr[j];
                            cr[j] = aux;
                        }
                    }
                    r+=cr[i];
                }
                r+=cr[cr.length-1];
            }
            System.out.println(r+" "+mayor);
        }
    }    
}

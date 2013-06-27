import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class uva_10340 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String str1, str2, respuesta, str;

       while (br.ready()){
            str=br.readLine();
            str1 = str.substring(0, str.indexOf(" "));
            str2 = str.substring(str.indexOf(" ")+1);
            
            
            //if(str1.length()>str2.length()) continue;
            int j=0;
            respuesta = "No";
            for(int i=0; i<str2.length(); i++){
                if(str1.charAt(j)==str2.charAt(i)){
                    j++;
                    if(j==str1.length()){
                        i=str2.length();
                        respuesta="Yes";
                    }
                }
            }
            System.out.println(respuesta);
        }      
    }    
}

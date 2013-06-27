import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


public class uva_272 {
    public static void main(String Args[]) throws IOException{
        //BufferedReader br = new BufferedReader(new FileReader("entrada"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        boolean sw=true;
        
        while((str=br.readLine()) != null){
            for(int i=0; i< str.length(); i++){
                if(str.charAt(i)=='"'){
                    if(sw){
                        sw = false;
                        str=str.substring(0, i)+"``"+str.substring(i+1);
                    }
                    else{
                        sw = true;
                        if(i == str.length()-1) str = str.substring(0, i)+"''";
                        else str=str.substring(0, i)+"''"+str.substring(i+1);
                    }
                }
            }
            System.out.println(str);
        }
    }    
}

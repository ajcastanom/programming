import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class uva_11636 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i=1;
        while(n>-1){
            System.out.println("Case "+i+": "+ ((int)Math.ceil(Math.log(n) / Math.log(2))));
            n = Integer.parseInt(br.readLine());            
            i++;
        }
    }
}

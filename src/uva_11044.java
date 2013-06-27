import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva_11044 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        int min=0;
        StringTokenizer stk;
        
        for(int i=1; i<=n; i++){
            stk=new StringTokenizer(br.readLine());
            min=(int)(Integer.parseInt(stk.nextToken())/3) * (int)(Integer.parseInt(stk.nextToken())/3);
            System.out.println(min);
        }
    }
}
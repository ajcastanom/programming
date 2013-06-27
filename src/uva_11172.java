import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva_11172 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        StringTokenizer stk;
        int num1, num2;
        
        for(int i=1; i<=n; i++){
            stk = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(stk.nextToken());
            num2 = Integer.parseInt(stk.nextToken());
            
            if(num1>num2)System.out.println(">");
            else if(num1==num2)System.out.println("=");
            else System.out.println("<");
        }
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva_10071 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r, v, t;
        StringTokenizer stk;
        do{
            stk = new StringTokenizer(br.readLine());
            v= Integer.parseInt(stk.nextToken());
            t=Integer.parseInt(stk.nextToken());
            
            System.out.println(v*2*t);
        }while(br.ready());
    }
}

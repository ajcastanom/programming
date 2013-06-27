import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class uva_10055 {
    public static void main(String Args[]) throws IOException{
        //BufferedReader br = new BufferedReader(new FileReader("entrada"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s1, s2;
        
        StringTokenizer stk;
        do{
            stk = new StringTokenizer(br.readLine());
            s1 = Long.parseLong(stk.nextToken());
            s2 = Long.parseLong(stk.nextToken());
            System.out.println(Math.abs(s2-s1));
        }while(br.ready());
    }
}

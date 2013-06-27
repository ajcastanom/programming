import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva_10300 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s1, s2, r;
        int n = Integer.parseInt(br.readLine());
        int m;
        StringTokenizer stk;
        for(int i=1; i<=n; i++){
            m = Integer.parseInt(br.readLine());
            r=0;
            for(int j=1; j<=m; j++){
                stk = new StringTokenizer(br.readLine());
                s1= Long.parseLong(stk.nextToken());
                stk.nextToken();
                s2= Long.parseLong(stk.nextToken());
                r+=(s1*s2);
            }
            System.out.println(r);            
        }        
    }
}

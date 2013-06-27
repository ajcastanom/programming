import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva_10550 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a=0, b=0, c=0, d=0, g=0;
        StringTokenizer stk;
        
        do{
            stk = new StringTokenizer(br.readLine());
            a=Integer.parseInt(stk.nextToken());
            b=Integer.parseInt(stk.nextToken());
            c=Integer.parseInt(stk.nextToken());
            d=Integer.parseInt(stk.nextToken());
            if((a+b+c+d)==0) break;
            if(b>a)g=(40-b)+a;
            else g=a-b;
            
            if(c<b)g+=(40-b)+c;
            else g+=c-b;
                
            if(d>c)g+=(40-d)+c;
            else g+=c-d;
            System.out.println((1080+g*9));
        }while((a+b+c+d)!=0);
    }
}

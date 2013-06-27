import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class uva_11479 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n=Long.parseLong(br.readLine());
        long l1, l2, l3;
        StringTokenizer stk;
        
        for(long i=1; i<=n; i++){
            stk = new StringTokenizer(br.readLine());
            l1=Long.parseLong(stk.nextToken());
            l2=Long.parseLong(stk.nextToken());
            l3=Long.parseLong(stk.nextToken());
            
            //ver si es un triangulo: suma de dos de sus lados mayor que el otro
            if(l1+l2>l3 && l1+l3>l2 && l2+l3>l1){
                //equilactero
                if(l1==l2 && l1==l3) System.out.println("Case "+i+": Equilateral");
                //isosceles
                else if(l1==l2 || l1==l3 || l2==l3) System.out.println("Case "+i+": Isosceles");
                //escaleno
                else System.out.println("Case "+i+": Scalene");
            }
            else System.out.println("Case "+i+": Invalid");
        }
    }
}

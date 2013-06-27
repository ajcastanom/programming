import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class uva_100 {
    public static void main(String Args[]) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s;
        int n1, n2;
        while((s=br.readLine())!=null){
            st = new StringTokenizer(s);
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            int aux1, aux2;
            aux1 = Math.min(n1, n2);
            aux2 = Math.max(n1, n2);
            int max=1;
            int cont; 
            int n;
            for(int i=aux1; i<=aux2;i++){   
                cont=1;
                n = i;
                while(n!=1){
                    cont++;
                    if(n%2==0) n=n/2;
                    else  n=3*n+1;
                }
                max = Math.max(max, cont);
            }
            System.out.println(n1+" "+n2+" "+max);
        }
    }    
}

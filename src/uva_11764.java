import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva_11764 {
    public static void main(String Args[]) throws IOException{
        //BufferedReader br = new BufferedReader(new FileReader("entrada"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            int tam = Integer.parseInt(br.readLine());
            int muro, aux, alto=0, bajo=0;
            StringTokenizer stk = new StringTokenizer(br.readLine());
            muro = Integer.parseInt(stk.nextToken());
            for(int j=1; j<tam; j++){
                aux=Integer.parseInt(stk.nextToken());
                if(aux>muro){
                    alto++;
                }
                else if(aux<muro){
                    bajo++;
                }
                muro=aux;
            }
            System.out.println("Case "+i+": "+alto+" "+bajo);
        }
    }    
}

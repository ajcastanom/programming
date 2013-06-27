import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva_591 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, prom, mov, set=0;
        StringTokenizer stk;
        
        while((n=Integer.parseInt(br.readLine().trim()))!=0){
            int muro[]=new int[n];
            stk = new StringTokenizer(br.readLine());
            prom=mov=0;
            set++;
            for(int i=0; i<n; i++){
                muro[i]=Integer.parseInt(stk.nextToken());
                prom+=muro[i];
            }
            prom/=n;
            for(int i=0; i<n; i++){
                if(muro[i]>prom)mov+=(muro[i]-prom);
            }
            System.out.println("Set #"+set+"\nThe minimum number of moves is "+mov+".\n");
        }
    }
}
import java.util.Scanner;

public class uva_11805 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T, N, K, P, casos[];
        T = sc.nextInt();
        casos = new int[T];
        for(int i=0; i<T; i++){
            N = sc.nextInt();
            K = sc.nextInt();
            P = sc.nextInt();
            if(P>N) P = P%N;
            if(K+P > N) casos[i] = P-N+K;
            else casos[i] = P+K;
        }
        for(int i=0; i<T; i++){
            System.out.println("Case "+(i+1)+": "+casos[i]);
        }
    }
}
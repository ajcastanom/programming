import java.util.Scanner;
import java.math.BigInteger;

public class uva_900 {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        BigInteger[] fibonacci=new BigInteger[52]; 
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;
        int numfi = 1;
        int n;
        while((n=sc.nextInt())>0){    
            n++;
            if(n>numfi){
                BigInteger aux1;
                BigInteger aux2; 
                for(int i=numfi+1;i<=n;i++){
                    aux1 = fibonacci[i-2];
                    aux2 = fibonacci[i-1];
                    fibonacci[i]=aux1.add(aux2);                         
                }
                numfi=n;                
            }
            System.out.println(fibonacci[n]);
        }
    }
}

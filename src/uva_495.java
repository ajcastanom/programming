import java.util.Scanner;
import java.math.BigInteger;

public class uva_495 {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        BigInteger[] fibonacci=new BigInteger[5001]; 
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;
        int numfi = 1;
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            
            if(n==0) System.out.println("The Fibonacci number for "+0+" is "+0);
            else if(n==1) System.out.println("The Fibonacci number for "+1+" is "+1);
            else{
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
                System.out.println("The Fibonacci number for "+n+" is "+fibonacci[n]);
            }
        }
    }
}
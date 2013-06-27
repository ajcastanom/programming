import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class uva_10106 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num;
        do{
            num=new BigInteger(br.readLine());
            System.out.println(num.multiply(new BigInteger(br.readLine())));
        }while(br.ready());
    }    
}

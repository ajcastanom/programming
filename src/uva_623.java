import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.math.BigDecimal;

public class uva_623 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger bi;
        
        String str;
        do{
            str = br.readLine();
            bi = new BigInteger("1");
            for(int i=2; i<=Integer.parseInt(str); i++){
                bi=bi.multiply(new BigInteger(""+i));
            }
            System.out.println(str+"!\n"+bi.toString());
        }while(br.ready());
    }
}

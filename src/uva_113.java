import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class uva_113 {
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("entrada"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short n; // para el exponente
        BigInteger p; // para el p grande

        do {
            n = Short.parseShort(br.readLine());
            p = new BigInteger(br.readLine());
            System.out.println(Math.round(Math.pow(Math.E,
            (Math.log(p.doubleValue()) / n))));
        }while(br.ready());
 }
}

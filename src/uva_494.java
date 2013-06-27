import java.util.StringTokenizer;
import java.util.Scanner;

public class uva_494 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = null;
        StringTokenizer st = null;
        while(sc.hasNext()){
            s = sc.nextLine();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) != ' ' && !(s.charAt(i)>= 'a' && s.charAt(i)<= 'z' || s.charAt(i)>= 'A' && s.charAt(i)<= 'Z')){
                    s = s.replace(""+s.charAt(i), " ");
                }
            }
            st = new StringTokenizer(s);
            System.out.println(st.countTokens());
        }
    }
}
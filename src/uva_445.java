import java.io.BufferedReader;
import java.io.InputStreamReader;

public class uva_445 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "", aux = "", l = "";
        int num = 0;
        boolean sw = true;
        do{
            aux = br.readLine();
            if(aux == null) s="\n";
            for(int i=0; i<aux.length(); i++){
                if(aux.charAt(i) == '!') s += "\n";
                else if(aux.charAt(i) >= '0' && aux.charAt(i)<= '9') num += Integer.parseInt(""+aux.charAt(i));
                else if(aux.charAt(i) == 'b' || aux.charAt(i) == '*' || (aux.charAt(i) >= 'A' && aux.charAt(i) <= 'Z')){
                    for(int j=0; j<num; j++){
                        if(aux.charAt(i) == 'b'){
                            s += " ";
                        }
                        else{
                            s += aux.charAt(i);
                        }
                    }
                    num = 0;
                }
            }
            System.out.println(s);
            s = "";
        }while(br.ready());
    }
}
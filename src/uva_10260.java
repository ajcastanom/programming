import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class uva_10260{
    public static void main(String Args[]) throws IOException{
        //BufferedReader br = new BufferedReader(new FileReader("entrada"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        boolean letrasJuntas = false;//verifica que la letra no este junto a otra de igual representacion
        String r1 = new String("BFPV");//Conjunto de letras representacion 1
        String r2 = new String("CGJKQSXZ");//Conjunto de letras representacion 2
        String r3 = new String("DT");//Conjunto de letras representacion 3
        String r4 = new String("L");//Conjunto de letras representacion 4
        String r5 = new String("MN");//Conjunto de letras representacion 5
        String r6 = new String("R");//Conjunto de letras representacion 6
        
        String palabra;//contiene cada palabra que es leida en cada linea dentro del while
        int representacion; //indica a que representacion pertenece la letra i de la palabra
        int rAux;//guarga el valor de la representacion anterior;
        do{
            palabra=br.readLine();
            rAux=0;
            for(int i=0; i<palabra.length(); i++){
                letrasJuntas=true;
                //Determinar a que tipo de representacion pertenece la letra
                if(r1.indexOf((""+palabra.charAt(i))) != -1) representacion = 1;
                else if(r2.indexOf((""+palabra.charAt(i))) != -1) representacion = 2;
                else if(r3.indexOf((""+palabra.charAt(i))) != -1) representacion = 3;
                else if(r4.indexOf((""+palabra.charAt(i))) != -1) representacion = 4;
                else if(r5.indexOf((""+palabra.charAt(i))) != -1) representacion = 5;
                else if(r6.indexOf((""+palabra.charAt(i))) != -1) representacion = 6;
                else{
                    letrasJuntas = false;//esta representacion no es un Soundex coding
                    representacion = 0;
                }
                //
                
                switch(representacion){
                    case 0://La letra no pertenece a Soundex coding
                        break;
                    default://La letra pertenece a Soundex coding
                        if(letrasJuntas){
                            if(representacion!=rAux) System.out.print(representacion);
                        }
                        else System.out.print(representacion);
                        break;                                    
                }
                
                rAux=representacion;
            }
            System.out.print("\n");
        }while(br.ready());
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class UVA_10038 {
	public static void main(String args[]) throws IOException{
		//BufferedReader br = new BufferedReader(new FileReader("entrada"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer strk;
		while(br.ready()){	  
			strk = new StringTokenizer(br.readLine());
	        int n = Integer.parseInt(strk.nextToken());
	        int[] r = new int[n-1];
	        int a;
	        int b = 0;
	        boolean s= false;
	        for(int i = 0; i < n - 1; ++i){
	        	if(i == 0){
	        		a = Integer.parseInt(strk.nextToken());
	        	} else {
	        		a = b;
	        	}
	        	
	        	b = Integer.parseInt(strk.nextToken());
	        	if(Math.abs(a-b) > n-1 || Math.abs(a-b) == 0 || r[Math.abs(a-b)-1] == 1){
	        		System.out.println("Not jolly");
	        		s = true;
	        		break;
	        	} else {
	        		r[Math.abs(a-b)-1] = 1;
	        	}
	        }
	        if(!s)System.out.println("Jolly");
		}
    }
}

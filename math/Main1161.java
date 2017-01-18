/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author rous
 */
public class Main1161 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        StringBuilder path = new StringBuilder(new File(".").getCanonicalPath());
        path.append("/src/datos.txt");
        FileInputStream fis = new FileInputStream(path.toString());
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while(br.ready()){
            int [] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();       
            
            sb.append(factorial(data[0])+factorial(data[1]));
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
    
    public static long factorial(int a){
        switch (a) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                long aux=1;
                for (int i = 1; i <= a; i++) {
                    aux*=i;
                }
                return aux;
        }
    }
}

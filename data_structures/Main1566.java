/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;


/**
 *
 * @author rous
 */
public class Main1566 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        short tam = Short.parseShort(br.readLine());
        for (int i = 0; i < tam; i++) {
            br.readLine();
            int arrayInt[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arrayInt);            
            StringBuilder sb = new StringBuilder();            
            for (int j = 0; j < arrayInt.length; j++) {
                if(j==arrayInt.length-1){
                    sb.append(arrayInt[j]).append("\n");
                }else{
                    sb.append(arrayInt[j]).append(" ");
                }                
            }
            con.write(sb.toString());
            con.flush();
        }
        br.close();
        con.close();
    }
}

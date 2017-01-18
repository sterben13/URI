/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author rous
 */
public class Main2137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String path = new File(".").getCanonicalPath() + "/src/datos.txt";
        //InputStreamReader isr = new InputStreamReader(System.in);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        int tam = 0;
        String [] array;
        while(br.ready()){
            tam = Integer.parseInt(br.readLine());
            array = new String[tam];
            for (int i = 0; i < tam; i++) {
                array[i]=br.readLine();
            }
            Arrays.sort(array);
            for (int i = 0; i < tam; i++) {
                System.out.println(array[i]);
            }
        }
    }

}

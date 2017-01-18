/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhoc;

import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author rous
 */
public class Problem1026ToCarryornottoCarry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        /*String path = new java.io.File(".").getCanonicalPath() + "/src//datos.txt";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);*/
        PrintWriter pw = new PrintWriter(System.out);
        long [] datos;
        while (br.ready()) {            
            datos = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            pw.println(datos[0] ^ datos[1]);
            pw.flush();
        }
        pw.close();
    }
}

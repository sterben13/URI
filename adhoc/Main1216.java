/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhoc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author rous
 */
public class Main1216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //String path = new File(".").getCanonicalPath() + "/src/datos.txt";
        InputStreamReader isr = new InputStreamReader(System.in);
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        double distancia = 0;
        double can = 0;
        while (br.ready()) {
            br.readLine();
            distancia += Double.parseDouble(br.readLine());
            can++;
        }
        double promedio = distancia / can;
        pw.printf("%.1f\n", promedio);
        pw.flush();
        pw.close();
    }
}

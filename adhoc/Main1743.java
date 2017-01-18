/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;

/**
 *
 * @author rous
 */
public class Main1743 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        String l1[] = br.readLine().split(" ");
        String l2[] = br.readLine().split(" ");
        BitSet b1 = new BitSet(5), b2 = new BitSet(5);
        BitSet aux = new BitSet(5);
        for (int i = 0; i < 5; i++) {
            b1.set(i, (l1[i].equals("1")));
            b2.set(i, (l2[i].equals("1")));
            aux.set(i, true);
        }
        b1.xor(b2);
        if (b1.equals(aux)) {
            pw.println("Y");
            pw.flush();
        } else {
            pw.println("N");
            pw.flush();
        }
        pw.close();
    }
}

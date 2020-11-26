/** *****
 * Read input from System.in
 * Use: System.out.println to ouput your result to STDOUT.
 * Use: System.err.println to ouput debugging information to STDERR.
 * ** */
package BattleDev2020;

import java.util.*;

public class Trun1 {

    public static void main(String[] argv) throws Exception {
        int line;
        ArrayList<Integer> l = new ArrayList<Integer>();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            line = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < line; i++) {

                String input = sc.nextLine();

                String[] sp = input.split(" ");
                int word = Integer.parseInt(sp[0]);
                int word1 = Integer.parseInt(sp[1]);
                int word2 = Integer.parseInt(sp[2]);
                 
                l.add(word);
                l1.add(word1);
                l2.add(word2);
                
                System.out.println(l+" "+l1+" "+l2.get(l2.size() - 1));
                 

            //System.out.println(word+" "+word1+" "+word2);
            }
            System.out.println("Fini");
        }
        /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
    }
}

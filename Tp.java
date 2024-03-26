/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author InclusivAcademy008
 */
public class Tp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] laListe = {1,0,8,7,2,6};
        int[] trtrtr = triageCroissant(laListe);
        System.out.print(Arrays.toString(trtrtr));

    }
    public static ArrayList tableauNombre(){
        ArrayList<String> laListe = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            laListe.add(sc.nextLine());
        }
        System.out.println(laListe);
        return laListe;
        
    }      
    

    public static int[] triageCroissant(int[] tableau) {
        int n = tableau.length;
        for (int j = 0; j < n; n--) {
            for (int i = 0; i < n - 1; i++) {
                int temp = 0;
                if (tableau[i] > tableau[i + 1]) {
                    temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                }
            }
        }
        return tableau;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan27.hurufbesarkecil;

import java.util.Scanner;

public class PBO210116058Latihan27Hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner doyen = new Scanner(System.in);

        String kalimat;

        System.out.print("Masukkan Kalimat : ");
        kalimat = doyen.nextLine();

        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat.toLowerCase();

        System.out.println("=========Hasil Formating==========");
        System.out.println("Huruf Besar : " + kalimat1);
        System.out.println("Huruf Kecil : " + kalimat2);
    }

}e application logic here
    }
    
}

package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int i) {
        int suma=0;
        int br=0;
        while(i != 0) {
            br = i % 10;
            suma += br;
            i = i / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
	System.out.println("Unesite n: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i;
    for(i=2; i<n; i++) {
        if(i % sumaCifara(i) == 0)
            System.out.println(i);

    }
    }


}

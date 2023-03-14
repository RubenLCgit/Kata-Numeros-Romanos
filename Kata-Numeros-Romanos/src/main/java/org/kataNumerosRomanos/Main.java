package org.kataNumerosRomanos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número y te lo convertiré en su correspondiente número Romano: ");
        int num=Integer.parseInt(entrada.next());

        Conversor conv = new Conversor();

        System.out.println(conv.convert(num));
    }
}
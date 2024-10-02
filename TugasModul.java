package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class TugasModul4 {
    static void salam(String Halo) {
        System.out.println("Salam :" + Halo);
    }

    static String returnText() {
        return "Selamat datang di burjo 18";
    }

    static String returnParam(String text) {
        return text;
    }

    static void pilihMenu() {
        String[] pilihan = {"paket 1: ayam bakar","paket 2: ayam goreng", "paket 3: ayam bali",
                "paket 4: ayam bakar + es teh manis","paket 5: ayam goreng + teh hangat"};

        System.out.println(Arrays.toString(pilihan));
    }

}

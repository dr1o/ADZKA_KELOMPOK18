package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class TugasModul4 {
    //adzka
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

    public void bayar() {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan jumlah pesanan (masukan angka): ");
        int angka = input.nextInt();
        input.nextLine();
        
        int[] harga = {13000,12000,13000,15000,15000};
        int[] menu = new int[angka];
        int totalbayar = 0;
        for (int i = 0;i<angka;i++){
            System.out.print("pilih menu ke-" + (i+1)+ "(masukan nomor paket):");
            menu[i] = input.nextInt();
            input.nextLine();
            if(menu[i]>5){
                System.out.print("menu paket tidak tersedia, input lagi menu ke-" + (i+1)+ "(masukan nomor paket):");
                menu[i] = input.nextInt();
            }
            totalbayar += harga[menu[i]-1];
        }

        System.out.println("pilihan paket makanan anda: " + Arrays.toString(menu));
        System.out.println("total bayar: " + totalbayar);
    }

    public String intro(String nama, int waktu) {
        return "terima kasih " + nama + " karena sudah memesan, pesanan anda akan segera diproses dalam "
                + waktu + " menit";
    }

    public static void main(String[] args) {
        //penggunaan function non-return type dengan mengisi argument pada parameter kelompok
        salam("Halo");

        //penggunaan function return type tanpa parameter
        System.out.println(returnText());

        //penggunaan function return type dengan mengisi argument pada parameter
        System.out.println(returnParam("silahkan pilih menu di bawah ini"));


        //penggunaan function non-return type tanpa parameter
        pilihMenu();

        //method
        TugasModul4 objek = new TugasModul4();

        objek.bayar();
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama anda: ");
        String nama = input.nextLine();
        String printMe = objek.intro(nama, 5);
        System.out.println(printMe);

    }

}


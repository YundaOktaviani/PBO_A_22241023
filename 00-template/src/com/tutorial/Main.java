package com.tutorial;

class Mahasiswa {
    String nama;
    String NIM;
    String prodi;
}

public class Main {
    public static void main(String[] args) {
        // instasiansi pembuatan objek//
        Mahasiswa mhs1 = new Mahasiswa();

        // objek mhs1 diberi atribut//
        mhs1.nama = "Yunda";
        mhs1.NIM = "22241023";
        mhs1.prodi = "PTI";

        System.out.println("nama Mahasiswa :" + mhs1.nama);
        System.out.println("NIM :" + mhs1.NIM);
        System.out.println("program studi :" + mhs1.prodi);

        // ############//
        Mahasiswa mhs2 = new Mahasiswa();

        // objek mhs2 diberi atribut//
        mhs2.nama = "Irza";
        mhs2.NIM = "22241039";
        mhs2.prodi = "PTI";

        System.out.println("nama Mahasiswa :" + mhs2.nama);
        System.out.println("NIM :" + mhs2.NIM);
        System.out.println("program studi :" + mhs2.prodi);

    }
}

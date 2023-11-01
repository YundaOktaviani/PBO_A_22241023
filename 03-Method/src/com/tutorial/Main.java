package com.tutorial; 

class Mahasiswa{
    //Data Member
    String nama;
    String nim;
    String prodi;

    //construktor dengan parameter
    Mahasiswa(String Nama, String NIM, String Prodi) {
        this.nama = Nama;
        this.nim = NIM;
        this.prodi = Prodi;

    }

    //method tanpa parameter dan tanpa return
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Prodi : " + this.prodi);
    }

    //method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;

    }

    //method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    //method dengan return dan parameter
    String sayHi(String pesan) {
        return pesan + "pacar jefri nichol " + this.nama;

    }
}

public class Main {
    public static void main(String[] args) {
        //instansiasi objek
        Mahasiswa mhs1 = new Mahasiswa("YUNDA", "22241023", "PTI");

        mhs1.show(); 
        mhs1.setNama("Nichol");
        mhs1.show();
        System.out.println(mhs1.getNama());

        
        String pesan = mhs1.sayHi("Hallo");
        System.out.println(pesan);


    }
}

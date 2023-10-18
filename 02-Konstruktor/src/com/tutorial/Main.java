package com.tutorial;

    //String tanpa kontruktor//
        class polos {
            String dataString;
            int dataInteger;

        }
    
        //class dengan kontruktor//
        class Mahasiswa {
            String nama;
            String nim;
            String prodi;
        
        
        //membuat konstruktor tanpa 
        // Mahasiswa() {
        //     System.out.println(x:"ini adalah konstruktor");

        // }

        //membuat konstruktor dengan parameter
          Mahasiswa (String inputNama, String inputNIM, String inputProdi) {
            nama = inputNama;
            nim = inputNIM;
            prodi = inputProdi;

            System.out.println("nama : " + nama);
            System.out.println("nim : " + nim);
            System.out.println("prodi : " + prodi);


          }


    }


public class Main {
    public static void main(String[] args) {
        //instansiasi objek dari class polos
        // polos pls= new polos();

        // //isi ciri pada objek pls
        // pls.dataString = "POLOS";
        // pls.dataInteger = 10;

        // //cetak data
        // System.out.println("Isi Data String :" + pls.dataString);
        // System.out.println("Isi Data Integer :" + pls.dataInteger);

        Mahasiswa mhs1Mahasiswa = new Mahasiswa("yunda", "22241023", "PTI");
    }

}


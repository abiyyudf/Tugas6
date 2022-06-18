/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

/**
 *
 * @author abiyy
 */
import java.util.Arrays;

public class Main {
    static Manusia manusia[];
    static MahasiswaFILKOM mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args) {
        //Manusia
        manusia = new Manusia[3];
        System.out.println();
        System.out.println("Nama : Abiyyu Dwi Fawwazy");
        System.out.println("NIM  : 215150707111042");
        System.out.println();
        System.out.println("======= Manusia =======\n");
        manusia[0] = new Manusia("Randy Orton", "317302120302", true, true);
        manusia[1] = new Manusia("Maria Sharapova", "307305160303", false, true);
        manusia[2] = new Manusia("Justinus Lhaksana", "337301140304", true, false);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        //MahasiswaFILKOM
        mahasiswa = new MahasiswaFILKOM[3];
        System.out.println("======= Mahasiswa =======");
        mahasiswa[0] = new MahasiswaFILKOM("225150700111002", 3.6, "Rizky Fadhillah", "199925029106", false, true);
        mahasiswa[1] = new MahasiswaFILKOM("195150300111002", 3.7, "Bunga Rismawati", "2003829374606", false, false);
        mahasiswa[2] = new MahasiswaFILKOM("205150607111037", 3.8, "Nissa Kinaya", "2002682923109", false, false);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        //Pekerja
        pekerja = new Pekerja[3];
        System.out.println("======= Pekerja =======");       
        pekerja[0] = new Pekerja(9, 24, "702120302456", "Evonnebaug", "2933242352524", false, true);
        pekerja[1] = new Pekerja(8, 23, "621892457862", "Xoos", "243245245224", false, true);
        pekerja[2] = new Pekerja(7, 22, "317302121245", "Hugh Jackman", "203245244642", true, true);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

        //Manager
        manager = new Manager[3];
        System.out.println("======= Manager =======");
        manager[0] = new Manager(6, 30, "200225229106", "anya chan", "2001647443", false, true, 1500);
        manager[1] = new Manager(7, 24, "200225729106", "gon kun", "1987456362362", true, true, 1450);
        manager[2] = new Manager(9, 20, "204837283728", "gojo sama", "351707384392", false, false, 1500);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());

        //Jumlah
        System.out.println("======= Jumlah =======");
        System.out.println("Jumlah Manusia : " + manusia.length);
        System.out.println("Jumlah MahasiswaFILKOM : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja : " + pekerja.length);
        System.out.println("Jumlah Manager : " + manager.length);
    }
}
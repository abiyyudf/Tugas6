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
public class MahasiswaFILKOM extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean statusmenikah) {
        super(nama, NIK, jenisKelamin, statusmenikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String angkatan = "20" + NIM.substring(0,2);
        String angka = NIM.substring(6,7);
        String prodi = "";
        switch (angka) {
            case "2":
                prodi = "Teknik Meniup Gelembung";
                break;
            case "3":
                prodi = "Teknik Berburu Ubur Ubur";
                break;
            case "4":
                prodi = "Sistem Perhamburgeran";
                break;
            case "6":
                prodi = "Pendidikan Chum Bucket";
                break;
            case "7":
                prodi = "Teknologi Telepon Kerang";
                break;
            default:
                break;
        }
        return prodi + " " + angkatan;
    }

    public double getBeasiswa(){
        if(IPK >= 3.0 && IPK <= 3.5){
            return 50;
        } else if(IPK >= 3.5 && IPK <= 4.0){
            return 75;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        System.out.println("Nama : " + this.getNama());
        System.out.println("NIK : " + this.getNIK());
        System.out.println("Jenis Kelamin : " + (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan : " + "$" + (this.getBeasiswa() + this.getTunjangan()));
        System.out.println("NIM : " + this.getNIM());
        System.out.println("IPK : " + this.getIPK());
        System.out.println("Status : " + this.getStatus());
        return "";
    }
}
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
public class Manusia {

    private String nama;
    private boolean jenisKelamin;
    private String NIK;
    private boolean statusmenikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.statusmenikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getstatusMenikah() {
        return statusmenikah;
    }

    public void setstatusMenikah(boolean menikah) {
        this.statusmenikah = menikah;
    }

    public double getTunjangan(){
        if (statusmenikah == true){
            if(jenisKelamin == true){
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        double pendapatan = getTunjangan();
        return pendapatan;
    }

    @Override
    public String toString() {
        System.out.println("Nama : " + this.getNama());
        System.out.println("NIK : " + this.getNIK());
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan : " + "$" + this.getPendapatan());
        return " ";
    }
}
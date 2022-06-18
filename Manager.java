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
public class Manager extends Pekerja {

    

    public Manager(int jamKerja, int hariKerja, String NIP, String nama, String NIK,
            boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }
    private int lamaKerja;
    
    public int getLamaKerja() {
        return this.lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public String toString() {
        System.out.println("Nama : " + this.getNama());
        System.out.println("NIK : " + this.getNIK());
        System.out.println("NIP : " + this.getNIP());
        System.out.println("Jenis Kelamin : " + (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan : " + "$"
                + (this.getGaji() + (this.getBonus() + (this.getBonus() * 30 / 100)) + (this.getTunjangan() + 15)));
        System.out.println("Bonus : " + "$" + (this.getBonus() + (this.getBonus() * 30 / 100)));
        System.out.println("Gaji : " + "$" + this.getGaji());
        System.out.println("Status : " + this.getStatus());
        System.out.println("Lama Kerja : " + this.getLamaKerja() + " hari");
        return "";
    }
}
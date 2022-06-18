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
public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin,
            boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        gaji = this.hariKerja * this.jamKerja * 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

        public double getBonus(){
        double hariLibur = 0;
        for (int i = 1; i <= this.hariKerja; i++) {
            if (i % 7 == 0){
                hariLibur = hariLibur + 2;
            }
        }
        double bonusLembur = (this.hariKerja - hariLibur) * (this.jamKerja - 7) * 7;
        double bonusLibur = hariLibur * this.jamKerja * 20;
        return bonus = bonusLembur + bonusLibur;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;

    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        String kantorCabang = NIP.substring(0,1);
        String noKantorCabang = NIP.substring(2,3);
        String departemen = NIP.substring(6,7);
        // Kantor Cabang
        switch (kantorCabang) {
            case "1":
                kantorCabang = "Mondstadt";
                break;
            case "2":
                kantorCabang = "Liyue";
                break;
            case "3":
                kantorCabang = "Inazuma";
                break;
            case "4":
                kantorCabang = "Sumeru";
                break;
            case "5":
                kantorCabang = "Fontaine";
                break;
            case "6":
                kantorCabang = "Natlan";
                break;
            case "7":
                kantorCabang = "Snezhnaya";
                break;
            default:
                break;
        }
        // Departemen
        switch (departemen) {
            case "1":
                departemen = "Pemasaran";
                break;
            case "2":
                departemen = "Humas";
                break;
            case "3":
                departemen = "Riset";
                break;
            case "4":
                departemen = "Teknologi";
                break;
            case "5":
                departemen = "Personalia";
                break;
            case "6":
                departemen = "Akademik";
                break;
            case "7":
                departemen = "Administrasi";
                break;
            case "8":
                departemen = "Operasional";
                break;
            case "9":
                departemen = "Pembagian";
                break;
            default:
                break;
        }
        return departemen + " , " + kantorCabang + " " + noKantorCabang;
    }

    @Override
    public String toString() {
        System.out.println("Nama : " + this.getNama());
        System.out.println("NIK : " + this.getNIK());
        System.out.println("Jenis Kelamin : " + (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan : " + "$" + (this.getGaji() + this.getBonus() + this.getTunjangan()));
        System.out.println("Bonus : " + "$" + this.getBonus());
        System.out.println("Gaji : " + "$" + this.getGaji());
        System.out.println("Status : " + this.getStatus());

        return "";
    }
}
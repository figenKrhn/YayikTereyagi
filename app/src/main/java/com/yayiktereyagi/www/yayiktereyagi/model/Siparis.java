package com.yayiktereyagi.www.yayiktereyagi.model;

/**
 * Created by WİN8.1 on 1/18/2017.
 */

public class Siparis {
    String kisiAdi;
    String tarih;
    String miktar;
    int siparisDurum;
    long neZaman;

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getMiktar() {
        return miktar;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }

    public int getSiparisDurum() {
        return siparisDurum;
    }

    public void setSiparisDurum(int siparisDurum) {
        this.siparisDurum = siparisDurum;
    }

    public long getNeZaman() {
        return neZaman;
    }

    public void setNeZaman(long neZaman) {
        this.neZaman = neZaman;
    }

    public String getKisiAdi() {

        return kisiAdi;
    }

    public void setKisiAdi(String kisiAdi) {
        this.kisiAdi = kisiAdi;
    }

    public Siparis(String kisiAdi, String tarih, String miktar, long neZaman, int siparisDurum) {
        this.kisiAdi = kisiAdi;
        this.tarih = tarih;
        this.miktar = miktar;
        this.siparisDurum = siparisDurum ;
        this.neZaman = neZaman;
    }
    public Siparis(String tarih, String miktar, int siparisDurum) {

        this.tarih = tarih;
        this.miktar = miktar;
        this.siparisDurum = siparisDurum ;

    }

}

package com.yayiktereyagi.www.yayiktereyagi.model;

/**
 * Created by WİN8.1 on 1/18/2017.
 */
public class GoruntulenenSiparis {


    String tarih;
    String miktar;
    int siparisDurum;
   // public GoruntulenenSiparis(){}

    public GoruntulenenSiparis(String tarih,String miktar,  int siparisDurum) {
        this.tarih = tarih;
        this.miktar = miktar;
        this.siparisDurum = siparisDurum ;
    }

    public GoruntulenenSiparis(String tarih, String miktar, String siparisDurum) {
    }

    public String getMiktar() {
        return miktar;
    }

    public String getTarih() {
        return tarih;
    }

    public int getSiparisDurum() {
        return siparisDurum;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }

    public void setSiparisDurum(int siparisDurum) {
        this.siparisDurum = siparisDurum;
    }
}

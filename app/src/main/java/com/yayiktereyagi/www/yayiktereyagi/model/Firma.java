package com.yayiktereyagi.www.yayiktereyagi.model;

import java.util.ArrayList;

/**
 * Created by WİN8.1 on 1/18/2017.
 */
public class Firma{
    String firmaAdi;
    String kisiAdi;
    String miktar;
    long neZaman;
    String tarih;
    int siparisDurum;

    ArrayList<GoruntulenenSiparis> siparislerim;



    public Firma(String firmaAdi, String kisiAdi, String miktar, long neZaman, String tarih, int siparisDurum) {
        this.firmaAdi = firmaAdi;
        this.kisiAdi = kisiAdi;
        this.miktar = miktar;
        this.neZaman = neZaman;
        this.tarih=tarih;
        this.siparisDurum=siparisDurum;
    }
    public Firma(String firmaAdi, String kisiAdi, String miktar, String tarih, int siparisDurum) {
        this.firmaAdi = firmaAdi;
        this.kisiAdi = kisiAdi;
        this.miktar = miktar;
        this.tarih=tarih;
        this.siparisDurum=siparisDurum;
    }
}

package com.example.okul.listviewornek;

/**
 * Created by okul on 9.9.2015.
 */
public class Araba {
    private  int id;
    private String resim;
    private String adi;
    private int adet;
//sağ tuş generate/consructer
    public Araba( int id, String adi, String resim, int adet) {
        this.adet = adet;
        this.adi = adi;
        this.id = id;
        this.resim = resim;
    }
    //sağ tuş generate/get and set
    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}

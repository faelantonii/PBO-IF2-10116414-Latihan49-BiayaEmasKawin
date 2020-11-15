/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan49_BiayaEmasKawin;

/**
 *
 * @author sweenutt
 */
public class BiayaEmasKawin {
    private double emasKawin;
    private double hargaSatuGram;

    public double getEmasKawin() {
        return emasKawin;
    }

    public void setEmasKawin(double emasKawin) {
        this.emasKawin = emasKawin;
    }

    public double getHargaSatuGram() {
        return hargaSatuGram;
    }

    public void setHargaSatuGram(double hargaSatuGram) {
        this.hargaSatuGram = hargaSatuGram;
    }
    
    public double hitungTotalPembayaran(double e, double h) {
        return e * h;
    }
}

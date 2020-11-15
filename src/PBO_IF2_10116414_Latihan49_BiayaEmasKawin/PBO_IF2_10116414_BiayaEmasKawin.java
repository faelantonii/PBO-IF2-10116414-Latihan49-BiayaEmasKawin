/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan49_BiayaEmasKawin;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan biaya emas kawin
 */
public class PBO_IF2_10116414_BiayaEmasKawin {
    public static void main(String[] args) {
       BiayaEmasKawin biayaemaskawin = new BiayaEmasKawin();
        biayaemaskawin.setEmasKawin(15.7);
        biayaemaskawin.setHargaSatuGram(570000);
        
        System.out.println("Hendri membeli emas kawin : " + biayaemaskawin.getEmasKawin() + " gram");
        System.out.println("Harga 1 gram emas per bulan oktober ini : Rp. " + biayaemaskawin.getHargaSatuGram());
        System.out.println();
        
        double emas_kawin = biayaemaskawin.getEmasKawin();
        double harga_satu_gram = biayaemaskawin.getHargaSatuGram();
        
        System.out.println("Total pembayaran yang harus dikeluarkan : Rp. " + biayaemaskawin.hitungTotalPembayaran(emas_kawin, harga_satu_gram));
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

/**
 *
 * @author user
 */
public class kasir extends pembeli {
    private String nama_kasir;
    private int tgl;
    
    public kasir(int id_pembeli, String nama_pembeli, String alamat, int no_telp, String nama_kasir, int tgl, int id_barang,String nama_barang,int harga_barang,String merk_barang )
    {
        super(id_barang,nama_barang,harga_barang,merk_barang,id_pembeli,nama_pembeli, alamat, no_telp);
        this.nama_kasir = nama_kasir;
        this.tgl = tgl;
    }
    public void tampilkan()
    {
        System.out.println("Welcome");
        System.out.println("-----------------------------------");
        System.out.println("Nama Kasir      :" +this.nama_kasir);
        System.out.println("Tanggal         :" +this.tgl);
        super.tampilkan();
    }
}

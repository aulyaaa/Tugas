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
public class barang{
    private int id_barang;
    private String nama_barang;
    private int harga_barang;
    private String merk_barang;
    
    public barang (int id_barang,String nama_barang,int harga_barang,String merk_barang)
    {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
        this.merk_barang = merk_barang;
    }
    public void tampilkan()
    {
        System.out.println("id barang       :" +this.id_barang);
        System.out.println("Nama Barang     :" +this.nama_barang);
        System.out.println("Harga Barang    :" +this.harga_barang);
        System.out.println("Merk Barang     :" +this.merk_barang);
    }
    public void total()
    {
        System.out.println("----------------------------------");
        System.out.println("Total Barang         :" +harga_barang);
    }
}

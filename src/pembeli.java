/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class pembeli extends barang{
    private int id_pembeli;
    private String nama_pembeli;
    private String alamat;
    private int no_telp;
    
    public pembeli(int id_barang,String nama_barang,int harga_barang,String merk_barang,int id_pembeli, String nama_pembeli, String alamat, int no_telp)
    {
        super(id_barang,nama_barang,harga_barang,merk_barang);
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    public void tampilkan()
    {
        System.out.println("id pembeli      :" +this.id_pembeli);
        System.out.println("Nama Pembeli    :" +this.nama_pembeli);
        System.out.println("Alamat          :" +this.alamat);
        System.out.println("No Telp         :" +this.no_telp);
        super.tampilkan();
    }
}

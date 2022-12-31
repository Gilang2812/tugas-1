//Inheritanese
public class satuan extends barang{
       Double harga;
    //constructor
    public satuan(String nama,Double harga, Double banyak ){
        super(nama);
        this.totalHarga=harga*banyak;
    } 
}

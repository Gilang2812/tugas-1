
public class barang implements laundry{
     protected String nama ;
    protected Double totalHarga = 0.0 ;

    //Constructor
    public barang(String nama)
    {
        this.nama=nama;
       
    }

    public Double getBarang()
    {
        return totalHarga;
    }
    public void setBarang(double totalHarga)
    {
        System.out.println( nama+"\nTotal : "+totalHarga);
    }   

    @Override
    public void mencuci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mengeringkan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

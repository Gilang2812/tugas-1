public class Dosen extends Elemen {
    int  jumlahHariKerja;

    public Dosen( String nama,int jumlahHariKerja){
        super(nama);
        this.jumlahHariKerja=jumlahHariKerja*8;
    }


    public int getJamSibuk(){
        return jumlahHariKerja;
    }
    public void setJamSibuk(){
        System.out.println(nama+" adalah seorang Dosen Dengan Jam Sibuk "+ this.jumlahHariKerja);
    }
}

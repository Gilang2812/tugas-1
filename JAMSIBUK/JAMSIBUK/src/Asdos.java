public class Asdos extends Mahasiswa {
    int jamNgasdos;

    public Asdos( String nama,int sks,int jamNgasdos){
        super(nama, sks);
        this.jamNgasdos=jamNgasdos+sks*3;
    }

    public int getJamSibuk()
    {
        return jamNgasdos;
    }
    public void setJamSibuk(){
        System.out.println(nama+" adalah seorang Asdos Dengan Jam Sibuk "+ this.jamNgasdos);
    }
}

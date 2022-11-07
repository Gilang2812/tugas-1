class Mahasiswa extends Elemen {
    int sks;
    public Mahasiswa(String nama, int sks){
        super(nama);
        this.sks=sks*3;
    
    }

    public int getJamSibuk(){
        return sks;
    }
    public void setJamSibuk(){
        System.out.println(nama+" adalah seorang Mahasiswa Dengan Jam Sibuk "+ this.sks);
    }
}

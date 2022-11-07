public class App {
    public static void main(String[] args) throws Exception {
        
        Asdos f = new Asdos("Fairuzi-kun", 21, 10);
        Dosen r = new Dosen("Raja OP Damanik", 5);
        Asdos a = new Asdos("Angle-Can",20 , 4);
        Mahasiswa f2= new Mahasiswa("Firman", 20);
        Mahasiswa m= new Mahasiswa("Nid to pass this man", 23);
        Dosen n= new Dosen("Nivotko", 3);
        // Elemen t = new Elemen(null)


        f.setJamSibuk();
        r.setJamSibuk();
        a.setJamSibuk();
        f2.setJamSibuk();
        m.setJamSibuk();
        n.setJamSibuk();
        int totalJamSibuk=f.jamNgasdos+r.jumlahHariKerja+a.jamNgasdos+f2.sks+m.sks+n.jumlahHariKerja;
        System.out.println("Total jam sibuk elemen fasilkom adalah : " + totalJamSibuk);




    }
}

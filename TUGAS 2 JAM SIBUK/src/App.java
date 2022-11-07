public class App {
    public static void main(String[] args) throws Exception {
        
        Asdos f = new Asdos("Fairuzi-kun", 21, 10);//downcasting
        Dosen r = new Dosen("Raja OP Damanik", 5); //downcasting
        Asdos a = new Asdos("Angle-Can",20 , 4); //downcasting
        Mahasiswa f2= new Mahasiswa("Firman", 20);//downcasting
        Mahasiswa m= new Mahasiswa("Nid to pass this man", 23);//downcasting
        Dosen n= new Dosen("Nivotko", 3);//downcasting
        // Elemen t = new Elemen(null)

        f.setJamSibuk();//polimophism
        r.setJamSibuk();//polimophism
        a.setJamSibuk();//polimophism
        f2.setJamSibuk();//polimophism
        m.setJamSibuk();//polimophism
        n.setJamSibuk();//polimophism
        int totalJamSibuk=f.jamNgasdos+r.jumlahHariKerja+a.jamNgasdos+f2.sks+m.sks+n.jumlahHariKerja;
        System.out.println("Total jam sibuk elemen fasilkom adalah : " + totalJamSibuk);

        //



    }
}

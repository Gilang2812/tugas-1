public class VirtualDemo {
    public static void main(String[] args) {
       
        //objek nama, address, kubar berasalah dari kelass Pegawai yang di exted dari class gaji yang disebut dengan downcasting
        Gaji s = new Gaji("Wahyu","KUBAR",3,5000.00);
        
        /*Memanggil objek method salary dari method yang ada di kelas anak atau class Gaji yaitu salary
        yang disebut dengan up casting*/
        Pegawai e = new Gaji("Gilang","Samarinda",2,2500.00);
        
        //Menampilkan
        System.out.println("memanggil mailcheck berdasarkan referensi gaji--");
        s.mailCheck();//Memanggil method mailCheck dari class Gaji menggunakan variable s

        System.out.println("\nmemanggil mailcheck berdasarkan referensi pegawai--");
        e.mailCheck();//Memanggil method mailCheck dari class Pegawai menggunakan variable e
        
    }
}
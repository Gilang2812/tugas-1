package tugas;
import java.util.ArrayList;

public class tugas6 {
    public static void main(String[] args) {
        //String[] nama = new String[4];
        ArrayList<String> nama = new ArrayList<String>();

        nama.add("i");
        nama.add("s");
        nama.add("m");
        nama.add("a");

        nama.add(0,"e");
        System.out.println("Element setelah menambahkan string e " + nama);
    
        nama.add(2,"f");
        System.out.println("Element setelah menambahkan string f " + nama);
    
        nama.add(3,"g");
        System.out.println("Element setelah menambahkan string g " + nama);
    
        nama.add(4,"h");
        System.out.println("Element setelah menambahkan string h " + nama);
    
        nama.add(6,"h");
        System.out.println("Element setelah menambahkan string h " + nama);
    
        nama.add(-3,"j");
        System.out.println("Element setelah menambahkan string j " + nama);
    }
}

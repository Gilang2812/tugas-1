package tugas;
import java.util.ArrayList;

public class tugas3 {
    public static void main(String[] args) {
        //String[] nama = new String[4];
        ArrayList<String> nama = new ArrayList<String>();

        nama.add("i");
        nama.add("s");
        nama.add("m");
        nama.add("a");
        
        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));    
    }
    
}
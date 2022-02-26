package tugas;
import java.util.ArrayList;

public class tugas5 {
    public static void main(String[] args) {
        //String[] nama = new String[4];
        ArrayList<String> nama = new ArrayList<String>();

        nama.add("i");
        nama.add("s");
        nama.add("m");
        nama.add("a");
        
        System.out.println("ArrayList sebelum remove:");
        for(String var: nama){
             System.out.println(var);
        }
            nama.remove(0);
            nama.remove(3);
            nama.remove(2);
            System.out.println("ArrayList setelah remove:");
                for(String var2: nama){
                 System.out.println(var2); 
                }
        
    }
    
}

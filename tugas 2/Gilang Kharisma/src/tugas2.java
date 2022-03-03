import java.util.LinkedList;
import java.util.Set;

import Linked_List.linked_list;

public class tugas2 {
    public static void main(String[] args) {
       
        //Biodata

        System.out.println("=============================================================");
        System.out.println("Nama\t\t: Gilang Kharisma");
        System.out.println("Nim/BP\t\t: 2111522002 ");
        System.out.println("=============================================================");

        //tugas

        //Dketahui saya={Gilang Kharisma}

        LinkedList<String> saya = new LinkedList<>();
        saya.add("G");
        saya.add("I");
        saya.add("L");
        saya.add("A");
        saya.add("N");
        saya.add("G");
        saya.add(" ");
        saya.add("K");
        saya.add("H");
        saya.add("A");
        saya.add("R");
        saya.add("I");
        saya.add("S");
        saya.add("M");
        saya.add("A");
  
        System.out.println("Nama saya : "+ saya+"\tukuran\t:"+saya.size());
        System.out.println("--------------------------------------------------------------------------------------------");
        
        //1. add

        saya.addFirst("&");
        saya.addFirst("I");
        saya.addFirst("G");
        saya.addFirst("E");
        saya.add(" ");
        saya.add("S");
        saya.add("E");
        saya.add("L");
        saya.add("A");
        saya.add("M");
        saya.add("A");
        saya.addLast("N");        
        saya.add("Y");
        saya.add("A");
        

        System.out.println("Saya Add: "+ saya+"\tukuran\t:"+saya.size());
        System.out.println("--------------------------------------------------------------------------------------------");

        //2. Sisip/Set

        saya.set(12,"B");
        saya.set(13,"E");
        saya.set(14,"R");
        saya.set(15,"S");
        saya.set(16,"A");

        System.out.println("Saya Set: "+ saya+"\tukuran\t:"+saya.size());
        System.out.println("--------------------------------------------------------------------------------------------");

        //3.Remove/Menghapus

        saya.remove(11);
        
        System.out.println("Saya Remove: "+ saya+"\tukuran\t:"+saya.size());
        System.out.println("--------------------------------------------------------------------------------------------");

        //4.Push

        saya.push("Pasangan");

        System.out.println("Push\t:"+saya+"\tukuran\t:"+saya.size());
        System.out.println("----------------------------------------------");
        
        //5. POP
        String a = saya.pop();
        String b = saya.pop();
        String c = saya.pop();

        System.out.println("pop\t:"+saya+"\tukuran\t:"+saya.size());
        System.out.println("----------------------------------------------");

    }  
}

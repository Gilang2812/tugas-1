import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class tugas3 {
public static void main(String[] args) {
    /**************percobaan 1 gagal**************/
    
    // // LinkedList<String> data= new LinkedList<>();

    /**************percobaan 2 gagal**************/

    // Scanner data1 = new Scanner(System.in);
    // int noBp;
    // String alamat,nama;

    // // data.add("No.BP");
    // // data.add("Nama");
    // // data.add("Alamat");
    // System.out.print("alamat\t: ");
    // alamat = data1.nextLine();

    // System.out.print("nama\t: ");
    // nama = data1.nextLine();

    // System.out.print("No Bp\t: ");
    // noBp = data1.nextInt();

    // System.out.println("=======================");
    // System.out.println("No BP\t: "+noBp );
    // System.out.println("Nama\t: "+nama);
    // System.out.println("Alamat\t:"+ alamat);
    // System.out.println("-----------------------");

    /**************PERCOBAAN 3**************/

    LinkedList<Integer> data1 = new LinkedList<>();
    LinkedList<String> data2 = new LinkedList<>();
    LinkedList<String> data3 = new LinkedList<>();
    Scanner ketik=new Scanner(System.in);
    String add,name;
    int no;

    System.out.print("alamat\t: ");
    add = ketik.nextLine();
    data3.add(add);
    data3.add("city");

    System.out.print("nama\t: ");
    name = ketik.nextLine();
    data2.add(name);

    System.out.print("No Bp\t: ");
    no = ketik.nextInt();
    data1.add(no);
    
    System.out.println("===============================");
    System.out.println("No. Bp :" + data1+"\n   *isEmpty?\t :"+data1.isEmpty());
    System.out.println("\n");
    System.out.println("Nama\t: "+ data2);
    System.out.println("\n");
    System.out.println("alamat\t: "+data3+"\n   *ukuran\t:"+data3.size()+"\n   *Index city\t: "+data3.indexOf("city")+"\n   *tmp\t\t:"+ data3.get(0));
    System.out.println("------------------------------");
    System.out.println("Fungsi Pop Push Remove Set");
    System.out.println("------------------------------");

    data3.set(1,"kota");
    data2.push("Panggilan :");
    data3.pop();
    System.out.println("No. Bp :" + data1+"\n   *Kosong?\t :"+data1.isEmpty());
    System.out.println("\n");
    System.out.println("Nama\t: "+ data2);
    System.out.println("\n");
    System.out.println("alamat\t: "+data3+"\n   *ukuran\t:"+data3.size()+"\n   *Index city\t: "+data3.indexOf("city")+"\n   *tmp\t\t:"+ data3.get(0));
  
    System.out.println("***************End***************");
    
}
}

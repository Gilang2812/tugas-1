

import java.lang.runtime.SwitchBootstraps;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i=0;
        Integer b;
        boolean bool=true;
        Queue<Integer> motor=new LinkedList<>();
        
        Scanner isi= new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Antrian Isi Bensin Motor");
        System.out.println("============================");
        System.out.println(" ");

        do{
       
            
            System.out.print("Pilih : ");
            int a=isi.nextInt();
            switch(a){
                case 1:
                System.out.print("Kapasitas motor dipertamina : ");
                i=0;
                int m=isi.nextInt();
                do{
                    System.out.print("merek : ");
                    b=isi.nextInt();
                    motor.add(b);
                    i++;
        
                }
                while(i<m);
                System.out.println("Motor : "+motor);
                
                break;
                
                case 2:
                System.out.println("*Satu Motor selesai");
                System.out.println(motor.poll());
                System.out.println(motor);

                break;
                case 3:
                System.out.println("Motor Paling Depan : "+motor.peek());

                break;

                case 4:
                System.out.println("Apakah Pertamina kosong :" + motor.isEmpty());

                break;

                case 5:
                System.out.println("Antrian : "+motor);

                break;

                case 6:
                System.out.println("*Bensin Habis");
                motor.clear();
                System.out.println("Motor :"+motor);

                break;
                case 7:
                System.exit(0);

                break;
            }
            
        }
        while(bool);    
    }    
}    

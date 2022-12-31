
import com.mysql.jdbc.Statement;

import java.util.*;
import java.sql.*;
import java.time.Clock;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class tugas_besar extends javax.swing.JFrame {
    final static String driver = "com.mysql.jdbc.Driver";
    final static String url ="jdbc:mysql://localhost:3306/dblaundry";
    final static String username = "root";
    final static String password = "";
    
    static Statement statementSQL;
    static Connection connectionSQL;
    static ResultSet resultSetSQL;
    
    


  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
      
        boolean loop = true;
        Scanner pilih = new Scanner(System.in);
        
         //8. COLECTION FRAMEWORK (HASHMAP)
        HashMap <Integer,String> daftLayanan= new HashMap<>();
        
       
     
        daftLayanan.put(2, "Transakasi\t\t");
        daftLayanan.put(1, "Daftar member\t\t");
        daftLayanan.put(3, "Tambah member\t\t");
        daftLayanan.put(4, "Hapus member\t\t");
        daftLayanan.put(5, "Edit\t\t");
        daftLayanan.put(6, "Exit");
       
        
        // 5. PERULANGAN
        do {            
            System.out.println(" ");
            System.out.println("\t        ***Laundry ATiga***");
            System.out.println(" ");
            
            daftLayanan.keySet().forEach((i) -> {
                System.out.println("\t\t" + i + ". " + daftLayanan.get(i));
            });
            
            System.out.println("\n\t=======================================");
            System.out.println(" ");
        
            try {
                   System.out.print("\tpilih menu (nomor): ");
                int menu = pilih.nextInt();
                System.out.println("-------------------------------------------");
                
                // 9. PERCABANGAN
                switch (menu) 
                {
            
                    //READ   
                    case 1:
                        
                        dataAnggota();
                        break;
                        
                    case 2:
                        LocalDate  myObj = LocalDate.now(); // Create a date object
                         
                        
                            Class.forName(driver);
                             connectionSQL = DriverManager.getConnection(url,username,password);
                            statementSQL = (Statement) connectionSQL.createStatement();
                            String SQL = "SELECT * FROM anggota";
                            resultSetSQL = statementSQL.executeQuery(SQL);
                            resultSetSQL.next();
                        System.out.println("transaksi");
                        
                        System.out.println("nama: ");
                        String anggota= pilih.next();
                          if (anggota == null ? resultSetSQL.getString("nama") != null : !anggota.equals(resultSetSQL.getString("nama")) )
                            {
                                System.err.println("Nama TIdak tersedia");
                                break;
                            }
                        System.out.println("barang :");
                        String barang= pilih.next();
                        System.out.print("nilai :");
                        double berat = pilih.nextDouble();
                        if ("baju".equals(barang))
                        {  
                            
                            barang baju = new kiloan("", berat);
                        }else if ("selimut".equals(barang))
                        {
                            double banyak = pilih.nextInt();
                            barang selimut = new satuan("elimut", 10000.0, banyak);
                        }
                            
                        System.out.println("--Struk-- "); 
                        System.out.println("nama : " + anggota);
                        System.out.println("barang :"+ barang);
                        System.out.println("total harga "+ berat*8000);  
                        System.out.println("Tanggal : "+myObj);     
                        
                        break;
                        
                  
                       
                    //CREATE
                    case 3:
                        try { 
                            Class.forName(driver);
                            connectionSQL = DriverManager.getConnection(url,username,password);
                            statementSQL = (Statement) connectionSQL.createStatement();
                            
                            System.out.println("Tambah Member");
                            System.out.println(" ");
                            System.out.print("Nama \t\t:  ");
                            pilih.nextLine();
                            String nama = pilih.next();
                            nama = nama.toLowerCase();
                            System.out.print("Nomor Hp \t: ");
                            pilih.nextLine();
                            String noHp = pilih.next();
                        
                            String table = "INSERT INTO anggota VALUES('" + noHp + "','" + nama +"');";
                            statementSQL=(Statement) connectionSQL.createStatement();
                            statementSQL.execute(table);
                        
                        } catch(InputMismatchException e){
                            System.out.println("Terdapat Kesalah Input");
                            loop = false;
                        }catch (SQLException ex) {
                            Logger.getLogger(tugas_besar.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                   
                        
                        
                        break;
                        
                    //DELETE
                    case 4:
                        try {
                            Class.forName(driver);
                             connectionSQL = DriverManager.getConnection(url,username,password);
                            statementSQL = (Statement) connectionSQL.createStatement();
                            String dataNama = "SELECT * FROM anggota";
                            resultSetSQL = statementSQL.executeQuery(dataNama);
                            resultSetSQL.next();
                            
                            System.out.println("Hapus Member");  
                            System.out.println(" ");
                            System.out.print("Nama / no. Hp \t\t: ");
                            pilih.nextLine();
                            String hapus = pilih.next();
                            String delete = hapus.toLowerCase();
                            
                            if (delete == null ? resultSetSQL.getString("nama") != null : !delete.equals(resultSetSQL.getString("nama")) )
                            {
                                System.err.println("Nama TIdak tersedia");
                            }
                                    
                            String table = "DELETE FROM anggota WHERE nama='" + delete + "' ";
                            statementSQL = (Statement) connectionSQL.createStatement();
                            statementSQL.execute(table);   
                            
                           
                        }catch(InputMismatchException e){
                            System.out.println("Terdapat Kesalah Input");
                            loop = false;
                        } catch (Exception e) {
                            
                        }
                        break;
                        
                        //EDIT / UPDATE
                    case 5:
                        try {
                            Class.forName(driver);
                             connectionSQL = DriverManager.getConnection(url,username,password);
                            statementSQL = (Statement) connectionSQL.createStatement();
                            
                            System.out.println("Edit Member");
                            System.out.println(" ");
                            System.out.print("Nama lama \t\t: ");
                            pilih.nextLine();
                            String namaLama = pilih.next();
                            System.out.print("Nama baru \t\t: ");
                            pilih.nextLine();
                            String namaBaru = pilih.next();
                            
                            String table = "UPDATE anggota set nama='" + namaBaru + "' WHERE nama = '" + namaLama + "' ";
                            statementSQL = (Statement) connectionSQL.createStatement();
                            statementSQL.execute(table);
                        } catch(InputMismatchException e){
                            System.out.println("Terdapat Kesalah Input");
                            loop = false;
                        }catch (Exception e) {
                        }
                       break;
                    case 6 : 
                        System.exit(menu);
                        
                        
                        
                        
                }
                
            } catch (Exception e) {
            }
         
        } while (loop);    
    }
        
        private static void dataAnggota() throws ClassNotFoundException{
            try { Class.forName(driver);
            connectionSQL = DriverManager.getConnection(url,username,password);
            statementSQL = (Statement) connectionSQL.createStatement();
            String table = "SELECT * FROM anggota";
            resultSetSQL = statementSQL.executeQuery(table);
                while (resultSetSQL.next()) {                    
                    System.out.println("nama : "+resultSetSQL.getString("nama")+  "\t\t| "  +"no hp : "+ resultSetSQL.getString("no_hp"));  
                  
                }
               
            } catch (SQLException ex) { 
            Logger.getLogger(tugas_besar.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

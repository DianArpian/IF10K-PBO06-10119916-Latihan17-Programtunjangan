/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan17.programtunjangan;
import java.util.Scanner;


/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program :  Operator  
 */
public class PBO0610119916Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String status;
        float gaji, tunjangan, totalGaji;
        
        gaji = 0;
        
        Scanner input = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("=========== Program Tunjangan ===========");
        System.out.print("Berapa gaji poko anda perbulan ?: Rp. ");
        gaji = input.nextInt();
        System.out.print("Status anda ? (Menikah/belum)   : ");
            status = input.next();
            if(gaji >= 6000000 && status.equals("Menikah") || status.equals("menikah") ){              
                    tunjangan =(float) (0.35*gaji); 
                    totalGaji = gaji+tunjangan;
                    System.out.println("=========== Hasil Perhitungan Gaji Anda ===========");
                    System.out.println("Gaji Pokok      : Rp. " + gaji);        
                    System.out.println("Tunjangan       : Rp. " + tunjangan);        
                    System.out.println("Total Gaji       : Rp. " + totalGaji);
            }else{
                System.out.println("=========== Hasil Perhitungan Gaji Anda ===========");
                tunjangan = 0; 
                System.out.println("Gaji Pokok      : Rp. " + gaji);        
                System.out.println("Tunjangan       : Rp. " + tunjangan);        
                System.out.println("Total Gaji       : Rp. " + gaji + tunjangan);
            }


        
    }
    
}
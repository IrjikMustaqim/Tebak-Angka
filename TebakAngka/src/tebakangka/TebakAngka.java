/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tebak;
        int jumlahKesempatan = 0;
        int bonus;
        tebakAngkaGenerator mainkan = new tebakAngkaGenerator();
        Scanner tebakan = new Scanner(System.in);
        mainkan.acakAngka();
        while (true){
            jumlahKesempatan +=1;
            if (mainkan.gameover() == false){
                System.out.println("Tebaklah angka yang sudah diacak ");
                tebak = tebakan.nextInt();
                if(!mainkan.angkaCocok(tebak) && tebak > mainkan.angkaBenar){
                    System.out.println("Hehehe.... Bilangan tebakan anda terlalu besar");
                }else if(!mainkan.angkaCocok(tebak) && tebak < mainkan.angkaBenar){
                    System.out.println("Hehehe.... Bilangan tebakan anda terlalu kecil");
                }else if (mainkan.angkaCocok(tebak)){
                    break;
                }
            }else{
                break;
            }
            
        }
        if (jumlahKesempatan <= 5){
            bonus = 50;
        }else{
            bonus = 0;
        }
        
        System.out.println("Skor Anda : " + mainkan.skor + "\n" + "Bonus : " + bonus+ "\n" + "Total Skor : " + (mainkan.skor+bonus) );
    }
    
}

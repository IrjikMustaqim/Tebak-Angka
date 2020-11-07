/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.Random;
/**
 *
 * @author user
 */
public class tebakAngkaGenerator {
    int angkaBenar;
    int skor = 100;
    boolean tebakanBenar;
    
    public void acakAngka(){
        Random hai = new Random();
        this.angkaBenar = hai.nextInt(100)+1;        
    }
    
    public boolean angkaCocok(int angkaTebakan){
        if (this.angkaBenar == angkaTebakan){
            this.tebakanBenar = true;            
        }else {
            this.tebakanBenar = false;
            this.skor -= 2;
        }
        
        return this.tebakanBenar;
    }
    
    public boolean gameover(){
        if (this.skor == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
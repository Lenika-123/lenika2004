/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

/**
 *
 * @author student
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of"+num+"is"+fact);
    }
    
}

// Masukkan Bilangan :
// n! = n * (n-1) * (n-2) * ... * 1

import java.util.Scanner;

class Faktorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan Bilangan : ");
        int bilangan = scn.nextInt();
        int faktorial = 1;
        String str_faktorial = "";
        
        for(int i=bilangan; i >= 1; i--) {
            faktorial *= i;
            str_faktorial += i;
            if(i == 1) {
                str_faktorial += " = ";
            }
            else {
                str_faktorial += " x ";
            }
        }
        
        System.out.print(bilangan + "! = ");
        System.out.print(str_faktorial);
        System.out.println(faktorial);
    }
}
























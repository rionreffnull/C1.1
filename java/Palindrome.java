import java.util.Scanner;

class Palindrome {
    public static boolean cek_palindrome(String tulisan) {
        tulisan = tulisan.toLowerCase();
        tulisan = tulisan.replaceAll("[^a-z0-9]", "");
        int i_kiri= 0;
        int i_kanan = tulisan.length() - 1;
        
        while(i_kiri < i_kanan) {
            if(tulisan.charAt(i_kiri) != tulisan.charAt(i_kanan)) {
                return false;
            }
            i_kiri += 1;
            i_kanan -= 1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Tulisan : ");
        String tulisan = scn.nextLine();
        
        if(cek_palindrome(tulisan) == true) {
            System.out.println(tulisan + " adalah palindrome");
        }
        else {
            System.out.println(tulisan + " bukan palindrome");
        }
    }
    
    
    
}

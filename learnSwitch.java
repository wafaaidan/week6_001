import java.util.Scanner;

public class learnSwitch {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        System.out.println("Apakah Anda Manusia?:  ");
        String confirm = ns.nextLine();

        if(confirm.toLowerCase().equals("ya")) {
            System.out.println("Menu");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Exit");
            System.out.println("Exit");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan = ns.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Menghitung Luas persegi");
                    int sisi, luasPersegi;
                    System.out.println("Masukkan nilai SISI: ");
                    sisi = ns.nextInt();
                    luasPersegi = sisi * sisi;

                    if(sisi > 0){

                        if(luasPersegi > 1000 && luasPersegi < 2000){
                            System.out.println("Luas Persegi= " + luasPersegi + " ==> Besar");
                        } else if (luasPersegi < 500 && luasPersegi <= 1000) {
                            System.out.println("Luas Persegi= " + luasPersegi + " ==> Sedang");
                        } else if (luasPersegi < 500 && luasPersegi > 0) {
                            System.out.println("Luas Persegi= " + luasPersegi + " ==> Kecil");
                        } else if (luasPersegi < 0) {
                            System.out.println("Ukuran Tidak Valid");
                        } else {
                            System.out.println("Persegi sangat besar");
                        }
                    } else {
                        System.out.println("Input Anda tidak valid");
                    }
                    break;
                
                case 2:
                    System.out.println("Menghitung Luas persegi");
                    int panjang, lebar, luasPersegiPanjang;
                    System.out.println("Masukkan nilai Panjang: ");
                    panjang = ns.nextInt();
                    System.out.println("Masukkan nilai Lebar: ");
                    lebar = ns.nextInt();
                    luasPersegiPanjang = panjang * lebar;
                    if(panjang > 0 && lebar > 0){
                        
                        if(luasPersegiPanjang > 1000 && luasPersegiPanjang < 2000){
                            System.out.println("Luas Persegi Panjang= " + luasPersegiPanjang + " ==> Besar");
                        } else if (luasPersegiPanjang < 500 && luasPersegiPanjang <= 1000) {
                            System.out.println("Luas Persegi Panjang= " + luasPersegiPanjang + " ==> Sedang");
                        } else if (luasPersegiPanjang < 500 && luasPersegiPanjang > 0) {
                            System.out.println("Luas Persegi Panjang= " + luasPersegiPanjang + " ==> Kecil");
                        } else if (luasPersegiPanjang < 0) {
                            System.out.println("Ukuran Tidak Valid");
                        } else {
                            System.out.println("Persegi Panjang sangat besar");
                        }
                      
                    } else {
                        System.out.println("Input Anda tidak valid");
                    }
                    

                    
                    break;
            
                default:
                    break;
            }
        } else {
            System.out.println("No Accsess");
        }
        
        ns.close();
    }
}

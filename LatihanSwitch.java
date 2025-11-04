import java.util.Scanner;

public class LatihanSwitch {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        System.out.print("Apakah Anda Terdaftar?:  ");
        String confirm = ns.nextLine();

        if(confirm.toLowerCase().equals("ya")) {
            System.out.println("Menu");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("3. Sepeda");
            System.out.println("Exit");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan = ns.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Perhitungan Biaya Tol Mobil");
                    int jarak, totalBiaya;
                    System.out.println("Input totalBiaya tempuh pengguna: ");
                    jarak = ns.nextInt();
                    totalBiaya = 5000 * jarak;

                    if(jarak > 80){

                        if(totalBiaya > 50.000){
                            System.out.println("Total biaya = " + totalBiaya + " ==> Perjalanan jauh");
                        } else if (totalBiaya >= 20.000 && totalBiaya < 50.000) {
                            System.out.println("Total biaya = " + totalBiaya + " ==> Perjalanan sedang");
                        } else if (totalBiaya > 0 && totalBiaya < 20.000) {
                            System.out.println("Total biaya = " + totalBiaya + " ==> Perjalanan dekat");
                        } else {
                            System.out.println("Jarak terlalu dekat");
                        }
                    } else {
                        System.out.println("Kurang jauh perjalanan Anda");
                    }
                    break;
                
                case 2:
                System.out.println("Perhitungan Biaya Tol Mobil");
                int jarakMotor, totalBiayaMotor;
                System.out.println("Input totalBiaya tempuh pengguna: ");
                jarakMotor = ns.nextInt();
                totalBiayaMotor = 5000 * jarakMotor;

                if(jarakMotor > 80){

                    if(totalBiayaMotor > 50.000){
                        System.out.println("Total biaya = " + totalBiayaMotor + " ==> Perjalanan jauh");
                    } else if (totalBiayaMotor >= 20.000 && totalBiayaMotor < 50.000) {
                        System.out.println("Total biaya = " + totalBiayaMotor + " ==> Perjalanan sedang");
                    } else if (totalBiayaMotor > 0 && totalBiayaMotor < 20.000) {
                        System.out.println("Total biaya = " + totalBiayaMotor + " ==> Perjalanan dekat");
                    } else {
                        System.out.println("jarakMotor terlalu dekat");
                    }
                } else {
                    System.out.println("Kurang jauh perjalanan Anda");
                }
                    break;
            
                default:
                    break;
                
                case 3:
                System.out.println("Perhitungan Biaya Tol Mobil");
                int jarakSepeda, totalBiayaSe;
                System.out.println("Input totalBiayaSe tempuh pengguna: ");
                jarakSepeda = ns.nextInt();
                totalBiayaSe = 5000 * jarakSepeda;

                if(jarakSepeda > 80){

                    if(totalBiayaSe > 50.000){
                        System.out.println("Total biaya = " + totalBiayaSe + " ==> Perjalanan jauh");
                    } else if (totalBiayaSe >= 20.000 && totalBiayaSe < 50.000) {
                        System.out.println("Total biaya = " + totalBiayaSe + " ==> Perjalanan sedang");
                    } else if (totalBiayaSe > 0 && totalBiayaSe < 20.000) {
                        System.out.println("Total biaya = " + totalBiayaSe + " ==> Perjalanan dekat");
                    } else {
                        System.out.println("Jarak terlalu dekat");
                    }
                } else {
                    System.out.println("Kurang jauh perjalanan Anda");
                }    
                
            }
        } else {
            System.out.println("No Accsess");
        }
        
        ns.close();
    }
}



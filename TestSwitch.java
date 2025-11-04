import java.util.Scanner;

public class TestSwitch{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        int line;
        System.out.println("Top Sinco Owie quotes");
        System.out.println("Numero: ");
        line = myScanner.nextInt();
            
        switch (line){
            case 1:
            System.out.println("Yo ndak tau kok tanya saya");
            break;    
            
            case 2:
            System.out.println("uooh... kaget");
            break;   

            case 3:
            System.out.println("selamat, berjuang... sukses");
            break;   

            case 4:
            System.out.println("we wok de tok, not anle tok de tok");
            break;  
            
            case 5:
            System.out.println("di sini hadir dari sabang sampai merauke, bapaknya dari mana?");
            break;   

        }
        myScanner.close();
    }
}
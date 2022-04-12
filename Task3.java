import java.util.Scanner; 
public class Task3 {
    public static void main(String[] arga){
        int angka;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        angka = input.nextInt();
        
        for(int i = 1; i <= angka;i++){
            total += i;
            System.out.print(i+"+");
        }
        System.out.print("=" + total);
    }
}


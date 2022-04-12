import java.util.Scanner;
public class Task6 {

    public void sumNumberInArray(int n, int k){

    int a[] = new int[n];

    System.out.println("Masukkan angka");
    for(int i = 0; i < a.length; i++)
    {
        a[i] = new Scanner(System.in).nextInt();

    }
    int sum = 0;
    int result = 0;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            if(i != j){
                sum = a[i] + a[j];
                if (sum == k) {
                    result++;
                }
            }

        }
    }
    if (result > 0) {
        System.out.println("Bisa");

    }
    else {
        System.out.println("Tidak Bisa");

    }
}}
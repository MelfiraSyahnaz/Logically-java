import java.util.Scanner;
    
class Task1 {
  public static void main(String args[]){
             
    Scanner input = new Scanner(System.in);
        
    System.out.println("  Mencari Nilai Terbesar  ");
    System.out.println("--------------------------");
    System.out.println();
      
    int[] arr = new int[10];
    int count, i, angkaMax;
      
    System.out.print("Input jumlah element: ");
    count = input.nextInt();
      
    System.out.println("Input "+count+" angka :");
      

    for(i = 0; i < count; i++){
      arr[i] = input.nextInt();
    }
      
    System.out.println();
      
    angkaMax = arr[0];
    for(i = 0; i < count; i++){
      if(arr[i] > angkaMax){
        angkaMax = arr[i];
      }
    }
     
    System.out.println("Angka yang lebih besar adalah: " + angkaMax);
      
  }
}
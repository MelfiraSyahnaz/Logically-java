import javax.swing.JOptionPane;
    
class CariNilaiTerbesar {
  public static void main(String args[]){
             
    int[] bilangan = new int[5];
    int i;
    
     for (i = 0; i<5; i++){
        String nilai = JOptionPane.showInputDialog("Masukkan Bilangan: ");
        bilangan[i] = Integer.parseInt(nilai);
        System.out.println("Input Bilangan: "+nilai);
    }
    
    for (i=0; i<5; i++){
        if (bilangan[i] %2 == 1){
        System.out.println("Bilangan "+bilangan[i]+" GANJIL");
        }
        else
        System.out.println("Bilangan "+bilangan[i]+" GENAP");
    }
  
}
}
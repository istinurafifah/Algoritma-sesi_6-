package Algoritma;

public class Looping {
    public static void main(String[] args) {
        int A = 4;
        for (int i = 0; i < A; i ++){
        for (int j = 0; j < A; j ++){
            if (j < A - i - 1){
                System.out.print("S ");
            }else{
                System.out.print("O ");
            }
        }
        System.out.println("");
       }
    }
}

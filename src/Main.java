import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        int n1= input.nextInt();

        System.out.print("n2 sayısını giriniz:");
        int n2= input.nextInt();

        for (int i= 1; i<=(n1*n2); i++){
            if (i % n1 == 0 && i % n2 == 0 ){
                System.out.println(i);
                break;
            }
        }

    }


}

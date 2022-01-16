import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k , l=0 , m=0;

        Scanner sc=new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        k=sc.nextInt();

        for (int i = 1; i<=k ; i++){
            if (i%2==0){
                System.out.print(i + ",");
            }
        }
        System.out.println(" ");
        //3 ve 4 e tam bolunen sayilarin oralamasi

        for (int i=1 ;i<=k;i++){
            if ((i%3==0 && i%4==0)){
                l=l+i;
                m++;
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("Tam bolunen sayilarin toplami : " +l);
        System.out.println("Tam bolunen sayi adedi : " +m);
        System.out.println("3 ve 4 e bolunen sayilarin ortalamasi : " +l/m);
    }
}

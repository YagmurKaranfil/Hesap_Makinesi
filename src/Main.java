import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        number1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select=input.nextInt();

        switch (select){
            case 1 :
                System.out.print("1- Toplama: "+(number1+number2));
                break;
            case 2 :
                System.out.print("2- Çıkarma: "+(number1-number2));
                break;
            case 3 :
                System.out.print("3- Çarpma: "+(number1*number2));
                break;
            case 4 :
                if(number2 == 0)
                    System.out.print("Bir sayı 0'a bölünemez");
                break;
            case 5 :
                if(number2 != 0)
                System.out.print("4- Bölme: "+(number1/number2));
                break;
            default:
                System.out.println("Yanlış değer girdiniz. Tekrar deneyiniz");
        }

    }
}
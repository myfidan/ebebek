import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutPrice = 2.14,elmaPrice = 3.67, domatesPrice = 1.11, muzPrice = 0.95, patlicanPrice = 5.00, total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        total += scanner.nextInt()*armutPrice;

        System.out.print("Elma Kaç Kilo? : ");
        total += scanner.nextInt()*elmaPrice;

        System.out.print("Domates Kaç Kilo? : ");
        total += scanner.nextInt()*domatesPrice;

        System.out.print("Muz Kaç Kilo? : ");
        total += scanner.nextInt()*muzPrice;

        System.out.print("Patlican Kaç Kilo? : ");
        total += scanner.nextInt()*patlicanPrice;

        System.out.println("Toplam Tutar : " + total);

    }
}
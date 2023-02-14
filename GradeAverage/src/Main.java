import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Sırasıyla notları giriniz 6 adet : mat, fizik, kimya, turkce, tarih, muzik");

        mat= input.nextInt();
        fizik=input.nextInt();
        kimya=input.nextInt();
        turkce= input.nextInt();
        tarih = input.nextInt();
        muzik = input.nextInt();

        int toplam= mat+fizik+kimya+tarih+turkce+muzik;
        double ortalama = toplam/6f;

        System.out.println("Ortalama:"+ortalama);


        boolean compare = ortalama >= 60;

        String result = compare ? "Sınıfı Geçtin" : "Sınıfta kaldın";
        System.out.println(result);



    }
}
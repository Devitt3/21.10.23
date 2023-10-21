import java.util.Scanner;
public class zad2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое слово: ");

        String mag = in.nextLine();
        System.out.println(mag.substring(mag.length()-1));
        //substring разбивает слова на множества и дает им индекс
    }
}

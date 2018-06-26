import java.util.Arrays;
import java.util.Scanner;

public class Lottery {

    public static void main (String[] args){

// Pobieranie liczb.
        Scanner in = new Scanner(System.in);

        System.out.println("Ile liczb musisz wylosowac :");
        int k = in.nextInt();

        System.out.println("Jaka jest najwieksza liczba? :");
        int n = in.nextInt();

        //Zapelnienie talicy liczbami
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length;i++)
            numbers[i]  = i + 1;

        //Losowanie liczby i zapis w drugiej tablicy

        int[] result = new int[k];
        for (int i = 0;i < result.length;i++)
        {
            //Losowanie indeksu od 0 - n-1
            int r = (int) (Math.random() * n);

            //Pobieranie elementu z lodowej lokalizacji
            result[i] = numbers[r];

            //Przeniesienie ostatniego elementu do losowej lokalizacji
            numbers[r] = numbers[n - 1];
            n--;

        }

        //Wydruk zapisanej tablicy
        Arrays.sort(result);
        System.out.println("Postaw na nastepujace liczby");
        for (int r : result)
            System.out.println(r);

    }

}

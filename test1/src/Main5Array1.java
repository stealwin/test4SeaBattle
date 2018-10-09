import java.util.Arrays;

/**
 * Created by Viacheslav on 29.09.2018.
 */
// Shift - F6 - переименовать класс или переменную с автозаменой
public class Main5Array1 {
    public static void main(String[] args) {
        int a= 10;
        int[] numbers = {10,3,2,22};
        //выводим весь массив
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);
        //itar - cокрашение
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        //iter - сокращение
            //for(пробежаться по всему массиву numbers сохраняя
            //каждое значение во временную переменную number1)
            //foreach
            for (int number1 : numbers) {
                System.out.println(number1);
            }
            for (String arg : args) {
                System.out.println(arg);
            }


        }
    }


}

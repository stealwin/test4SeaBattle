import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Viacheslav on 30.09.2018.
 */
public class Main5Array2 {
    public static void main(String[] args) {


        int[] stable;  //объявляется, но массив не построен
//        stable= {1,4,12};// не работает
        stable = new int[100];// объектная переменная заполняет размер
        // командой new и массив построен
//        for (int number : stable) {
//            System.out.println(number);
//        }
        //stable[3]=55;
        System.out.println(Arrays.toString(stable));
//        stable[0]=10;
    }
}

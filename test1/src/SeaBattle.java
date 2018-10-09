import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Viacheslav on 30.09.2018.
 */
public class SeaBattle {
    public static void main(String[] args) {
        char[] cells = new char[10];

        for (int i = 0; i <cells.length ; i++) {
            cells[i] = '.';
        }
        int position = 4;
        cells[position]='X';


        do {
            System.out.println(cells);
            //cчитывать ввод с клавиатуры
            Scanner scanner = new Scanner(System.in);
            String s;
            //ввод от пользователя
            s= scanner.nextLine();
            System.out.printf("Вы ввели: %s\n",s);
            int shoot = Integer.parseInt(s);
            switch (cells[shoot]) {
                case '.':
                    System.out.println("Промах!");
                    cells[shoot] = '*';
                    break;
                case 'X':
                    System.out.println("Корабль потоплен!");
                    cells[shoot]= '-';
                    System.out.println(cells);
                    break;
                case '*':
                    System.out.println("Сюда уже стреляли!");
                    break;
                default:
                    System.out.println("ERROR!");
            }

        } while (cells[position] == 'X');
    }
}

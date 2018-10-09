import java.util.Scanner;

/**
 * Created by Viacheslav on 30.09.2018.
 */
public class Player {
    int getShoot() {
        System.out.println("Куда стрелять?");
        Scanner scanner = new Scanner(System.in);
        String s;
        //ввод от пользователя
        s= scanner.nextLine();
        System.out.printf("Вы ввели: %s\n",s);
        int shoot = Integer.parseInt(s);
        return shoot;
    }
}

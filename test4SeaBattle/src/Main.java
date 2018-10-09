import java.util.Random;

/**
 * Created by Viacheslav on 30.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ship ship;


        field.init();
        field.setShipOneDeck(field.ship);

        System.out.println("Game start!");

        do {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        } while (field.isNotGameOver());


    }
}

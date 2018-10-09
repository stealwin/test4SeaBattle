import java.util.Random;

/**
 * Created by Viacheslav on 30.09.2018.
 */
public class Field {
    final int INT = 10;
    char[] cells = new char[INT];
    int startPositionOfShipPart1, startPositionOfShipPart2;

    Ship ship;
    Random random = new Random();

    void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';


        }
    }

    void setShipOneDeck(Ship shipOneDeck) {
        this.ship = shipOneDeck;

        startPositionOfShipPart1 = random.nextInt(10);
        ship = new Ship(startPositionOfShipPart1);
        if (startPositionOfShipPart1>=cells.length){
            startPositionOfShipPart1= cells.length-1;

        }
        cells[ship.position] = 'X';




        do {
            startPositionOfShipPart2 =  random.nextInt(10);
            ship = new Ship(startPositionOfShipPart2);
            if (startPositionOfShipPart2>=cells.length) {
                startPositionOfShipPart2=cells.length-1;

            }
            cells[ship.position] = 'O';
        } while (startPositionOfShipPart1 == startPositionOfShipPart2);



    }

    void setShipTwoDeck(Ship shipTwoDeck) {
        this.ship = shipTwoDeck;
        cells[shipTwoDeck.position] = 'X';
    }

    void doShoot(int shoot) {

        switch (cells[shoot]) {
            case '.':
                System.out.println("Промах!");
                cells[shoot] = '*';
                break;
            case 'X':
                System.out.println("Корабль потоплен!");
                cells[shoot] = '-';
                System.out.println(cells);
                break;
            case '*':
                System.out.println("Сюда уже стреляли!");
                break;
            default:
                System.out.println("ERROR!");
        }
    }

    void show() {
        System.out.println(cells);
    }

    boolean isNotGameOver() {
        return cells[ship.position] == 'X';
    }

}



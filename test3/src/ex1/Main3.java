package ex1;

/**
 * Created by Viacheslav on 30.09.2018.
 */
public class Main3 {
    public static void main(String[] args) {
        new Cat(3, "we", false);
       Cat cat2 = new Cat(3, "Murka",false);
       Cat cat1 = new Cat(5, "Tom",true);
        cat1.about();
        cat1=cat2;
        cat1.about();
    }
}

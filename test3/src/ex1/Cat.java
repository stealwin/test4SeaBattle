package ex1;

/**
 * Created by Viacheslav on 30.09.2018.
 */
public class Cat {
    //Характеристики (состояние), свойства, поля
    int age;
    String name;
    double weight;
    boolean isMale;
    // Alt-Enter - идея предложит вариант решения ошибки
    Tail tail;// композиция - переменная не может существовать отдельно от
    // объекта
    Talisman talisman; // агрегация - можно использовать отдельно от
    // объекта

    // Методы(поведения)
    void voice() {
        System.out.println("myaaauuuu");
    }

    void sleep() {
        System.out.println("hrrrrr");
    }


     void about() {
        String s= "Cat{" +
                "age=" + age +
                ", name=" + name +
                ", weight=" + weight +
                ", isMale=" + isMale +
                ", tail=" + tail +
                ", talisman=" + talisman +
                '}';
         System.out.println(s);
    }
    //Конструктор
    Cat() {
    }

    public Cat(int age, String name, boolean isMale) {
        //аргумент метода скрывает поле класса
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }
}

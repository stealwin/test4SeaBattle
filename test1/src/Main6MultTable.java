/**
 * Created by Viacheslav on 30.09.2018.
 */
public class Main6MultTable {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
              //  System.out.print(j + " * "+ i + " = " + i * j+ "\t\t");
                // "\t" - отступ
                // %d - целое число
                //souf - форматированный вывод
                System.out.printf("%d * %d = %d \t\t",j,i,i*j);

            }
            System.out.println();
        }
        System.out.printf("число %d , строка %s, дробное %.2f",100,"java",22.341231);
        //%.2f  - выведется только два знака после запятой в дробном числе
    }
}

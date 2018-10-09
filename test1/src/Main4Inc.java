/**
 * Created by Viacheslav on 29.09.2018.
 */
public class Main4Inc {
    public static void main(String[] args) {
        int i = 0;
        int a1=++i + i++;
        System.out.println(a1);
         i = 0;
        int a2=i++ + ++i;
        System.out.println(a2);
    }
}

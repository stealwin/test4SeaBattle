//однострочный комментарий
/*многострочный
комментарий*/

/**
 * Created by Viacheslav on 28.09.2018.
 * javadoc генерирует документацию
 * @author Viacheslav
 */
public class Kitchen {
   public static void main(String[] args){
       System.out.println("main");
       cookBreakfast();//shift-ctrl-enter -  курсор с любого положения переходит на новую строку
       cookBorshch();

    }
    static void cookBorshch(){
        System.out.println("Boil water");//СTRL зажать на слове - просмотреть класс
         System.out.println("...");//CTRL+D копировать новую строку
         System.out.println("Done");//CTRL+D копировать новую строку
    }
    static void cookBreakfast(){
        System.out.println("breakfast done");
    }
}

package ex1.ex2;

/**
 * Created by Viacheslav on 30.09.2018.
 */
public class Sofa {
    public static void main(String[] args) {
        TV pult1 = new TV();
        pult1.currentChannel=4;
        pult1.whatIsCurrentChannel();

        TV pult2;
        TV pult3;

        pult2= pult1;
        pult2.currentChannel=400;
        pult1.whatIsCurrentChannel();

        pult1=null;
        pult2=null;

        pult1.whatIsCurrentChannel();
    }
}

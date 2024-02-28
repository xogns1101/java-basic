package oop.static_.singleton;



public class MainClass {

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        s.method1();
        s.method2();
        System.out.println("s = " + s);



    }


}

package ch03;

public class Variables {
    public static void main(String[] args) {
        // You can't use a variable if you don't declare it. You must define "i".
        // i = 5;

        // Declaring a variable

        int i;
        boolean b;
        String s1;

        // Initializing a variable
        i = 8;
        b = true;
        s1 = new String("Kaan Perktas");

        System.out.println("i:" + i + "\t b:" + b + "\t s1" + s1);

        // Defining a variable
        int j = 21;
        float sin30 = 0.6f;
        String s2 = new String("Java");

        System.out.println("j:" + j + "\t sin30:" + sin30 + "\t s2" + s2);
    }
}

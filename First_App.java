package GB_Java1;

public class First_App {
    public static void main(String[] args) {
        System.out.println("Hello! Let's start!");

        int a = 16;
        int b = 32;
        int c = 64;
        int d = 128;
        char e = '$';
        float f = 12.23f;
        long l = 64;
        boolean tf = true;

        int h = a * (b + (c / d));
        System.out.println(h);

    }

}

    public static boolean task4(int a, int b)
    {
        return 10 >= a + b && a + b <= 20;
    }

public static void task5(int a){
        System.out.println(a < 0 ? "-" : "+");
}

    public static boolean task6(int i){
        return i < 0;
    }

    public static void task7(String name){
        System.out.println("Привет " + name + "!");
    }
}
package Garbage;

public class test {
    public static void print(int a){
        //System.out.println(a);
        System.out.println("vvvvv");
    }

    public static void main(String[] args) {
        String a = "a";
        String b = new String("a");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        int c = 5;
        test t1 = new test();
        t1.print(c);
    }
}

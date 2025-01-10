public class Main {
    public static void main(String[] args) {
        // 1
        int a, c;
        boolean b;
        double d;
        a = 7;
        c = 25;
        d = a / c;
        b = (d * 25 <= 7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // 2
        d -= 1;
        c = c + (~(a ^ 11));
        b = b & (a << 1 > c);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
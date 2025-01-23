public class Main {
    public static void main(String[] args) {

        // 1 数据类型与运算符 （一）

        /*int a, c;
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


        // 2 数据类型与运算符 （二）
        d -= 1;
        c = c + (~(a ^ 11));
        b = b & (a << 1 > c);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
*/

        // 3 控制结构

        /*for (int i=0; i<a-4; i++) {
            if (c % 2 != 0){
                c++;
            }
            else{
                c = c / 2;
            }
        }
        while (d >= -6){
            a = (int) (a + d);
            d *= 2;
        }
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);


        // 4 字符串与数组

        String string = "Hello 2025";
        char[] array = new char[string.length()];
        string.getChars(0, string.length(), array, 0);
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(string.charAt(a));
        System.out.println(array[c]);

        // Substring
        System.out.println(string.substring(a, 3) + string.substring(c));


        // 5. 阶乘，排列数， 组合数
        System.out.println(factorial(c));
        System.out.printf("permutations of (%d, %d) : " +  permutations(a+c, 10) + "\n", a+c, 10);
        System.out.printf("combinations of (%d, %d) : " +  combinations(a+c, 10) + "\n", a+c, 10);

        // 6. 异常捕获
//        factorial(-1);

        // 7. 泛型容器与包装类型
        java.util.ArrayList<Character> arrayList = new java.util.ArrayList<Character>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                arrayList.add(array[i]);
            }
        }
        while (!arrayList.isEmpty()) {
            char last = arrayList.getLast();
            System.out.print(last + ' ');
            arrayList.removeLast();
        }
        System.out.println(arrayList);

    }

    public static long factorial(long n) {
        if (n < 0){
            throw new IllegalArgumentException("n must be a positive number");
        }
        long result = 1;
        for (long i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public static long permutations(long m, long n) {
        if (m > n){
            throw new IllegalArgumentException("m must be smaller or equal to n");
        }
        return factorial(n) / factorial(n - m);
    }
    public static long combinations(long m, long n) {
        if (m > n){
            throw new IllegalArgumentException("m must be smaller or equal to n");
        }
        return factorial(n) / ( factorial(n - m) * factorial(m)) ;
    }*/

    }
}
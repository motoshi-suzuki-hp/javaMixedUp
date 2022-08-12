public class java1 {
    public static void main(String[] args) {
        // 1-1
        System.out.println("Helo, World");

        // 1-2
        int x2 = 11;
        System.out.println("x = " + x2);

        // 1-3
        int x3 = 13;
        int y3 = 17;
        System.out.println("x = " + x3 + ", y = " + y3);

        // 1-4
        int x4;
        x4 = 13 + 17;
        System.out.println(x4);

        // 1-5
        System.out.println(13 * 17);

        // 1-6
        int x6 = 7;
        x6 *= 3;
        System.out.println(x6);
        x6 /= 2;
        System.out.println(x6);

        // 1-7
        int x7 = 3;
        int y7 = 7;
        int z7 = y7;
        y7 = x7;
        x7 = z7;
        System.out.println( "x =" + x7 + ", y =" + y7 );

        // 1-8
        int x8 = 19;
        int y8 = 23;
        int z8;
        z8 = x8 * y8;
        System.out.println(z8);

        // 1-9
        int x9 = 3;
        System.out.println(x9 * 2);
        System.out.println(x9 * 3);
        System.out.println(x9 * 4);

        // 1-10
        int x10 = 3;
        System.out.println(x10 * x10);
        System.out.println(x10 * x10 * x10);
        System.out.println(x10 * x10 * x10 * x10);

        // 1-11
        int x11 = 11;
        System.out.println("商 = " + (x11 / 3) + "余り = " + (x11 % 3));

        // 1-12;
        int x12 = 3;
        x12 ++;
        System.out.println(x12);
        x12 --;
        System.out.println(x12);

    }
}


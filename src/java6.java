import java.io.*;


public class java6 {
    public static void main(String[] args) throws IOException {
        // 6-1
        System.out.println("3の2乗 = " + pow2(3));

        // 6-2
        System.out.println("3と5の平均 = " + ave2(3,5));

        // // 6-3
        // System.out.println("3と5の大きい方" + max2(3,5));

        // BufferedReader br3 = new BufferedReader(
        //     new InputStreamReader( System.in ) );

        // int x = Integer.parseInt( br3.readLine() );
        // int y = Integer.parseInt( br3.readLine() );
        // int z = Integer.parseInt( br3.readLine() );

        // System.out.println(max2(max2(x,y), z));

        // 6-4
        triangle(3);
        System.out.println();
        triangle(4);
        System.out.println();
        triangle(5);
        System.out.println();

        // 6-5
        triangle2(3,"#");
        System.out.println();
        triangle2(4,"$");
        System.out.println();
        triangle2(5,"%");
        System.out.println();

        // 6-6
        for(int dan = 1; dan <= 9; dan++) {
            kuku(dan);
        }

        // 6-7
        for(int p = 10000; p < 10100; p++) {
            if(prime(p)) {
                System.out.print(p + " ");
            }
        }
        System.out.println();


        // 6-8
        for(int f = 11; f <= 20; f++) {
            System.out.print(fibo(f) + " ");
        }
        System.out.println();

    }

    // 6-1
    static int pow2(int n) {
        return n * n;
    }

    // 6-2
    static int ave2(int n, int m) {
        return (n + m) / 2;
    }

    // 6-3
    static int max2(int n, int m) {
        if (n <= m) {
            return m;
        } else {
            return n;
        }
    }

    // static int max3(int x, int y, int z) {
    //     return max2(max2(x,y), z);
    // }

    // 6-4
    static void triangle(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    // 6-5

    static void triangle2(int n, String s) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    // 6-6
    static void kuku(int n) {
        for(int i = 1; i <= 9; i++) {
            System.out.printf(" %2d", (n * i));
        }
        System.out.println();
    }

    // 6-7
    static boolean prime(int n) {
        if( n <= 3 ) return true;
        for(int i = 2; i <= (n/2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    // 6-8
    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
        
    }
}







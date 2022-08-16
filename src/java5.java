import java.io.*;

public class java5 {
    public static void main(String[] args) throws IOException {
        // 5-1
        // BufferedReader br1 = new BufferedReader(
        //     new InputStreamReader( System.in ) );

        // int n[] = new int[10];

        // for( int i = 0 ; i < 10 ; i++ )
        //     n[i] = Integer.parseInt( br1.readLine() );

        // System.out.println();

        // for( int i = 0 ; i < 10 ; i++ )
        //     System.out.println( n[i] * 2 );
        

        // 5-2
        // BufferedReader br2 = new BufferedReader(
        //     new InputStreamReader( System.in ) );

        // int n[] = new int[10];

        // for( int i = 0 ; i < 10 ; i++ )
        //     n[i] = Integer.parseInt( br2.readLine() );

        // System.out.println();
        // for( int i = 9 ; i >= 0 ; i-- )
        //     System.out.println( n[i] );



        // 5-3
        // BufferedReader br3 = new BufferedReader(
        //     new InputStreamReader( System.in ) );

        // int n[] = new int[10];

        // for( int i = 0 ; i < 10 ; i++ )
        //     n[i] = Integer.parseInt( br3.readLine() );

        
        // System.out.print("\n偶数: ");

        // for (int m:n) {
        //     if(m % 2 == 0) System.out.print(m + " ");
        // }

        // System.out.print("\n奇数: ");

        // for (int m:n) {
        //     if(m % 2 != 0) System.out.print(m + " ");
        // }



        // // 5-4
        // BufferedReader br4 = new BufferedReader(
        //     new InputStreamReader( System.in ) );

        // int n[] = new int[10];

        // int sum;
        // int i;

        // for( i = 0, sum = 0 ; i < 10 && sum <= 0 ; i++ ) {
        //     n[i] = Integer.parseInt( br4.readLine() );
        //     sum += n[i];


        // }

        // for (int j = 0; j < i; j++) {
        //     System.out.print("\n" + n[j] + " ");
        // }






        // // 5-5
        // BufferedReader br5 = new BufferedReader(
        //     new InputStreamReader( System.in ) );
        // int value = Integer.parseInt( br5.readLine() );

        // int binary[] = new int[16];

        // // 配列 binaryに0か1を代入する
        // for (int i = 15; i >= 0; i--, value /= 2) {
        //     binary[i] = value % 2;
        // }

        // for( int i = 0 ; i < 16 ; i++ ) {
        //     System.out.print( binary[i] );

        // }


        // // 5-6
        // // BufferedReader br6 = new BufferedReader(
        // //     new InputStreamReader( System.in ) );
        // int kuku[][] = new int[9][];

        // // 配列 kuku に値を代入する
        // for (int i = 0; i < 9; i++) {
        //     kuku[i] = new int[9];
        //     for (int j = 0; j < 9; j++) {
        //         kuku[i][j] = (i + 1) * (j + 1);
        //     }
        // }

        // for( int i = 0 ; i < 9 ; i++ ) {
        //     for( int j = 0 ; j < 9 ; j++ ) {
        //         System.out.printf( " %2d", kuku[i][j] );
        //     }
        //     System.out.println();
        // }


        // // 5-7
        // BufferedReader br7 = new BufferedReader(
        //     new InputStreamReader( System.in ) );
        // int kuku[][] = new int[9][];

        // // 配列 kuku に値を代入する
        // for (int i = 0; i < 9; i++) {
        //     kuku[i] = new int[9];
        //     for (int j = 0; j < 9; j++) {
        //         kuku[i][j] = (i + 1) * (j + 1);
        //     }
        // }

        // for( int i = 0 ; i < 9 ; i++ ) {
        //     for( int j = 0 ; j < 9 ; j++ ) {
        //         System.out.printf( " %2d", kuku[i][j] );
        //     }
        //     System.out.println();
        // }

        // int n = Integer.parseInt( br7.readLine() );
        // int m = Integer.parseInt( br7.readLine() );
        // System.out.println(kuku[n - 1][m - 1]);


        // 5-8
        BufferedReader br8 = new BufferedReader(
            new InputStreamReader( System.in ) );
        int sort[] = new int[10];

        for (int i = 0; i < 10; i++) {
            sort[i] = Integer.parseInt( br8.readLine() );
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (sort[i] > sort[j]) {
                    int t = sort[i];
                    sort[i] = sort[j];
                    sort[j] = t;
                }
            }
        }

        for( int i = 0 ; i < 10 ; i++ ) {
            System.out.print( sort[i] + " " );
        }

    }
}

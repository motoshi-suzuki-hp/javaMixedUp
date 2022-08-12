import java.io.*;

public class java2 {
    public static void main(String[] args) throws IOException{
        
        // 2-1        
        BufferedReader br1 = new BufferedReader(new InputStreamReader( System.in ) );
        String  s = br1.readLine();

        System.out.println(s);

        // 2-2

        BufferedReader br2 = new BufferedReader(new InputStreamReader( System.in ) );
        int x = Integer.parseInt( br2.readLine() );

        System.out.println(x);

        // 2-3
        System.out.println( x );
        System.out.println( x * x );
        System.out.println( x * x * x );

        // 2-4
        BufferedReader br4 = new BufferedReader(new InputStreamReader( System.in ) );
        int x4 = Integer.parseInt( br4.readLine() );
        int y4 = Integer.parseInt( br4.readLine() );

        System.out.println("和" + (x4 + y4));
        System.out.println("差" + (x4 - y4));
        System.out.println("積" + (x4 * y4));
        System.out.println("商" + (x4 / y4));
        System.out.println("余り" + (x4 % y4));

        // 2−５
        System.out.println("平均値" + ((x4 + y4) / 2));

        // 2-6
        BufferedReader br6 = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.println("あなたの年齢は？");
        int x6 = Integer.parseInt( br6.readLine() );
        System.out.println("age = " + x6 * 356);


    } 
}

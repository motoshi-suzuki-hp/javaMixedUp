import java.io.*;

public class java4 {
    public static void main(String[] args) throws IOException {
        // 4-1
        for(int i = 0; i < 10; i++) {
            System.out.println("SPAM");
        }

        // 4-2
        for(int i = 1; i < 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i) + "\n");
        }




        // 4-3
        int two = 1;
        for(int i = 1; i < 9; i++) {
            two *= 2;
            System.out.println(two + "\n");
        }



        // 4-4
        int factorial = 1;
        for(int i = 1; i < 8; i++) {
            factorial *= i;
            if (i == 7) {
                System.out.println("factorial = " + factorial);
            }
        }


        // 4-5
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            BufferedReader br5 = new BufferedReader(
                new InputStreamReader( System.in ) );

            sum += Integer.parseInt( br5.readLine() );

            if (i == 9) {
                System.out.println("ave = " + sum / 10);
            }
        }


        // 4-6




        // 4-7




        // 4-8




        // 4-9





        // 4-10





        // 4-11







        // 4-12





        // 4-13





        // 4-14





        // 4-15





        // 4-16




        // 4-17





        // 4-18





        // 4-19




        // 4-20




        // 4-21




        // 4-22






    }
}

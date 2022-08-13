import java.io.*;

import javax.sound.midi.SysexMessage;

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


        // // 4-5
        // int sum = 0;
        // for(int i = 0; i < 10; i++) {
        //     BufferedReader br5 = new BufferedReader(
        //         new InputStreamReader( System.in ) );

        //     sum += Integer.parseInt( br5.readLine() );

        //     if (i == 9) {
        //         System.out.println("ave = " + sum / 10);
        //     }
        // }


        // // 4-6
        // int zero = 0;
        // int one = 0;
        // for(int i = 0; i < 10; i++) {
        //     BufferedReader br6 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     int io = Integer.parseInt( br6.readLine() );

        //     if (io == 0) {            
        //         zero ++;
        //     } else if (io == 1) {
        //         one ++;
        //     } else {
        //         System.out.println("やり直してください");
        //         i --;
        //     }
        // }
        // System.out.println("勝ち = " + one);
        // System.out.println("負け = " + zero);


        // // 4-7
        // int g = 0;
        // int t = 0;
        // for(int i = 1; i < 10; i++) {
        //     System.out.println(i + "回表、巨人の得点は？");
        //     BufferedReader br71 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     g += Integer.parseInt( br71.readLine() );

        //     System.out.println(i + "回裏、阪神の得点は？");
        //     BufferedReader br72 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     t += Integer.parseInt( br72.readLine() );
        // }

        // System.out.println("巨人:" + g + "点, 阪神:" + t + "点");
        // if(g > t) {
        //     System.out.println("巨人の勝ち");
        // } else if (g < t) {
        //     System.out.println("阪神の勝ち");
        // } else {
        //     System.out.println("引き分け");
        // }

        // // 4-8
        // int max = 0;
        // for(int i = 0; i < 10; i++) {
        //     BufferedReader br8 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     int number = Integer.parseInt( br8.readLine() );

        //     if (number > max) {
        //         max = number;
        //     }
        // }
        // System.out.println("最大値 = " + max);


        // // 4-9
        // int max = 0;
        // int min = 0;
        // for(int i = 0; i < 10; i++) {
        //     BufferedReader br9 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     int number = Integer.parseInt( br9.readLine() );

        //     if (number > max) {
        //         max = number;
        //     }

        //     if (i == 0) {
        //         min = number;
        //     }
        //     if (number < min) {
        //         min = number;
        //     }
        // }
        // System.out.println("最大値 = " + max + " 最小値 = " + min);


        // // 4-10
        // BufferedReader br10 = new BufferedReader(
        //     new InputStreamReader( System.in ) );
        // System.out.println("個数は？");
        // int count = Integer.parseInt( br10.readLine() );

        // for(int i = 0; i < count; i++) {
        //     System.out.println("*");
        // }




        // // 4-11

        // BufferedReader br11 = new BufferedReader(
        //     new InputStreamReader( System.in ) );
        // System.out.println("個数は？");
        // int c = Integer.parseInt( br11.readLine() );

        // for(int i = 0; i < c; i++) {
        //     System.out.println(i % 10);
        // }

        // // 4-12
        // int sum = 0;
        // while (sum <= 100) {
        //     BufferedReader br12 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     System.out.println("数は？");
        //     int num = Integer.parseInt( br12.readLine() );

        //     sum += num;
        // }

        // System.out.println("合計: " + sum);

        // // 4-13
        // int strike = 0;
        // int ball = 0;

        // while (strike < 3 && ball < 4) {
        //     BufferedReader br13 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     System.out.println("ストライク = 1 or ボール = 2 ？");
        //     int sb = Integer.parseInt( br13.readLine() );

        //     if (sb == 1) {
        //         strike ++;
        //     } else if (sb == 2) {
        //         ball ++;
        //     } else {
        //         System.out.println("やり直し");
        //     }

        // }

        // System.out.println(ball + "ボール," + strike + "ストライク");

        // // 4-14
        // int st = 0;
        // int ba = 0;

        // while (st < 3 && ba < 4) {
        //     BufferedReader br14 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     System.out.println("ストライク = 1 or ボール = 2 or ファウル = 3 ？");
        //     int sbf = Integer.parseInt( br14.readLine() );

        //     if (sbf == 1) {
        //         st ++;
        //     } else if (sbf == 2) {
        //         ba ++;
        //     } else if (sbf == 3) {
        //         if (st < 2) st ++;
        //     } else {
        //         System.out.println("やり直し");
        //     }

        // }

        // System.out.println(ba + "ボール," + st + "ストライク");

        // // 4-15
        //     BufferedReader br15 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     System.out.println("数は ？");
        //     int p = Integer.parseInt( br15.readLine() );
        //     int i;
        //     for (i = 2; i <= (p / 2); i++) {
        //         if (p % i == 0) break;
        //     }

        //     if (i > (p / 2)) System.out.println("素数です");
        //     else System.out.println("素数ではありません");

        // // 4-16
        //     BufferedReader br16 = new BufferedReader(
        //         new InputStreamReader( System.in ) );
        //     System.out.println("数は ？");
        //     int value = Integer.parseInt( br16.readLine() );
        //     int i;
        //     for (i = 2; value > 1; i++) {
        //         while (value % i == 0) {
        //             System.out.println(i + " ");
        //             value /= i;
        //         }
        //     }


        // 4-17
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf(" %2d",i * j);
            }
            System.out.println();
        }




        // // 4-18
        // BufferedReader br17 = new BufferedReader(
        //     new InputStreamReader( System.in ) );

        // int enter = 1;
        // int sum = 0;
        // while (enter != 0) {

        //     System.out.println("数は ？");
        //     enter = Integer.parseInt( br17.readLine() );

        //     sum += enter;
        // }

        // System.out.println("合計は" + sum);




        // // 4-19
        // BufferedReader br19 = new BufferedReader(
        //     new InputStreamReader( System.in ) );
            
        // int enter = 1;
        // int sum = 0;
        // int counter = 0;
        // while (enter != 0) {

        //     System.out.println("数は ？");
        //     enter = Integer.parseInt( br19.readLine() );

        //     sum += enter;

        //     counter ++;
        // }

        // System.out.println("平均は" + (sum / (counter - 1)));

        // // 4-20
        // BufferedReader br20 = new BufferedReader(
        //     new InputStreamReader( System.in ) );
        // System.out.println("数は ？");
        // int size = Integer.parseInt( br20.readLine() );

        // for (int i = 0; i < size; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print("$");
        //     }
        //     System.out.println();
        // }



        // 4-21
        BufferedReader br21 = new BufferedReader(
            new InputStreamReader( System.in ) );
        System.out.println("数は ？");
        int size = Integer.parseInt( br21.readLine() );

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if (i == j || (size - 1 - i) == j) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



        // 4-22
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo = fibo1 + fibo2;
        while (fibo1 <= 1000) {
            System.out.print(fibo1 + ",");
            fibo1 = fibo2;
            fibo2 = fibo;
            fibo = fibo1 + fibo2;
        }




    }
}

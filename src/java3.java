import java.io.*;

public class java3 {
    public static void main(String[] args) throws IOException {
        // 3-1
        BufferedReader br1 = new BufferedReader(
                        new InputStreamReader( System.in ) );

        int x = Integer.parseInt( br1.readLine() );
        int y = Integer.parseInt( br1.readLine() );

        if (x > y) {
            System.out.println("xはyより大きい。");
        }

        // 3-2
        if (x >= y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        // 3-3
        if (x > y) {
            System.out.println("xはyより大きい");
        } else if (x < y) {
            System.out.println("xはyより小さい");
        }

        // 3-4
        if (x > y) {
            System.out.println("xはyより大きい");
        } else if (x < y) {
            System.out.println("xはyより小さい");
        } else {
            System.out.println("xとyは等しい");
        }

        // 3-5
        BufferedReader br5 = new BufferedReader(
            new InputStreamReader( System.in ) );

        int n = Integer.parseInt( br5.readLine() );

        if (n % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        // 3-6
        if (n % 2 == 0) {
            if(n >= 0) {
                System.out.println("正の偶数");
            } else {
                System.out.println("負の偶数");
            }
        } else {
            if(n > 0) {
                System.out.println("正の奇数");
            } else {
                System.out.println("負の奇数");
            }
        }

        // 3-7
        BufferedReader br7 = new BufferedReader(
            new InputStreamReader( System.in ) );

        int score = Integer.parseInt( br7.readLine() );

        // 3-7-1
        if (score >= 60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

        //3-7-2
        if (score >= 80) {
            System.out.println("たいへんよくできました。");
        } else if (score >= 60 && score < 80) {
            System.out.println("よくできました。");
        } else {
            System.out.println("ざんねんでした。");
        }

        //3-7-3
        if (score >= 80) {
            System.out.println("優");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

        // 3-8
        BufferedReader br8 = new BufferedReader(
            new InputStreamReader( System.in ) );

        int middle = Integer.parseInt( br8.readLine() );
        int last = Integer.parseInt( br8.readLine() );

        if (middle >= 60 && last >= 60) {
            System.out.println("合格");
        } else if (middle + last >= 130) {
            System.out.println("合格");
        } else if (middle + last >= 100 && (middle >= 90 || last >= 90)) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

        // 3-9
        // 0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
        // 0=午前、1=午後、2=夜間
        BufferedReader br9 = new BufferedReader(
            new InputStreamReader( System.in ) );

        int day = Integer.parseInt( br9.readLine() );
        int time = Integer.parseInt( br9.readLine() );

        if (day == 0 || (day == 2 && time == 0) || (day == 3 && time == 2) || (day == 5 && time == 0) || (day == 6 && (time == 1 || time == 2)))  {
            System.out.println("休診");
        } else {
            System.out.println("診療日");
        }

        // 3-10
        BufferedReader br10 = new BufferedReader(
            new InputStreamReader( System.in ) );

        int x10 = Integer.parseInt( br10.readLine() );
        int y10 = Integer.parseInt( br10.readLine() );

        if ( x10 < y10 && x10 % 2 == 0 && y10 % 2 == 0 ) {
            System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
        }
        if ( x == y && x < 0 ) {
            System.out.println( "xとyは等しく、かつ、負の数である。" );
        }
        if ( x < y || x % 2 ==0 ) {
            System.out.println( "xはyより小さい、または、xは偶数である。" );
        }
        if ( (x <= 10 || x >= 100) && (y >= 10 && y <= 100)) {
            System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
        }
        if ( !(x < 0 && y < 0) ) {
            System.out.println( "xもyも負の数である、ではない。" );
        }

        // 3-11
        BufferedReader br11 = new BufferedReader(
            new InputStreamReader( System.in ) );
        System.out.println( "何月ですか？" );
        int month = Integer.parseInt( br11.readLine() );

        switch (month) {
            case 1:
                System.out.println("元日" );
                System.out.println("成人の日");
            case 2:
            System.out.println("建国記念の日");
            case 3:
                System.out.println("春分の日");
            case 4:
                System.out.println("昭和の日");
            case 5:
                System.out.println("憲法記念日");
                System.out.println("みどりの日");
                System.out.println("こどもの日");
            case 6:
            case 7:
                System.out.println("海の日");
            case 8:
            case 9:
                System.out.println("敬老の日");
                System.out.println("秋分の日");
            case 10:
                System.out.println("体育の日");
            case 11:
                System.out.println("文化の日" );
                System.out.println("勤労感謝の日");
            case 12:
                System.out.println("天皇誕生日");
        }

        // 3-12
        BufferedReader br12 = new BufferedReader(
                        new InputStreamReader( System.in ) );

        System.out.println( "お好きな寿司を選んでください" );
        System.out.println( "1:まぐろ 2:えび 3:こはだ 4:あなご 5:いくら" );

        int sushi = Integer.parseInt( br12.readLine() );

        switch(sushi){
            case 1:
                System.out.println( "何か良いことがあります。" );
                break;
            case 2:
                System.out.println( "驚くほど良いことがあります。" );
                break;
            case 3:
                System.out.println( "ちょっと良いことがあります。" );
                break;
            case 4:
                System.out.println( "とても良いことがあります。" );
                break;
            case 5:
                System.out.println( "そこそこ良いことがあります。" );
                break;
        }

        // 3-13
        BufferedReader br = new BufferedReader(
            new InputStreamReader( System.in ) );

        int m = Integer.parseInt( br.readLine() );

        switch(m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31日です");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30日です");
                break;
            case 2:
                System.out.println("28日です");
                break;
            default:
                System.out.println( "入力が間違っています" );
                break;

        }


    }
}

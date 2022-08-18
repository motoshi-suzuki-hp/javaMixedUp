import java.io.*;

public class java7 {
    public static void main(String[] args) throws IOException {
        // // 7-1
        // Dog dog1 = new Dog();
        // dog1.SetName("Jhon");
        // dog1.ShowProfile();

        // // 7-2
        // Dog dog2 = new Dog();
        // dog2.SetName("Tom");
        // dog2.SetAge(5);
        // dog2.ShowProfile();

        // // 7-3
        // Dog dog31 = new Dog();
        // Dog dog32 = new Dog();

        // dog31.SetName("Tom");
        // dog32.SetName("Bob");

        // dog31.SetAge(5);
        // dog32.SetAge(3);

        // dog31.ShowProfile();
        // dog32.ShowProfile();

        // // 7-4
        // Dog dog4 = new Dog();

        // dog4.SetBreed("Chihuahua");
        // dog4.SetName("Tom");
        // dog4.SetAge(5);
        // dog4.ShowProfile();

        // // 7-5
        // Dog dog5 = new Dog("Chihuahua");

        // dog5.SetName("Tom");
        // dog5.SetAge(5);
        // dog5.ShowProfile();

        // // 7-6
        // BufferedReader br6 = new BufferedReader(
        //     new InputStreamReader( System.in ) );
        // CoinCase coincase = new CoinCase();

        // for(int i = 0; i < 10; i++) {
        //     System.out.print( "硬貨の種類は?" );
        //     int kind = Integer.parseInt( br6.readLine() );
        //     System.out.print( "硬貨の枚数は?" );
        //     int count = Integer.parseInt( br6.readLine() );

        //     coincase.AddCoins(kind, count);
        // }

        // System.out.println("500円は" + coincase.GetCount(500) + "枚");
        // System.out.println("100円は" + coincase.GetCount(100) + "枚");
        // System.out.println("50円は" + coincase.GetCount(50) + "枚");
        // System.out.println("10円は" + coincase.GetCount(10) + "枚");
        // System.out.println("5円は" + coincase.GetCount(5) + "枚");
        // System.out.println("1円は" + coincase.GetCount(1) + "枚");

        // System.out.println("総額は" + coincase.GetAmount() + "円");

        // 7-7
        BufferedReader br7 = new BufferedReader(
            new InputStreamReader( System.in ) );
        CoinCase coincase = new CoinCase();

        for(int i = 0; i < 10; i++) {
            System.out.print( "硬貨の種類は?" );
            int kind = Integer.parseInt( br7.readLine() );
            System.out.print( "硬貨の枚数は?" );
            int count = Integer.parseInt( br7.readLine() );

            coincase.AddCoins(kind, count);
        }

        System.out.println("500円は" + coincase.GetCount(500) + "枚");
        System.out.println("100円は" + coincase.GetCount(100) + "枚");
        System.out.println("50円は" + coincase.GetCount(50) + "枚");
        System.out.println("10円は" + coincase.GetCount(10) + "枚");
        System.out.println("5円は" + coincase.GetCount(5) + "枚");
        System.out.println("1円は" + coincase.GetCount(1) + "枚");
        System.out.println("全部で" + coincase.GetCount() + "枚");

        System.out.println("総額は" + coincase.GetAmount() + "円");


    }



}



// Dog

class Dog {
    private String Name;

    public void SetName( String nm ) {
        Name = nm;
    }

    private int Age;

    public void SetAge( int ag ) {
        Age = ag;
    }

    private String Breed;

    public Dog( String brd ) {
        Breed = brd;
    }

    public void ShowProfile() {
        System.out.println( "犬種は、" + Breed + "、" + "名前は、" + Name + "、" + "年齢は、" + Age + "歳です。" );
    }

}


// CoinCase

class CoinCase {

    private int Yen500 = 0;
    private int Yen100 = 0;
    private int Yen50 = 0;
    private int Yen10 = 0;
    private int Yen5 = 0;
    private int Yen1 = 0;




    public void AddCoins(int kind, int count) {
        switch( kind ) {
            case 500:
                Yen500 += count;
                break;
            case 100:
                Yen100 += count;
                break;
            case 50:
                Yen50 += count;
                break;
            case 10:
                Yen10 += count;
                break;
            case 5:
                Yen5 += count;
                break;
            case 1:
                Yen1 += count;
                break;
        }
    }

    public int GetCount(int kind) {
        switch( kind ) {
            case 500:
                return Yen500;
            case 100:
                return Yen100;
            case 50:
                return Yen50;
            case 10:
                return Yen10;
            case 5:
                return Yen5;
            case 1:
                return Yen1;
        }
        return 0;
    }

    public int GetCount() {
        return (Yen500 + Yen100 + Yen50 + Yen10 + Yen5 + Yen1);
    }

    public int GetAmount() {
        return ((500 * Yen500) + (100 * Yen100) + (50 * Yen50) + (10 * Yen10) + (5 * Yen5) + (1 * Yen1));
    }

    public int GetAmount(int kind) {
        switch( kind ) {
            case 500:
                return Yen500 * 500;
            case 100:
                return Yen100 * 100;
            case 50:
                return Yen50 * 50;
            case 10:
                return Yen10 * 10;
            case 5:
                return Yen5 * 5;
            case 1:
                return Yen1 * 1;
        }
        return 0;
    }
}

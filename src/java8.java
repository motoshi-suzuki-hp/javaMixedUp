import java.io.*;

public class java8 {
    public static void main(String[] args) throws IOException {
        // 8-1
        Cat cat1 = new Cat();
        cat1.Name = "Jhon";
        cat1.Age = 2;
        cat1.ShowProfile();
        cat1.Sleep();

    }
}

class Animal {
    public String Name;
    public int Age;

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
}

class Cat extends Animal {
    public void Sleep() {
        System.out.println("スースー");
    }
}
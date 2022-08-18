import java.io.*;


// Main

public class java8 {
    public static void main(String[] args) throws IOException {
        // 8-1
        Cat cat1 = new Cat();
        cat1.Name = "Jhon";
        cat1.Age = 2;
        cat1.ShowProfile();
        cat1.Sleep();


        // 8-2
        Cat cat2 = new Cat();
        Dog2 dog2 = new Dog2();

        cat2.Name = "Tom";
        cat2.Age = 3;
        dog2.Name = "Alice";
        dog2.Age = 1;

        cat2.ShowProfile();
        dog2.ShowProfile();

        cat2.Sleep();

        dog2.Run();


        // 8-3

        Cat cat3 = new Cat();
        Dog2 dog3 = new Dog2();

        cat3.Name = "Bob";
        cat3.Age = 3;
        dog3.Name = "David";
        dog3.Age = 5;

        cat3.ShowProfile();
        dog3.ShowProfile();

        cat3.Speak();
        dog3.Speak();

        // 8-4
        Animal[] animal4 = new Animal[4];

        animal4[0] = new Cat();
        animal4[1] = new Dog2();
        animal4[2] = new Cat();
        animal4[3] = new Dog2();

        for(Animal Pet:animal4) {
            Pet.Speak();
        }



    }
}





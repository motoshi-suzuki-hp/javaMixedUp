import java.util.ArrayList;
import java.util.Collections;

public class random {
    public static void main(String[] args) {

        // random1



        // random3
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // 1st shuffle
        Collections.shuffle(list);
        for (int num:list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2nd shuffle
        Collections.shuffle(list);
        for (int num:list) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

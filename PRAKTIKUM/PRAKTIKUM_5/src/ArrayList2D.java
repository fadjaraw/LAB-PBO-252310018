import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> angka = new ArrayList<ArrayList<Integer>>();
        angka.add(new ArrayList<Integer>());

        // angka.get(angka.size() - 1).add(10);
        angka.getLast().add(10);

        angka.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        
        System.out.println(angka.get(0).get(0));

        for (int i = 0; i < angka.size(); i++) {
            for (int j = 0; j < angka.get(1).size(); j++) {
                System.out.println(angka.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
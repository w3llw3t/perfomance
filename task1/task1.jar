import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(i + 1);
        }
        System.out.print(1);
        int i = 1;
            while (true) {
                i++;
                list2.addAll(list1);
                if ((i % (m - 1)) == 0) {
                if (list2.get(i) == 1) {
                    break;
                }
                System.out.print(list2.get(i));
            }
        }
    }
}
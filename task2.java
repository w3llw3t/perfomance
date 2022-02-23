import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader(args[0]);
        Scanner sc = new Scanner(fr);

        ArrayList<String> okr = new ArrayList<>();

        while (sc.hasNext()) {
            okr.add(sc.nextLine());
        }
        fr = new FileReader(args[1]);
        sc = new Scanner(fr);

        ArrayList<String> dota = new ArrayList<>();

        while (sc.hasNext()) {
            dota.add(sc.nextLine());
        }

        int okrX = Integer.parseInt(okr.get(0).split(" ")[0]);
        int okrY = Integer.parseInt(okr.get(0).split(" ")[1]);
        int okrRaduis = Integer.parseInt(okr.get(1).split(" ")[0]);

        for (String s : dota) {
            float dotaX = Integer.parseInt(s.split(" ")[0]);
            float dotaY = Integer.parseInt(s.split(" ")[1]);
            float otvet = (float) Math.abs(Math.sqrt(((dotaX - okrX) * (dotaX - okrX)) + ((dotaY - okrY) * (dotaY - okrY)))); // xD

            if (otvet < okrRaduis) {
                System.out.println(1);
            }
            if (otvet == okrRaduis) {
                System.out.println(0);
            }
            if (otvet > okrRaduis) {
                System.out.println(2);
            }
        }
    }
}
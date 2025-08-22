import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 6;

        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num2 / num1); //0.5, but goes to 0
        System.out.println(num2 - num1);
        System.out.println(num1 - num2);

        num1 += 5;
        System.out.println(num1);
        num1 -= 5;
        System.out.println(num1);

        int score = 0;
        int turns = 10;

        score++;
        turns--;
        System.out.println(score);
        System.out.println(turns);

        int number = 55;
        System.out.println(number++);

        String name1 = "Eddie Chow";
        System.out.println(name1);

        System.out.println(name1.length());

        char vowels[] = {'u', 'i', 'e', 'o', 'a'};
        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.sort(vowels, startingIndex, endingIndex); //sorts index 1, 2, and 3
        System.out.println(Arrays.toString(vowels));

        int numbers[] = {1, 2, 3, 4, 5};

        int startingIndex2 = 1;
        int endingIndex2 = 10;

        int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex2, endingIndex2);

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));

        int num5 = 5;
        int multiplier = 1;

        do {
            System.out.println(num5 * multiplier);

            multiplier++;
        } while (multiplier <= 10);


        ArrayList<Integer> numberss = new ArrayList<Integer>();
        numberss.add(1);
        numberss.add(2);
        numberss.add(3);
        numberss.add(4);

        System.out.println(numberss.get(2));

        numberss.clear();

        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Math", 86);
        examScores.put("English", 76);
        examScores.put("Spanish", 67);
        examScores.put("French", 99);

        System.out.println(examScores.toString());

        Book carmilla = new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);

        System.out.println(dracula.toString());
    }


}

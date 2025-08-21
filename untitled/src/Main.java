//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        score ++;
        turns --;
        System.out.println(score);
        System.out.println(turns);



    }
}
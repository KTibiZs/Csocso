
public class Main {
    public static void main(String[] args) {
        double game = 38;
        double win = 19;
        double wr = (win / game) * 100;
        int plusGameCounter = 0;

        while (83.33 > wr) {
            game++;
            win++;
            plusGameCounter++;
            wr = (win / game) * 100;
        }
        System.out.printf("Need more win(s): %d \nActual win rate: %.2f%%", plusGameCounter, wr);
    }
}

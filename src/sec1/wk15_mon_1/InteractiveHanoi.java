package sec1.wk15_mon_1;
import java.util.Scanner;
import java.util.Stack;

public class InteractiveHanoi {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < 5; i++) {
            s.push(i);
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(s.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();
        TowersOfHanoi game = new TowersOfHanoi(numberOfDisks);

        int moveCounter = 0;
        int input;
        boolean allowed;
        while(! game.towerC.isComplete(numberOfDisks)) {
            moveCounter++;
            game.displayTowers();
            input = getMove(scanner);
            switch (input) {
                case 1:
                    allowed = game.move(game.towerA, game.towerB);
                    break;
                case 2:
                    allowed = game.move(game.towerA, game.towerC);
                    break;
                case 3:
                    allowed = game.move(game.towerB, game.towerA);
                    break;
                case 4:
                    allowed = game.move(game.towerB, game.towerC);
                    break;
                case 5:
                    allowed = game.move(game.towerC, game.towerA);
                    break;
                case 6:
                    allowed = game.move(game.towerC, game.towerB);
                    break;
                default:
                    allowed = false;
                    System.out.println("How?");
                    break;
            }
            System.out.println("Allowed: " + allowed + "\n");
        }
        game.displayTowers();
        System.out.println("You solved it in " + moveCounter + " moves!");

    }

    public static int getMove(Scanner in) {
        System.out.println("Options");
        System.out.println("A -> B: 1  |  B -> A: 3  |  C -> A: 5");
        System.out.println("A -> C: 2  |  B -> C: 4  |  C -> B: 6");

        int input;
        do {
            System.out.print("Move: ");
            input = in.nextInt();
        } while (input < 1 || input > 6);

        return input;
    }
}

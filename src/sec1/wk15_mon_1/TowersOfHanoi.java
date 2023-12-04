package sec1.wk15_mon_1;
import java.util.Scanner;

public class TowersOfHanoi {

    final Tower towerA;
    final Tower towerB;
    final Tower towerC;
    private final int maxHeight;
    private final int maxDiskWidth;

    public TowersOfHanoi() {
        this(3);
    }

    public TowersOfHanoi(int numberOfDisks) {
        this.maxHeight = numberOfDisks;
        this.maxDiskWidth = 3 + (numberOfDisks - 1) * 2;
        // Initialize the towers
        towerA = new Tower("Tower A", maxDiskWidth);
        towerB = new Tower("Tower B", maxDiskWidth);
        towerC = new Tower("Tower C", maxDiskWidth);


        // Add disks to the initial tower
        for (int i = numberOfDisks; i > 0; i--) {
            towerA.pushDisk(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();


        TowersOfHanoi th = new TowersOfHanoi(numberOfDisks);
        // Display the initial state
        th.displayTowers();

        th.solveIteratively();
//        th.solveRecursively(numberOfDisks, th.towerA, th.towerB, th.towerC);
        th.displayTowers();
        scanner.close();
    }

    private void solveIteratively() {
        int moves = (int) (Math.pow(2, maxHeight) - 1);
        Tower source = towerA, dest = towerC, aux = towerB;
        if(maxHeight % 2 == 0) {
            dest = towerB;
            aux = towerC;
        }
        for(int i = 1; i <= moves; i++) {
            int value = i%3;
            boolean foo;
            if(value == 1) {
                foo = move(source, dest) || move(dest, source);
            } else if(value == 2) {
                foo = move(source, aux) || move(aux, source);
            } else {
                foo = move(aux, dest) || move(dest, aux);
            }
        }

    }

    // Recursive method to solve the Towers of Hanoi problem
    private void solveRecursively(int n, Tower source, Tower auxiliary, Tower destination) {

        if(n > 0) {
//            System.out.printf("n: %d, S: %s, D: %s, A: %s\n", n, source, destination, auxiliary);
            solveRecursively(n - 1, source, destination, auxiliary);

            destination.pushDisk(source.popDisk());
            System.out.println(n);
//            displayTowers();

            solveRecursively(n - 1, auxiliary, source, destination);
        }
    }

    public boolean move(Tower from, Tower to) {
        int fromDisk = from.getTopDisk();
        int toDisk = to.getTopDisk();
        if(fromDisk != 0 && (toDisk == 0 || fromDisk < toDisk)) {
            int disk = from.popDisk();
            to.pushDisk(disk);
            return true;
        }
        return false;
    }

    // Display the current state of towers using ASCII art
    public void displayTowers() {
        System.out.println("-".repeat(maxDiskWidth*3 + 4));
        for (int i = maxHeight - 1; i >= 0; i--) {
            System.out.print(drawDisk(towerA.getDisk(i)));
            System.out.print("   ");
            System.out.print(drawDisk(towerB.getDisk(i)));
            System.out.print("   ");
            System.out.print(drawDisk(towerC.getDisk(i)));
            System.out.println();
        }
        System.out.println("-".repeat(maxDiskWidth*3 + 6));
        System.out.println(towerA.toString() + "   " + towerB + "  " + towerC + "\n");
    }

    // Draw a disk using ASCII art
    public String drawDisk(int diskNumber) {
        StringBuilder disk = new StringBuilder();
        int diskCharacters = (diskNumber == 0) ? 1 : (diskNumber - 1) * 2 + 1;
        int spaces = (maxDiskWidth - diskCharacters) / 2;

        disk.append(" ".repeat(spaces));

        if (diskNumber > 0) {
            disk.append(Integer.toString(diskNumber).repeat(diskCharacters));
        } else {
            disk.append("|");
        }

        disk.append(" ".repeat(spaces));

        return disk.toString();
    }

}

// Tower class to represent each tower
class Tower {
    private final String name;
    private final java.util.Stack<Integer> disks;
    String before, after;

    public Tower(String name, int maxWidth) {
        this.name = name;
        this.disks = new java.util.Stack<>();
        int nameLength = name.length();
        int spaceCount = Math.max((maxWidth - nameLength)/2, 0);
        before = " ".repeat(spaceCount);
        after = before;
        if(spaceCount * 2 + nameLength < maxWidth) {
            after = " " + after;
        }
    }

    public boolean isComplete(int numberOfDisks) {
        return disks.size() >= numberOfDisks;
    }
    public void pushDisk(int disk) {
        disks.push(disk);
    }

    public int popDisk() {
        return disks.pop();
    }

    public int size() {
        return disks.size();
    }

    public int getTopDisk() {
        if(disks.empty()) {
            return 0;
        } else {
            return disks.peek();
        }
    }

    public int getDisk(int index) {
        if (index >= 0 && index < disks.size()) {
            return disks.get(index);
        } else {
            return 0; // Return 0 for an index outside the valid range
        }
    }

    public String toString() {
        return before + name + after;
    }
}
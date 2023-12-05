package sec2.wk15_mon_2;
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

//        th.solveIteratively();
        th.solveRecursively(numberOfDisks, th.towerA, th.towerB, th.towerC);

        scanner.close();
    }

    private void solveIteratively() {
        int numberOfRings = maxHeight;
        int moves = (int) (Math.pow(2, numberOfRings) - 1);
        Tower s = towerA, d = towerC, a = towerB;
        if(numberOfRings% 2 == 0) {
            d = towerB;
            a = towerC;
        }
        for(int i = 1; i <= moves; i++) {
            boolean result;
            int option = i%3;
            if(option == 1) {
//                result = move(s, d) || move(d, s);
                if(move(s, d)) {
                    System.out.printf("Source: %s, Dest: %s, Aux: %s%n",
                            s, d, a);
                } else {
                    move(d, s);
                    System.out.printf("Source: %s, Dest: %s, Aux: %s%n",
                            d, s, a);
                }
            } else if(option == 2) {
//                result = move(s, a) || move(a, s);
                if(move(s, a)) {
                    System.out.printf("Source: %s, Dest: %s, Aux: %s%n",
                            s, a, d);
                } else {
                    move(a, s);
                    System.out.printf("Source: %s, Dest: %s, Aux: %s%n",
                            a, s, d);
                }
            } else {
//                result = move(a, d) || move(d, a);
                if(move(d, a)) {
                    System.out.printf("Source: %s, Dest: %s, Aux: %s%n",
                            d, a, s);
                } else {
                    move(a, d);
                    System.out.printf("Source: %s, Dest: %s, Aux: %s%n",
                            a, d, s);
                }
            }
//            displayTowers();
        }
    }

    // Recursive method to solve the Towers of Hanoi problem
    private void solveRecursively(int n, Tower source, Tower auxiliary, Tower destination) {

        if(n > 0) {
            solveRecursively(n - 1, source, destination, auxiliary);

            destination.pushDisk(source.popDisk());
            System.out.printf("Source: %s, Dest: %s, Aux: %s%n",
                    source, destination, auxiliary);
//            displayTowers();
            solveRecursively(n - 1, auxiliary, source, destination);
        }
        //
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
package sec1.sept20;

public class Main {
    public static void main(String[] args) {
        Coffee c = new Coffee();
        c.add(new Syrup("chocolate"));
        System.out.println(c);
        c.add(new Syrup("vanilla"));
        Syrup s3 = new Syrup("pumpkin spice");
        c.add(s3);
        System.out.println(c);
        c.resize();
        c.add(new Syrup("peppermint"));
        System.out.println(c);
    }
}

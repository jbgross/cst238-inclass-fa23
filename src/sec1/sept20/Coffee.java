package sec1.sept20;

public class Coffee {

    private Syrup [] syrups;
    private int syrupCount;

    private static final int DEFAULT_MAX_SYRUPS = 3;

    public Coffee() {
        syrups = new Syrup[DEFAULT_MAX_SYRUPS];
        syrupCount = 0;
    }

    public void resize() {
        // create new array
        Syrup [] moreSyrups = new Syrup[syrups.length * 2];
        // copy contents
        for(int i = 0; i < syrupCount; i++) {
            moreSyrups[i] = syrups[i];
        }
        // change reference
        syrups = moreSyrups;
    }

    public void add(Syrup s) {
        if(syrupCount >= syrups.length) {
            System.out.println("Too many syrups, it's not coffee anymore");
            return;
        }
        syrups[syrupCount++] = s;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Coffee");
        for(int i = 0; i < syrupCount; i++) {
            sb.append(" with ").append(syrups[i].toString());
        }

        return sb.toString();
    }
}

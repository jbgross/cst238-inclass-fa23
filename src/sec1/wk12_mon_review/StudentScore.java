package sec1.wk12_mon_review;

public class StudentScore implements Comparable<StudentScore> {
    private int score;
    private char letterGrade;
    public StudentScore(int score) {
        this.score = score;
        assignLetterGrade();
    }

    public int getScore() {
        return score;
    }

    private void assignLetterGrade() {
        if(score >= 90) {
            letterGrade = 'A';
        } else if(score >= 80) {
            letterGrade = 'B';
        } else if(score >= 70) {
            letterGrade = 'C';
        } else {
            letterGrade = 'F';
        }
    }

    // equals(s:StudentScore):boolean
    public boolean equals(StudentScore s) {
//        return this.letterGrade == s.letterGrade;
        return this.compareTo(s) == 0;
    }

    public int compareTo(StudentScore s) {
        return s.letterGrade - this.letterGrade;
    }

    public String toString() {
        return letterGrade + " (" + score + ")";
    }
}

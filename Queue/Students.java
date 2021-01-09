public class Students {
    private String firstname, lastname;

    public void Student(String fname, String lname){
        this.firstname = fname;
        this.lastname  = lname;
    }
}

class Main{
    public static void main(String[] args) {
        Students[] s = new Students[3];
        s[1].Student("ABC","XYZ");
        s[2].Student("PQR", "CQD");

    }
}
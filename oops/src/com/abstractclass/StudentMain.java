package com.abstractclass;

abstract class Student {
    private int id;
    private String name;
    private float fees;

    static String institute;
    static float discount;

    Student() 
    {
    	
    }

    Student(int id, String name, float fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    static 
    {
        institute = "Rising star";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

    public static String getInstitute() {
        return institute;
    }

    public static void setInstitute(String institute) {
        Student.institute = institute;
    }

    abstract void description();

    static float getDiscount() {
        return discount;
    }

    static void setDiscount(float newDiscount) {
        discount = newDiscount;
    }

    final void display() {
        System.out.println("Institute name: " + institute);
        System.out.println("Discount is: " + discount + "%");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Fees: " + fees);
        System.out.println("Discounted cost: " + (fees - ((discount / 100) * fees)));
    }
}

class Dancestudent extends Student {
    private String type;
    private String Coriographer;

    Dancestudent() 
    {
    	
    }

    Dancestudent(int id, String name, float fees, String type, String coriographer) {
        super(id, name, fees);
        this.type = type;
        this.Coriographer = coriographer;
    }

    void description() {
        System.out.println("He is a dancer");
        System.out.println("Type of dancing is " + type);
        System.out.println("The choreographer: " + Coriographer);
    }
}

class Musicstudent extends Student {
    private String singertype;

    Musicstudent() {
    }

    Musicstudent(int id, String name, float fees, String singertype) {
        super(id, name, fees);
        this.singertype = singertype;
        
    }

    void description() {
        System.out.println("He is a singer");
        System.out.println("Singer type is " + singertype);
    }
}

class Artist extends Student {
    private String artisttype;
    private String certification;

    Artist() {
    }

    Artist(int id, String name, float fees, String artisttype, String certification) {
        super(id, name, fees);
        this.artisttype = artisttype;
        this.certification = certification;
    }

    void description() {
        System.out.println("He is an artist");
        System.out.println("His type is " + artisttype);
        System.out.println("He is certified as " + certification);
    }
}

public class StudentMain {
    public static void main(String[] args) {
    	
    
        Student.setDiscount(25);

        Dancestudent d1 = new Dancestudent(101, "Rohit", 23000, "Raper", "Remo D'Souza");
        d1.description();
        d1.display();

        System.out.println("==============================");

        Musicstudent m1 = new Musicstudent(111, "Pratik", 50000, "Marathi song");
        m1.description();
        m1.display();

        System.out.println("+++++++++++++++++++++++++++++++++++");

        Artist a1 = new Artist(222, "Sumit", 45000, "Sketching", "Intermediate");
        a1.description();
        a1.display();
    }
}

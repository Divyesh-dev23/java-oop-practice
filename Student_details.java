class Student {
    String name;
    int roll_no;
    float marks;

    Student(String name , int roll_no , float marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name:- " + name);
        System.out.println("Roll.no:- " + roll_no);
        System.out.println("Marks:- " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Divyesh", 101, 89.5f);
        Student s2 = new Student("Rahul", 102, 76.0f);

        s1.displayDetails();
        s2. displayDetails();
    }
}
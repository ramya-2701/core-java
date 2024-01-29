public class Student {
    String name;

    public Student(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args){
        Student s=new Student("Ramya");
        System.out.println("name:"+s.getName());
    }
}

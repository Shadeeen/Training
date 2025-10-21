public class Student {

   private String name;
   private int age;
   private double grade;
   private int id;


   public Student(){}
    public Student(int id,String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.id = id;

    }

   public String showDetails() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }


   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       this.age = age;
   }

    public double getGrade() {
       return grade;
   }

    public void setGrade(double grade) {
       this.grade = grade;
   }

    public int getId() {
       return id;
    }


    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

}

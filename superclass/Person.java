package superclass;
public class Person {
   
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }   

/*************  ✨ Codeium Command ⭐  *************/
    /**
     * Returns the name of the person
     * @return the name of the person
     */
/******  b6f550d3-8c20-4800-acb1-65344a6c905f  *******/
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

        public void print() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }


package superclass;

public class FullTime extends Teacher {


    private String unit;
    private int anualsalary;
    
    public FullTime(String name, int age, String subject, String unit, int anualsalary) {
        super(name, age, subject);
        this.unit = unit;
        this.anualsalary = anualsalary;
    }
    
    public String getUnit() {
        return unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public int getAnualsalary() {
        return anualsalary;
    }
    
    public void setAnualsalary(int anualsalary) {
        this.anualsalary = anualsalary;
    }
    public void print() {
        super.print();
        System.out.println("Unit : " + unit);
        System.out.println("Anual salary : " + anualsalary);
    }

}
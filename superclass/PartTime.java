package superclass;

public class PartTime extends Teacher {
    

        private int hoursworked;
        private int Salary;

       

        public PartTime(String name, int age, String subject, int hoursworked, int Salary) {
            super(name, age, subject);
            this.hoursworked = hoursworked;
            this.Salary = Salary;
        }

        public int getHoursworked() {
            return hoursworked;
        }

        public void setHoursworked(int hoursworked) {
            this.hoursworked = hoursworked;
        }

        public int getSalary() {
            return this.Salary;
        }

        public void setSalary(int Salary) {
            this.Salary = Salary;
        }

        public void print() {
            super.print();
            System.out.println("Hours Worked: " + hoursworked);
        }
    }


package labassignment1;

public class Employee {
    public class empsalary{
        float salary=40000;
    }
    public static class programmers extends empsalary{
        int bonus=10000;
    }
        public static void main(String[] args) {
            programmers p = new programmers();
            System.out.println("the salary of the programmer is : "+p.salary);
            System.out.println("the bonus of the programmer  is : "+ p.bonus);
        }
        
    }


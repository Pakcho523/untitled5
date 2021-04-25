abstract class Employee{
    public abstract double earnings();
}
   class YearWorker extends Employee{
       public double earnings(){
           return 12000;
       }
   }
    class MouthWorker extends Employee{ class YearWorker extends Employee{
        public double earnings(){

            return 12000;
        }

    }
        public double earnings(){

            return 12*2300;
        }
    }
    class Weekworker extends Employee{
        public double earnings(){
            return 52*780;
        }
    }
class Dayworker extends Employee{
    public double earnings(){

        return 365*100;
    }

}
    class Company {
        Employee[] employee;
        double salaries=0;
        Company(Employee[] employee){
            this.employee=employee;
        }
        public double salariesPay(){
            salaries=0;
            for(int i=0;i<employee.length;i++){
                salaries=salaries+employee[i].earnings();
            }
            return salaries;
        }
    }
    public class CompanySalary {
        public static void main(String arg[]){
            Employee[]employee=new Employee[29];
            for(int i=0;i<employee.length;i++){
                if(i%4==0)
                    employee[i]=new Weekworker();
                if(i%4==1)
                    employee[i]=new MouthWorker();
                else if (i%4==2)
                    employee[i]=new YearWorker();
                else if (i%4==3)
                    employee[i]=new Dayworker();
            }
            Company company=new Company(employee);
            System.out.println("公司薪水总额："+company.salariesPay()+"元");
        }
    }




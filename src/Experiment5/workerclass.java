package Experiment5;

public class workerclass {

    String name;
    double salaryRate;

    public workerclass(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return 0; // Base class computePay does nothing; overridden in subclasses
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary Rate: " + salaryRate;
    }
}

class DailyWorker extends workerclass {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int days) {  // Days worked, not hours directly
        return days * 8 * salaryRate; // 8 hours per day assumed
    }
}

class SalariedWorker extends workerclass {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate;  // Fixed pay for 40 hours
    }

    public static void main(String[] args) {
        DailyWorker daily = new DailyWorker("John Doe", 100); 
        SalariedWorker salaried = new SalariedWorker("Jane Smith", 150); 


        System.out.println(daily);
        double dailyPay = daily.computePay(5);  
        System.out.println("Daily Worker Pay: $" + dailyPay);

        System.out.println(salaried);
        double salariedPay = salaried.computePay(50); 
        System.out.println("Salaried Worker Pay: $" + salariedPay);


        DailyWorker anotherDailyWorker = new DailyWorker("Alice Johnson",75);
        System.out.println(anotherDailyWorker);
        double anotherDailyPay = anotherDailyWorker.computePay(7);
        System.out.println("Another Daily Worker Pay: $"+anotherDailyPay);

    }
}
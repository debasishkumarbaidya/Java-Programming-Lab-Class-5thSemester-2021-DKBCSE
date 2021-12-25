import java.io.*;

class Employee {
    String Emp_name, Emp_code, address, Phone;
    double da = 0.1;
    double hra = 0.2;

    Employee(String code, String name, String add, String ph) {
        Emp_code = code;
        Emp_name = name;
        address = add;
        Phone = ph;
    }

}

class Teaching extends Employee {
    String subject;
    String Designation;

    Teaching(String code, String name, String add, String ph, String sub, String Desi) {
        super(code, name, add, ph);
        subject = sub;
        Designation = Desi;
    }
}

class Faculty extends Teaching {
    double basic;

    Faculty(String code, String name, String add, String ph, String sub, String Desi, double sal) {
        super(code, name, add, ph, sub, Desi);
        basic = sal;
    }

    void Salary_cal() {
        double salary = basic + (da * basic) + (hra * basic);
        System.out.println("Employee code is " + Emp_code);
        System.out.println("Employee name is " + Emp_name);
        System.out.println("Employee salary is " + salary);

    }
}

class Technical extends Teaching {
    double basic;

    Technical(String code, String name, String add, String ph, String sub, String Desi, double sal) {
        super(code, name, add, ph, sub, Desi);
        basic = sal;
    }

    void Salary_cal() {
        double salary = basic + (da * basic) + (hra * basic);
        System.out.println("Employee code is " + Emp_code);
        System.out.println("Employee name is " + Emp_name);
        System.out.println("Employee salary is " + salary);
    }

}

class Inherit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Faculty or Technical ");
        String type = (br.readLine());
        
        if (type == "Faculty") {
            System.out.println("Enter Employee Code");
            String code = (br.readLine());
            System.out.println("Enter Employee Name");
            String name = (br.readLine());
            System.out.println("Enter Employee Address");
            String add = (br.readLine());
            System.out.println("Enter Employee Phone");
            String ph = (br.readLine());
            System.out.println("Enter Employee Subject Specialization");
            String sub = (br.readLine());
            System.out.println("Enter Employee Designation");
            String desi = (br.readLine());
            System.out.println("Enter Employee basic pay ");
            double basic = Double.parseDouble(br.readLine());

            Faculty fac = new Faculty(code, name, add, ph, sub, desi, basic);
            fac.Salary_cal();
        } else {
            System.out.println("Enter Employee Code");
            String code = (br.readLine());
            System.out.println("Enter Employee Name");
            String name = (br.readLine());
            System.out.println("Enter Employee Address");
            String add = (br.readLine());
            System.out.println("Enter Employee Phone");
            String ph = (br.readLine());
            System.out.println("Enter Employee Subject Specialization");
            String sub = (br.readLine());
            System.out.println("Enter Employee Designation");
            String desi = (br.readLine());
            System.out.println("Enter Employee basic pay ");
            double basic = Double.parseDouble(br.readLine());

            Technical tech = new Technical(code, name, add, ph, sub, desi, basic);
            tech.Salary_cal();
        }
    }
}
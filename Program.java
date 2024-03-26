package observer;

public class Program {

    
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student = new Student("Student #1");
        Master master = new Master("Master #1");
        //Master master2 = new Master("Master #2");
        Applicant applicant = new Applicant("Applicant", 80_000);

        publisher.registerObserver(student);
        publisher.registerObserver(master);
        publisher.registerObserver(applicant);


        for (int i = 0; i <= 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            if (applicant.getStartSalary()!= applicant.getSalary()){
                publisher.removeObserver(applicant);
            }
        }


    }

}

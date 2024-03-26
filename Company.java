package observer;

import java.util.Random;

public class Company {

    private Random random = new Random();


    private String name;

    private Publisher jobAgency;

    private int maxSalary;
    TypeOfVacancy[] types = TypeOfVacancy.values();

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        TypeOfVacancy randomType = types[random.nextInt(types.length)];
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(name, salary, randomType);
        jobAgency.sendVacancy(vacancy);
    }


}

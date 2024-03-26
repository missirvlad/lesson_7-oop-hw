package observer;

public class Vacancy {
    private String companyName;
    private int salary;
    private TypeOfVacancy type;

    public Vacancy(String companyName, int salary, TypeOfVacancy type) {
        this.companyName = companyName;
        this.salary = salary;
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public TypeOfVacancy getTypeOfVacancy() {
        return type;
    }
}


package observer;

public class Student implements Observer{

    private String name;
    private int salary;

    public Student(String name){
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveVacancy(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getTypeOfVacancy());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getTypeOfVacancy());
        }
    }
}

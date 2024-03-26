package observer;

public class Master implements Observer{

    private String name;
    private int salary;

    public Master(String name){
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveVacancy(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getTypeOfVacancy());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getTypeOfVacancy());
        }
    }
}

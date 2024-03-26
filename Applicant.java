package observer;

import java.util.Random;

public class Applicant implements Observer {
    private String name;
    private int salary;
    private int startSalary;

    private TypeOfVacancy type;
    TypeOfVacancy[] types = TypeOfVacancy.values();
    private Random random = new Random();

    public Applicant(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.startSalary = salary;
        this.type = types[random.nextInt(types.length)];

    }

    public int getStartSalary() {
        return startSalary;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public void receiveVacancy(Vacancy vacancy) {
        if (this.salary - vacancy.getSalary() > 10_000 && vacancy.getTypeOfVacancy().equals(type)){
            System.out.printf("Соискатель %s(желаемая должность: %s): Мне нужна эта работа! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, type, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getTypeOfVacancy());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Соискатель %s(желаемая должность: %s): Я найду работу получше! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, type, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getTypeOfVacancy());
        }
    }
}

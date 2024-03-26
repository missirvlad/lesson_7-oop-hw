package observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    public void sendVacancy(Vacancy vacancy){
        for (Observer observer : observers){
            observer.receiveVacancy(vacancy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}

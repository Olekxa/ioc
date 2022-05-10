package applicationWIthDi;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        Statistic statistic  = new Statistic();
        Dependency dependency =  new Dependency(schedule);

    }
}

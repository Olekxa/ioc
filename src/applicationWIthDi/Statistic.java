package applicationWIthDi;

public class Statistic implements IData {
    private String data;

    public Statistic(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return "List of violation";
    }
}

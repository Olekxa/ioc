package applicationWIthDi;

public class Statistic implements IData {
    private String data;

    @Override
    public String getData() {
        return "List of visiting";
    }
}

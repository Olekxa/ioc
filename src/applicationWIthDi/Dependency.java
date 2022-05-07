package applicationWIthDi;

public class Dependency {
    private IData data;

    public Dependency(String info) { //injected!!!
        this.data = new Statistic(info);
    }

    public Dependency(IData data) { //another way
        this.data = data;
    }

    public void doResult() {
        System.out.println(data.getData());
    }
}

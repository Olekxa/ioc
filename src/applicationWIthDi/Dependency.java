package applicationWIthDi;

public class Dependency {
    private IData data;

    public Dependency(IData data) { //another way
        this.data = data;
    }   //injected!!!

    public void doResult() {
        System.out.println(data.getData());
    }
}

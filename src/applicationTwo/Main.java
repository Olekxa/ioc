package applicationTwo;

public class Main {
    public static void main(String[] args) {

        Locator locator = Locator.getInstance();
        Launcher launcher = new Launcher(locator);
    }
}

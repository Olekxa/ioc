package application;

public class Factory {
    Ivanov ivanov;

    public String doWork() {
        return "detail";
    }

    class Shop {
        Factory factory = new Factory();

        public String runFactory() {
            return factory.doWork();
        }
    }
}

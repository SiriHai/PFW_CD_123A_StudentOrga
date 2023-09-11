package demo;

public class GBox<T> {
    private T value;

    public GBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) throws Exception {
        
        GBox<String> gbox = new GBox<String>("Himbeere");
        System.out.println(gbox.getValue());
       
        GBox<Integer> gbox2 = new GBox<>(42);
        System.out.println(gbox2.getValue() + 1);
        
        gbox.setValue("47");

        System.out.println(gbox.getValue());
    }
}

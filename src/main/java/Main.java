/**
 * Created by cong on 17/05/17.
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        task.doTask(() -> System.out.println("This is lambda"));
    }
}

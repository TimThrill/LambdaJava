/**
 * Created by cong on 17/05/17.
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        // This is an anonymous class
        task.doTask(new LambdaInterface() {
            @Override
            public void printLambda() {
                System.out.println("This is anonymous print lambda");
            }
        });

        // This is the lambda expression
        task.doTask(() -> System.out.println("This is lambda"));
    }
}

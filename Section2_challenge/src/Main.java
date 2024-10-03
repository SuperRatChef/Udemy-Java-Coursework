//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double doubleVar1 = 20.00d;
        double doubleVar2 = 80.00d;
        boolean result = ((doubleVar1 + doubleVar2) * 100.00d)%40.00d == 0 ? true : false;
        System.out.println(result);

        if(!result){
            System.out.println("Got some remainder");
        }
    }
}
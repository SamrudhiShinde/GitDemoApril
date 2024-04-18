import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Car class Demo");
        Car c1=new Car(100000,1200,80);
        Car c2=new Car(200000,700,100);
        Car c3=new Car(700000,790,103);
        Car c4=new Car(300000,980,40);
        List<Car> cars= Arrays.asList(c1,c2,c3,c4);
        cars.sort(new CarComparator());
        System.out.println(cars);
    }
}
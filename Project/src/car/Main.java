package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("pride","111",50000000);


        System.out.println("Final price is: "+car.FinalPrice());

        car.AddOption1("david",1500000);

        System.out.println("Final price is: "+car.FinalPrice());
    }
}

package NewCar;

public class Main {
    public static void main(String[] args) {
        /*Car car = new Car("volvo", "750", 190000000);

        System.out.println("Final Price No Option = " + car.FinalPrice());

        car.AddOption1("turbo",350000);

        car.AddOption2("handeling",8520000);

        System.out.println("Final = " + car.FinalPrice());*/

        /*ECO eco = new ECO("BMW","730",200000000);

        eco.AddOption3("hdf",12000);
        System.out.println(eco.FinalPrice());*/

        Enterprice enterprice= new Enterprice("Toyota","Prado",75000000);

        enterprice.AddOption1("newFace",1500000);
        System.out.println(enterprice.FinalPrice());

        enterprice.AddEnterPriceOption1("tier",750000);

        System.out.println(enterprice.FinalPrice());

    }
}

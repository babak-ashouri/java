package NewCar;

public class Car {
    private String name;
    private String model;
    private int price;

    private String option1Name;
    private int option1Price;
    private String option2Name;
    private int option2Price;
    private String option3Name;
    private int option3Price;
    private String option4Name;
    private int option4Price;


    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public void AddOption1(String name, int price) {
        this.option1Name = name;
        this.option1Price = price;
    }

    public void AddOption2(String name, int price) {
        this.option2Name = name;
        this.option2Price = price;
    }

    public void AddOption3(String name, int price) {
        this.option3Name = name;
        this.option3Price = price;
    }

    public void AddOption4(String name, int price) {
        this.option4Name = name;
        this.option4Price = price;
    }


    public int FinalPrice() {
        int finalPrice = this.price;
        if (option1Name != null) {
            finalPrice += option1Price;
            System.out.println("one Op name = "+option1Name+", "+"in price "+ option1Price);
        }
        if (option2Name != null) {
            finalPrice += option2Price;
            System.out.println("tow Op name = "+option2Name+", "+"in price "+ option2Price);
        }
        if (option3Name != null) {
            finalPrice += option3Price;
            System.out.println("three Op name = "+option3Name+", "+"in price "+ option3Price);
        }
        if (option4Name != null) {
            finalPrice += option4Price;
            System.out.println("four Op name = "+option4Name+", "+"in price "+ option4Price);
        }
        return finalPrice;
    }
}
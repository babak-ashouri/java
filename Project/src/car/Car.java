package car;

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
        System.out.println("price of car width name:" + this.name + " is " + finalPrice);

        if (option1Name != null) {
            finalPrice += this.option1Price;
            System.out.println("One option by name " + this.option1Name + " Added.");
        }
        if (option2Name != null) {
            finalPrice += this.option2Price;
            System.out.println("tow option by name " + this.option2Name + " Added.");
        }
        if (option3Name != null) {
            finalPrice += this.option3Price;
            System.out.println("three option by name " + this.option3Name + " Added.");
        }
        if (option4Name != null) {
            finalPrice += this.option4Price;
            System.out.println("four option by name " + this.option4Name + " Added.");
        }
        return finalPrice;
    }

}

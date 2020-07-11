package NewCar;

public class Enterprice extends Car {
    private String optionEnterPrice1Name;
    private int optionEnterPrice1Price;
    private String optionEnterPrice2Name;
    private int optionEnterPrice2Price;

    public Enterprice(String name, String model, int price) {
        super(name, model, price);
    }
    public void AddEnterPriceOption1(String name,int price){
        optionEnterPrice1Name=name;
        optionEnterPrice1Price=price;
        System.out.println("A E P 1 = "+optionEnterPrice1Name+" price = "+optionEnterPrice1Price);
    }
    public void AddEnterPriceOption2(String name,int price){
        optionEnterPrice2Name=name;
        optionEnterPrice2Price=price;
        System.out.println("A E P 2 = "+optionEnterPrice2Name+" price = "+optionEnterPrice2Price);

    }

    @Override
    public int FinalPrice() {
        int finalprice= super.FinalPrice();
        if (optionEnterPrice1Name!=null){
            finalprice+=optionEnterPrice1Price;
        }
        if (optionEnterPrice2Name!=null){
            finalprice+=optionEnterPrice2Price;
        }
        return finalprice;
    }
}

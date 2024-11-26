package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name,double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1Price=price;
    }
    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        super.addHamburgerAddition3(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4(name, price);
    }

    @Override
    public void itemizeHamburger() {

        double totalPrice=getPrice();
        System.out.println("Name: " +getName() + "\n"+"Meat: " + getMeat() +"\n"+"BreadRollType: "+getBreadRollType());

        if(getAddition1Name()!=null){
            System.out.println("Addition1: " + getAddition1Name());
            totalPrice += getAddition1Price();
        }
        if (getAddition2Name() != null) {
            System.out.println("Addition2: " +getAddition2Name());
            totalPrice += getAddition2Price();
        }
        if (getAddition3Name() != null) {
            System.out.println("Addition3: " + getAddition3Name() );
            totalPrice += getAddition3Price();
        }
        if (getAddition4Name() != null) {
            System.out.println("Addition4: " + getAddition4Name());
            totalPrice += getAddition1Price();
        }

        if(this.healthyExtra1Name!=null){
            System.out.println("HealthyAddition1: "+this.healthyExtra1Name);
            totalPrice+=healthyExtra1Price;
        }
        if(this.healthyExtra2Name!=null){
            System.out.println("HealthyAddition2: "+this.healthyExtra2Name);
            totalPrice+=healthyExtra2Price;
        }
        System.out.println("Price: "+totalPrice);
    }
}

package bookPhone;

public class Phone {


    String name;
    long number;
    String model;
    String color;


    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", model='" + model + '\'' +
                ", color='" + color;
    }

    public String call(String name1) {

            System.out.println("Звонит " + name);
            System.out.println("Номер телефона: " + number);
            return name1;}


}
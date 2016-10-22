package customers;
import java.util.Comparator;
public class CustomerFile {
    private String name;
    private String surName;
    private String patronymic;
    private int age;
    private String address;
    private int card;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    CustomerFile(String name, String surName, String patronymic, int age, String address, int card) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.age = age;
        this.address = address;
        this.card = card;

    }
    public String toString() {
        return "Name: " + this.name + "  " + this.patronymic +  "  " + this.surName + "  | " + this.age + " years of age. Address: " + this.address+ " | Credit Card Number " + this.card;
    }

    static Comparator<CustomerFile> nameSort = new Comparator<CustomerFile>() {
        public int compare(CustomerFile a1, CustomerFile a2) {
            return a1.name.compareTo(a2.name);

        }
    };

}

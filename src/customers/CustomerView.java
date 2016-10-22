package customers;
import java.util.ArrayList;
import java.util.Collections;

import static customers.CustomerFile.nameSort;
public class CustomerView {
    public static void main(String[] args) {
        ArrayList<CustomerFile> allCustomers = new ArrayList<>();
        String[] nameFile = {"John", "Michael", "Nik", "Alex", "Tommy"};
        String[] patronymicFile = {"William", "Nikkolas", "Oliver", "Dominic", "David"};
        String[] surNameFile = {"White", "Black", "Smith", "Mcdonald's", "DiCaprio"};
        String[] addressFile = {"326 Third Avenue", "12035 West Olympic Boulevard", "2964 Tunlaw Road", "13 East Street", "127 Eighth Avenue"};

        for(int i = 0; i < 10; i++) {
            String name = nameFile[1 + (int) (Math.random() * nameFile.length - 1)];
            String patronymic = patronymicFile[1 + (int) (Math.random() * surNameFile.length - 1)];
            String surName = surNameFile[1 + (int) (Math.random() * surNameFile.length - 1)];
            int age = (17 + (int) (Math.random() * 70));
            String address = addressFile[1 + (int) (Math.random() * addressFile.length - 1)];
            int card = (1000 + (int) (Math.random() * 100000));

            CustomerFile customer = new CustomerFile(name, surName, patronymic, age, address, card);

            allCustomers.add(customer);
        }
        System.out.println("Sort list by name:");

        Collections.sort(allCustomers, nameSort);
        for(CustomerFile customerFile : allCustomers) {
            System.out.println( customerFile);
        }
        System.out.println();
        System.out.println("Credit cards in the range from 40000 to 80000:");
        for(int i = 0; i < allCustomers.size(); i++) {
            if (allCustomers.get(i).getCard() > 40000 && allCustomers.get(i).getCard() < 80000){
                System.out.println(allCustomers.get(i));
            }
        }
    }
}

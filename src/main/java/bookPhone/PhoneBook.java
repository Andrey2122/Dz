package bookPhone;


import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<Phone> phones = new ArrayList<>();
    PhoneBook() {
        phones.add(getBob());
        phones.add(getTom());
        phones.add(getSveta());
        phones.add(getSam());
    }


    Phone getBob() {
        Phone bob = new Phone();
        bob.name = "Bob";
        bob.number = 1876543210L;
        bob.model = "iPhone 11";
        bob.color = "white";
        return bob;
    }
    Phone getTom() {
        Phone contact = new Phone();
        contact.name = "Tom";
        contact.number = 1231234123;
        contact.model = "iPhone 12";
        contact.color = "white";
        return contact;
    }
    Phone getSveta() {
        Phone contact = new Phone();
        contact.name = "Sveta";
        contact.number = 332523453;
        contact.model = "iPhone 11";
        contact.color = "white";
        return contact;
    }
    Phone getSam() {
        Phone contact = new Phone();
        contact.name = "Sam";
        contact.number = 1876543210L;
        contact.model = "iPhone 11";
        contact.color = "white";
        return contact;
    }
    List<Phone> getPhones() {
        return phones;
    }





}


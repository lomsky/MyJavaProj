package lesson03;

import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;
import ru.javawebinar.webapp.model.Link;

/**
 * dima
 * 11.07.16.
 */
public class Main {
    public static void main(String[] args) {
        Contact c = new Contact(ContactType.PHONE, "4564654");

        Link l = new Link();

        System.out.println(l);
    }
}

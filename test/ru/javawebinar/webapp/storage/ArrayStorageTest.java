package ru.javawebinar.webapp.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import ru.javawebinar.webapp.WebAppException;
import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;
import ru.javawebinar.webapp.model.Resume;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * dima
 * 12.07.16.
 */
public class ArrayStorageTest {

    private Resume R1, R2, R3;
    private ArrayStorage storage = new ArrayStorage();

    @BeforeClass
    public static void beforeClass() {

    }

    @Before
    public void before() {
        R1 = new Resume("Полное Имя1", "location1");
        R1.addContact(new Contact(ContactType.MAIL,"mail1@ya.ru"));
        R1.addContact(new Contact(ContactType.PHONE,"12313"));

        R2 = new Resume("Полное Имя2", null);
        R2.addContact(new Contact(ContactType.SKYPE,"skype2"));
        R2.addContact(new Contact(ContactType.PHONE,"888888888"));

        R3 = new Resume("Полное Имя3", "location3");
        R3.addContact(new Contact(ContactType.ICQ,"999-99999-9999"));
        R3.addContact(new Contact(ContactType.PHONE,"12313"));

        storage.clear();
        storage.save(R3);
        storage.save(R1);
        storage.save(R2);

    }

    @org.junit.Test
    public void clear() throws Exception {
        storage.clear();
        assertEquals(0, storage.size());
    }

    @org.junit.Test
    public void save() throws Exception {

    }

    @org.junit.Test
    public void update() throws Exception {
        R2.setFullName("Новое имя - 2");
        storage.update(R2);
        assertEquals(R2, storage.load(R2.getUuid()));
    }

    @org.junit.Test(expected = WebAppException.class)
    public void deleteNotFound() throws Exception {
        storage.load("dummy");
    }

    @org.junit.Test
    public void delete() throws Exception {
        storage.delete(R1.getUuid());
        Assert.assertEquals(2, storage.size());

        //Assert.assertEquals(null, storage.load(R1.getUuid()));

    }

    @org.junit.Test
    public void load() throws Exception {
        assertEquals(R1, storage.load(R1.getUuid()));
        assertEquals(R2, storage.load(R2.getUuid()));
        assertEquals(R3, storage.load(R3.getUuid()));
    }

    @org.junit.Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }

    @org.junit.Test
    public void getAllSorted() throws Exception {
        Resume[] src = new Resume[] {R1,R2,R3};
        Arrays.sort(src);
        assertArrayEquals(src, storage.getAllSorted().toArray());
    }

}
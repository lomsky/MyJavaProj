package ru.javawebinar.webapp.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * dima
 * 09.07.16.
 */
public class Resume implements Comparable<Resume>{
    private final String uuid;
    private String fullName;
    private String location;
    private String homepage;

    private List<Contact> contacts = new LinkedList<>();
    private List<Section> sections = new LinkedList<>();

    public Resume(String fullName, String location) {
        this(UUID.randomUUID().toString(), fullName, location);
    }

    public Resume(String uuid, String fullName, String location) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.location = location;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Resume resume = (Resume) o;
//
//        return uuid.equals(resume.uuid);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return uuid.hashCode();
//    }

    public String getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public String getHomepage() {
        return homepage;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Section> getSections() {
        return sections;
    }

//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return uuid.equals(resume.uuid);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(uuid, fullName, location, homepage, contacts, sections);
        return uuid.hashCode();
    }

    @Override
    public int compareTo(Resume o) {
        return fullName.compareTo(o.fullName);
    }
}

package ru.javawebinar.webapp.model;

/**
 * dima
 * 11.07.16.
 */
public enum ContactType {
    PHONE("Тел."),
    MOBILE("Мобильный"),
    HOME_PHONE("Домашний тел."),
    SKYPE("Скайп"),
    MAIL("Эл. почта"),
    ICQ("аська");

    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

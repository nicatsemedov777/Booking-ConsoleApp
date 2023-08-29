package model;

public class Person {
}
private Long id;
    private String name;
    private String surName;
    private List<Booking> bookList;

    public Person(Long id, String name, String surName, List<Booking> bookList) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.bookList = bookList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public List<Booking> getBookList() {
        return bookList;
    }

    public void setBookList(List<Booking> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

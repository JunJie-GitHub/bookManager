package com.jerry.BookManager.model;


public class Book {

  private long id;
  private String name;
  private String author;
  private String price;
  private long status;

  public Book(long id, String name, String author, String price, long status) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.price = price;
    this.status = status;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", price='" + price + '\'' +
            ", status=" + status +
            '}';
  }
}

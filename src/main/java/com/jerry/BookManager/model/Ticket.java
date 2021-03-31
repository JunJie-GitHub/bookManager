package com.jerry.BookManager.model;


import java.sql.Timestamp;

public class Ticket {

  private long id;
  private long userId;
  private String ticket;
  private java.sql.Timestamp expiredAt;

  public Ticket(long id, long userId, String ticket, Timestamp expiredAt) {
    this.id = id;
    this.userId = userId;
    this.ticket = ticket;
    this.expiredAt = expiredAt;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }


  public java.sql.Timestamp getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(java.sql.Timestamp expiredAt) {
    this.expiredAt = expiredAt;
  }

  @Override
  public String toString() {
    return "Ticket{" +
            "id=" + id +
            ", userId=" + userId +
            ", ticket='" + ticket + '\'' +
            ", expiredAt=" + expiredAt +
            '}';
  }
}

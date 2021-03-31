package com.jerry.BookManager;

import com.jerry.BookManager.dao.TicketDao;
import com.jerry.BookManager.model.Book;
import com.jerry.BookManager.model.Ticket;
import com.jerry.BookManager.model.User;
import com.jerry.BookManager.service.BookService;
import com.jerry.BookManager.service.UserService;
import com.jerry.BookManager.utils.Util;
import org.apache.tomcat.jni.Time;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.TimeZone;

@SpringBootTest
class BookManagerApplicationTests {

	@Autowired
	BookService bookService;

	@Autowired
	UserService userService;

	@Autowired
	TicketDao ticketDao;
	@Test
	void contextLoads() {
//		bookService.insertBook(new Book(3, "Sun", "Tom", "34.50", 0));
//		bookService.updateBook(new Book(3, "Sun", "Tom", "54.50", 1));
//		bookService.deleteBook(3);
//		System.out.println(bookService.selectBookById(1));
//		userService.insertUser(new User(0, "jerry", "432423@qq.com", "fdsaf32432"));

//		System.out.println(userService.selectBookById(1));
//		userService.updateBook(new User(2, "tomm", "1234432423@qq.com", "432432432"));
//		userService.deleteUserById(1);

//		ticketDao.insertTicket(new Ticket(1, 3, "ticket4", new Timestamp(1424234324)));

//		System.out.println(ticketDao.selectAllTicket());
//		ticketDao.updateBook(new Ticket(1, 5, "ticket04", new Timestamp(1424234324)));
		ticketDao.deleteTicketById(3);
	}

}

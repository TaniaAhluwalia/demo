package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Library {

    public static void main(String[] args) {

        Librarian librarian=new Librarian("Martin", "martin@gmail.com", "9895678467");

        Member m1=new Member("Anges", "angesjulie@rediffmail.com", "9948847777");
        Member m2=new Member("Julie", "julieroberts@gmail.com", "9897585867");
        Member m3=new Member("Pratham", "Pratham@gmail.com", "98975867");


        List<Member> members=Arrays.asList(m1,m2,m3);

        Books book1=new Books(298347, "The borgia Bride",5);
        Books book2=new Books(686877, "The Tower",3);
        Books book3=new Books(88789, "Enola holmes",4);

        List<Books> books=Arrays.asList(book1,book2,book3);
        BookItem item1=m1.checkoutBook(book1);
        m1.checkinBook(item1);
//
//BookItem item3=m2.checkoutBook(book3);
//
//BookItem item2=m1.checkoutBook(book2);
//
//m1.checkinBook(item2);
//m2.checkinBook(item3);

//		m1.checkoutBook(book1);
//		
//		librarian.blockMember(m1);
//		m1.checkoutBook(book1);
//		librarian.unblockMember(m1);
//		m1.checkoutBook(book1);
//		
//		
        librarian.printListOfMembers(members);
        librarian.printListOfBooks(books);
//		

    }

}
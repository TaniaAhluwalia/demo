package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BookInfoMethod {
    public static int totalBooks = 0;
    public static List<BookInfoNews> list = new ArrayList<BookInfoNews>();

    //default constructor
    public BookInfoMethod() {
    }

    public void addBook() {


        int isbn ;
        String bookName ;
        String authorName ;

        //add books data to ArrayList
        BookInfoNews newBook = new BookInfoNews(298347, "The borgia Bride", "Jeanne Kalogridis");
//        list.add(newBook);
//        totalBooks++;
        BookInfoNews newBook1 = new BookInfoNews(686877, "The Tower", "Michael Duffy");
//        list.add(newBook1);
//        totalBooks++;
        BookInfoNews newBook2 = new BookInfoNews(88789, "Enola holmes", "Sherlock Holmes");
//        list.add(newBook2);
//        totalBooks++;
        List<BookInfoNews> list=Arrays.asList(newBook,newBook1,newBook2);
        totalBooks++;
        totalBooks++;
        totalBooks++;


//
        System.out.println( "Book Name:  " +newBook.getBookName()+ "  added successful"+"\n");// + "Total Books: " +totalBooks);
        System.out.println( "Book Name:  " +newBook1.getBookName()+ "  added successful"+"\n" );
        //+ "Total Books: " +totalBooks);
        System.out.println( "Book Name:  " +newBook2.getBookName()+ "  added successful"+"\n" + "Total Books: " +totalBooks);
    }

    public void deleteBook() {
        String del="del";

        for (int i = 0; i < this.list.size() ; i++){
            if(del.equals(this.list.get(i).getBookName())){
                this.list.remove(i);
            }
        }
        totalBooks--;
        System.out.println("Total Books: " +totalBooks);
    }

    public BookInfoNews searchMethod(String bookName){
        if(bookName == null){
            return null;
        }
        for(BookInfoNews tmp : this.list){
            if(bookName.equals(tmp.getBookName()))
                return tmp;
        }
        return null;
    }
}

class BookInfoNews{
    private int isbn;
    private String bookName;
    private String authorName;

    public BookInfoNews(int isbn, String bookName, String authorName) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}

class BookInfoNewMain {
    public static void main(String[] args) {
        BookInfoMethod obj = new BookInfoMethod();
        obj.addBook();
        obj.deleteBook();

    }
}



package day41_Inheritance;

import day41_Inheritance.BookSubPackage.Book;

public class Ebook extends Book {


    /*
    title (inherited)
    author (inherited)
    price (inherited)
    size (declared)
    pages (declared)
    readbook() (declared)
    toString()(inherited)
     */

    public String size;
    public int pages;

    public void readbook(){
        System.out.println("reading "+title);
    }



}

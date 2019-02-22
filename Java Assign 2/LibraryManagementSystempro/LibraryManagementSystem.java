package LibraryManagementSystempro;

import java.util.ArrayList;
public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        Library myLibrary = new Library();
        myLibrary.setLibraryLocation("C-DAC");
        myLibrary.setOpeningTimeOfLibrary("10 AM");
        myLibrary.setClosingTimeOfLibrary("6 PM");
        Book b1 = new Book("Programming with Java", "E balaguruswamy", 400.0d);
        Book b3 = new Book("Pointers in C", "Kenneth a reek", 500.0d);
        Book b2 = new Book("Let us C", "Yashwant Kanetkar", 400.0d);
        Book b4 = new Book("Analysis and Design of algorithm", "Korth", 800.0d);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        myLibrary.setBooksInLibrary(bookList);

        Librarian librarian = new Librarian("Amarjeet Malik", 3001);
        myLibrary.setLibrarian(librarian);

        Member m1 = new Member("Dolly", 3001);
        Member m2 = new Member("Aditya", 3002);
        Member m3 = new Member("Rahul Singh", 3003);

        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        myLibrary.setMembersOfLibrary(memberList);
        myLibrary.getLibraryDetails();
    }
}

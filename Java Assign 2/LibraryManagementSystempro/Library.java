package LibraryManagementSystempro;

import java.util.ArrayList;

class Library
{
    private String libraryLocation;
    private ArrayList<Book> booksInLibrary;
    private ArrayList<Member> membersOfLibrary;
    private Librarian librarian;
    private String openingTimeOfLibrary;
    private String closingTimeOfLibrary;

    public String getOpeningTimeOfLibrary() {
        return openingTimeOfLibrary;
    }

    public void setOpeningTimeOfLibrary(String openingTimeOfLibrary) {
        this.openingTimeOfLibrary = openingTimeOfLibrary;
    }

    public String getClosingTimeOfLibrary() {
        return closingTimeOfLibrary;
    }

    public void setClosingTimeOfLibrary(String closingTimeOfLibrary) {
        this.closingTimeOfLibrary = closingTimeOfLibrary;
    }

    public String getLibraryLocation()
    {
        return libraryLocation;
    }

    public void setLibraryLocation(String libraryLocation)
    {
        this.libraryLocation = libraryLocation;
    }

    public ArrayList<Book> getBooksInLibrary()
    {
        return booksInLibrary;
    }

    public void setBooksInLibrary(ArrayList<Book> booksInLibrary)
    {
        this.booksInLibrary = booksInLibrary;
    }

    public ArrayList<Member> getMembersOfLibrary()
    {
        return membersOfLibrary;
    }

    public void setMembersOfLibrary(ArrayList<Member> membersOfLibrary)
    {
        this.membersOfLibrary = membersOfLibrary;
    }

    public Librarian getLibrarian()
    {
        return librarian;
    }

    public void setLibrarian(Librarian librarian)
    {
        this.librarian = librarian;
    }

    void getLibraryDetails()
    {
        System.out.println("___LIBRARY DETAILS___");
        System.out.println("Location of Library " + libraryLocation);
        System.out.println("Opening Time of Library " + openingTimeOfLibrary);
        System.out.println("Closing Time of Library " + closingTimeOfLibrary);
        System.out.println("Librarian Details");
        librarian.getUser();

        System.out.println("Members Details");
        for (Member m : membersOfLibrary)
            m.getUser();

        System.out.println("Books Details");
        for (Book b : booksInLibrary)
            b.getBookDetails();
    }
}

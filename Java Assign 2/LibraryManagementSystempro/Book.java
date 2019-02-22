package LibraryManagementSystempro;

class Book
{
    private String bookName;
    private String bookAuthor;
    private double bookPrice;

    Book(String name, String author, double price)
    {
        bookName = name;
        bookAuthor = author;
        bookPrice = price;
    }

    void getBookDetails()
    {
        System.out.println("Name of the book " + bookName);
        System.out.println("Author of the book " + bookAuthor);
        System.out.println("Price of the book " + bookPrice);
    }
}

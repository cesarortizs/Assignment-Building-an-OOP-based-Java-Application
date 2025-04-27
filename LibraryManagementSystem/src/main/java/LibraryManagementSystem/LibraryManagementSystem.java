package LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Adding books and eBooks to the library.
        Book book1 = new Book("The Shining", "Stephen King", 123123123);
        Book book2 = new Book("Martian Chronicles", "Ray Bradbury", 456456456);
        Book eBook1 = new EBook("Fear And Loathing In Las Vegas", "Hunter S. Thompson", 161616161, "pdf", 2.5);
        Book eBook2 = new EBook("A Clockwork Orange", "Anthony Burgess", 1717171717, "pdf", 3.7);

        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(eBook1);
        Library.addBook(eBook2);

        // Registering regular and premium members.
        Member member1 = new Member("Caesar", 555444555);
        Member member2 = new Member("Linda", 666777666);
        Member member3 = new PremiumMember("Allison", 99988899);

        Library.registerMember(member1);
        Library.registerMember(member2);
        Library.registerMember(member3);

        // Borrowing books for members and displaying the updated list of available books.
        Library.borrowingBook(member1, book2);
        Library.borrowingBook(member3, eBook2);

        System.out.println("\nThe available books are:");
        Library.showAvailableBooks();

        // Displaying member details along with borrowed books.
        System.out.println("\nOur members details are:");
        Library.showMembersDetails();
    }
}

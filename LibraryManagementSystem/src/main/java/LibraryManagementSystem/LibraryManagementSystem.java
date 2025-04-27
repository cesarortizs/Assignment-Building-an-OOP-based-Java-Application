package LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library library = new Library();

        // Adding books and eBooks to the library.
        Book book1 = new Book("The Shining", "Stephen King", 123123123);
        Book book2 = new Book("Martian Chronicles", "Ray Bradbury", 456456456);
        Book eBook1 = new EBook("Fear And Loathing In Las Vegas", "Hunter S. Thompson", 161616161, "pdf", 2.5);
        Book eBook2 = new EBook("A Clockwork Orange", "Anthony Burgess", 1717171717, "pdf", 3.7);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(eBook1);
        library.addBook(eBook2);

        // Registering regular and premium members.
        Member member1 = new Member("Caesar", 555444555);
        Member member2 = new Member("Linda", 666777666);
        Member member3 = new PremiumMember("Allison", 99988899);

        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(member3);

        // Borrowing books for members and displaying the updated list of available books.
        library.borrowingBook(member1, book2);
        library.borrowingBook(member3, eBook2);

        System.out.println("\nThe available books are:");
        library.showAvailableBooks();

        // Displaying member details along with borrowed books.
        System.out.println("\nOur members details are:");
        library.showMembersDetails();
    }
}

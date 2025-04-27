package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static List<Book> books = new ArrayList<Book>();
    public static List<Member> members = new ArrayList<Member>();

    public static void addBook(Book newBook)
    {
        if (!books.contains(newBook))
        {
            books.add(newBook);
        }
    }

    public static void registerMember(Member newMember)
    {
        if (!members.contains(newMember))
        {
            members.add(newMember);
        }
    }

    public static void borrowingBook(Member registeredMember, Book selectedBook)
    {
        boolean memberCanBorrow = (registeredMember.getBorrowedBooks().size() < registeredMember.getMaxBorrowedBooks());

        if (members.contains(registeredMember) && books.contains(selectedBook) && memberCanBorrow && selectedBook.isAvailability())
        {
            registeredMember.getBorrowedBooks().add(selectedBook);
            selectedBook.setAvailability(false);
        }
    }

    public static void returningBook(Member registeredMember, Book selectedBook)
    {
        if (members.contains(registeredMember) && books.contains(selectedBook))
        {
            registeredMember.getBorrowedBooks().remove(selectedBook);
            selectedBook.setAvailability(true);
        }
    }

    public static void showAvailableBooks()
    {
        for(Book b: books)
        {
            if (b.isAvailability())
            {
                System.out.println(b.toString());
            }
        }
    }

    public static void showMembersDetails()
    {
        for(Member m: members)
        {
            System.out.println(m.toString());
        }
    }
}

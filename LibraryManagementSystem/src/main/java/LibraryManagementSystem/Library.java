package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();
    private List<Member> members = new ArrayList<Member>();

    public void addBook(Book newBook)
    {
        if (!books.contains(newBook))
        {
            books.add(newBook);
        }
    }

    public void registerMember(Member newMember)
    {
        if (!members.contains(newMember))
        {
            members.add(newMember);
        }
    }

    public void borrowingBook(Member registeredMember, Book selectedBook)
    {
        boolean memberCanBorrow = (registeredMember.getBorrowedBooks().size() < registeredMember.getMaxBorrowedBooks());

        if (members.contains(registeredMember) && books.contains(selectedBook) && memberCanBorrow && selectedBook.isAvailability())
        {
            registeredMember.getBorrowedBooks().add(selectedBook);
            selectedBook.setAvailability(false);
        }
    }

    public void returningBook(Member registeredMember, Book selectedBook)
    {
        if (members.contains(registeredMember) && books.contains(selectedBook))
        {
            registeredMember.getBorrowedBooks().remove(selectedBook);
            selectedBook.setAvailability(true);
        }
    }

    public void showAvailableBooks()
    {
        for(Book b: books)
        {
            if (b.isAvailability())
            {
                System.out.println(b.toString());
            }
        }
    }

    public void showMembersDetails()
    {
        for(Member m: members)
        {
            System.out.println(m.toString());
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}

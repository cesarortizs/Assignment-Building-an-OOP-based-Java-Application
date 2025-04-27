package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int memberId;
    private final String type = "Regular";
    private List<Book> borrowedBooks;
    private final int maxBorrowedBooks = 5;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getType() {
        return type;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getMaxBorrowedBooks() {
        return maxBorrowedBooks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberId=" + memberId +
                ", type='" + type + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                ", maxBorrowedBooks=" + maxBorrowedBooks +
                '}';
    }
}

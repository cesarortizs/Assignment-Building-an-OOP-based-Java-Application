package LibraryManagementSystem;

import java.util.List;

public class PremiumMember extends Member{
    private final String type = "Premium";
    private final int maxBorrowedBooks = 10;

    public PremiumMember(String name, int memberId) {
        super(name, memberId);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getMemberId() {
        return super.getMemberId();
    }

    @Override
    public void setMemberId(int memberId) {
        super.setMemberId(memberId);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public List<Book> getBorrowedBooks() {
        return super.getBorrowedBooks();
    }

    @Override
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        super.setBorrowedBooks(borrowedBooks);
    }

    @Override
    public int getMaxBorrowedBooks() {
        return super.getMaxBorrowedBooks();
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + getName() + '\'' +
                ", memberId=" + getMemberId() +
                ", type='" + type + '\'' +
                ", borrowedBooks=" + getBorrowedBooks() +
                ", maxBorrowedBooks=" + maxBorrowedBooks +
                '}';
    }
}

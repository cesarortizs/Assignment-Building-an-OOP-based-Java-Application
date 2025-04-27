package LibraryManagementSystem;

public class EBook extends Book{
    private String fileFormat;
    private double fileSize;

    public EBook(String title, String author, int ISBN, String fileFormat, double fileSize) {
        super(title, author, ISBN);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public int getISBN() {
        return super.getISBN();
    }

    @Override
    public void setISBN(int ISBN) {
        super.setISBN(ISBN);
    }

    @Override
    public boolean isAvailability() {
        return super.isAvailability();
    }

    @Override
    public void setAvailability(boolean availability) {
        super.setAvailability(availability);
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", ISBN=" + getISBN() +
                ", availability=" + isAvailability() +
                ", fileFormat='" + fileFormat + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void loadBooks(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // TODO 1: parse each line from the books.txt file to extract the book details (title, author, and publication year).
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String title = parts[0].trim();
                    String author = parts[1].trim();
                    int publicationYear = Integer.parseInt(parts[2].trim());

                    // TODO 2: create a Book object using the extracted details.
                    Book book = new Book(title, author, publicationYear);

                    // TODO 3: add the Book object to the books list.
                    books.add(book);
                } else {
                    System.err.println("Skipping invalid line: " + line);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBookByKeyword(String keyword) {
        keyword = keyword.toLowerCase(); 

    for (Book book : books) { 
        String title = book.getTitle().toLowerCase();
        String author = book.getAuthor().toLowerCase();
        String year = String.valueOf(book.getPublicationYear());

        // ✅ TODO 11: Check for match
        if (title.contains(keyword) || author.contains(keyword) || year.equals(keyword)) {
            return book;
        }
    }

    return null; // No match found
    }


    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}

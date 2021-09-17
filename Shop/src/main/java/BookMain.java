import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class BookMain {

    public static void main(String[] args) {
        Library lib = new Library();
        List<Book> library = new ArrayList<>();
        List<Book> study = new ArrayList<>();
        Book book1 = new Book(123, "Learn Java", 2012, study);
        Book book2 = new Book(234, "Learn English", 2014, study);
        Book book3 = new Book(345, "Learn HTML", 2015, study);
        Book book4 = new Book(321, "War and Peace", 1876, study);
        Book book5 = new Book(3212, "War and War", 1841, library);
        study.add(book5);
        lib.setName("library");
        lib.getSerial().add(book1);
        lib.getSerial().add(book2);
        lib.getSerial().add(book3);
        lib.getSerial().add(book4);
        lib.getSerial().add(book5);

        try {
            File file = new File("Shop/src/main/java/books.xml");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
            marshaller.marshal(lib, bw);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
        try {
            File jsonFile = new File("Shop/src/main/java/books.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(jsonFile, lib);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
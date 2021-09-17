import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Library")
@XmlType(propOrder = {"name", "serial"})
public class Library {
    @JsonProperty("name")
    private String name;
    @JsonProperty("serialBooks")
    private List<Book> serial = new ArrayList<>();

    public Library() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getSerial() {
        return serial;
    }

    public void setSerial(List<Book> serial) {
        this.serial = serial;
    }
}

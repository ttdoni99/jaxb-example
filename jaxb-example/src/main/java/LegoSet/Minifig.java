package LegoSet;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Minifig {
    @XmlAttribute
    private int count;
    @XmlValue
    private String name;
    public Minifig(){};
    public Minifig(int count, String name) {
        this.count = count;
        this.name = name;
    }

}

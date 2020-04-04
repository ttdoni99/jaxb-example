package LegoSet;

import album.Album;
import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException, MalformedURLException {
        LegoSet legoSet=new LegoSet();
        legoSet.setNumber(75211);
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);

        ArrayList<Minifig> minifigs=new ArrayList<>();
        minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new Minifig(1,"Imperial Pilot"));
        minifigs.add(new Minifig(1,"Mimban Stormtrooper"));
        legoSet.setMinifigs(minifigs);
        legoSet.setTags(Set.of("Starfighter","Stormtrooper","Star Wars","Solo"));
        legoSet.setWeight(new Weight(0.89,"kg"));

        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        JAXBHelper.toXML(legoSet, System.out);

        JAXBHelper.toXML(legoSet, new FileOutputStream("lego.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("lego.xml")));
    }
}

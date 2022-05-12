package com.solvd.university.jaxb;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Executor {

    public static void main(String[] args) throws JAXBException {

        ShipSpecification specification = new ShipSpecification("Orbital Battle Station",1.5,"Imperial Hyperdrive",160L);
        Weapon weapon1 = new Weapon("Turbolasers",100,"high voltage electric power");
        Weapon weapon2 = new Weapon("superlaser",1,"red giant star");
        Weapon weapon3 = new Weapon("Tractor beams",2000,"liquid metall");
        Weapon weapon4 = new Weapon("Ion cannons",600,"nuclear power");
        List<Weapon> weapons = List.of(weapon1,weapon2,weapon3,weapon4);
        DeathStar deathStar = new DeathStar();
        deathStar.setId(001L);
        deathStar.setManufactureDate(new Date(25/05/1977));
        deathStar.setHeadOfDesign("Galen Erso");
        deathStar.setSpecification(specification);
        deathStar.setWeapons(weapons);

//        JAXBContext jc = JAXBContext.newInstance(DeathStar.class);
//        Marshaller mar = jc.createMarshaller();
//        mar.marshal(deathStar, new File("result.xml"));

//        JAXBContext jk = JAXBContext.newInstance(DeathStar.class);
//        Unmarshaller unMar = jk.createUnmarshaller();
//        File file = new File("result2.xml");
//        DeathStar deathStarV2 = (DeathStar) unMar.unmarshal(file);
//        System.out.println(deathStarV2.getHeadOfDesign());
        }


    }


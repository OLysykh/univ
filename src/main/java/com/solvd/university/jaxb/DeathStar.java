package com.solvd.university.jaxb;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DeathStar")
public class DeathStar {

    @XmlAttribute(name = "id")
    private Long id;

    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date manufactureDate;

    @XmlElement(name = "headOfDesign")
    private String headOfDesign;

    @XmlElement(name = "specification")
    private ShipSpecification specification;

    @XmlElementWrapper(name = "weapons")
    @XmlElement(name = "weapon", type = Weapon.class)
    private List<Weapon> weapons;

    @XmlTransient
    private String WeakPlace;

    public DeathStar() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getHeadOfDesign() {
        return headOfDesign;
    }

    public void setHeadOfDesign(String headOfDesign) {
        this.headOfDesign = headOfDesign;
    }

    public ShipSpecification getSpecification() {
        return specification;
    }

    public void setSpecification(ShipSpecification specification) {
        this.specification = specification;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public String getWeakPlace() {
        return WeakPlace;
    }

    public void setWeakPlace(String weakPlace) {
        WeakPlace = weakPlace;
    }
}

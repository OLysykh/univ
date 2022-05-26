package com.solvd.university.utilities.stax.jaxb;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Weapon")
public class Weapon {

    @XmlAttribute(name = "type")
    private String type;

    @XmlAttribute(name = "quantity")
    private Integer quantity;

    @XmlAttribute(name = "typeOfAmmo")
    private String typeOfAmmo;

    public Weapon() {
    }

    public Weapon(String type, Integer quantity, String typeOfAmmo) {
        this.type = type;
        this.quantity = quantity;
        this.typeOfAmmo = typeOfAmmo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTypeOfAmmo() {
        return typeOfAmmo;
    }

    public void setTypeOfAmmo(String typeOfAmmo) {
        this.typeOfAmmo = typeOfAmmo;
    }
}

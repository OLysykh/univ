package com.solvd.university.utilities.stax.jaxb;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "specification")
public class ShipSpecification {

    @XmlElement(name = "ShipClass")
    private String ShipClass;

    @XmlElement(name = "MaxSpeedinLightSpeed")
    private Double MaxSpeedinLightSpeed;

    @XmlElement(name = "propulsion")
    private String propulsion;

    @XmlElement(name = "widthInKm")
    private Long widthInKm;

    public ShipSpecification() {
    }

    public ShipSpecification(String shipClass, Double maxSpeedinLightSpeed, String propulsion, Long widthInKm) {
        ShipClass = shipClass;
        MaxSpeedinLightSpeed = maxSpeedinLightSpeed;
        this.propulsion = propulsion;
        this.widthInKm = widthInKm;
    }

    public String getShipClass() {
        return ShipClass;
    }

    public void setShipClass(String shipClass) {
        ShipClass = shipClass;
    }

    public Double getMaxSpeedinLightSpeed() {
        return MaxSpeedinLightSpeed;
    }

    public void setMaxSpeedinLightSpeed(Double maxSpeedinLightSpeed) {
        MaxSpeedinLightSpeed = maxSpeedinLightSpeed;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public Long getWidthInKm() {
        return widthInKm;
    }

    public void setWidthInKm(Long widthInKm) {
        this.widthInKm = widthInKm;
    }
}

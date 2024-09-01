package thiagorabaioli.laf.entities;

import jakarta.persistence.*;
import thiagorabaioli.laf.entities.enums.TypeOfLost;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="tb_item_perdido")
public class itemLost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String locationFound;
    private String description;
    private String whoFind;
    private Date dateFound;
    private Integer typeOfLost;

    public itemLost() {}

    public itemLost(Long id, TypeOfLost typeOfLost, Date dateFound, String whoFind, String description, String locationFound) {
        this.id = id;
        this.typeOfLost = typeOfLost.getCod();
        this.dateFound = dateFound;
        this.whoFind = whoFind;
        this.description = description;
        this.locationFound = locationFound;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationFound() {
        return locationFound;
    }

    public void setLocationFound(String locationFound) {
        this.locationFound = locationFound;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWhoFind() {
        return whoFind;
    }

    public void setWhoFind(String whoFind) {
        this.whoFind = whoFind;
    }

    public Date getDateFound() {
        return dateFound;
    }

    public void setDateFound(Date dateFound) {
        this.dateFound = dateFound;
    }

    public Integer getTypeOfLost() {
        return typeOfLost;
    }

    public void setTypeOfLost(Integer typeOfLost) {
        this.typeOfLost = typeOfLost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        itemLost itemLost = (itemLost) o;
        return Objects.equals(id, itemLost.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

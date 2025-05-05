package space.jojoh.fc.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Fleet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String fleetBoss;
    private String doctrine;
    private String description;
    private String tags;

    private LocalDateTime starTime;
    private LocalDateTime closTime;

    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFleetBoss() {
        return fleetBoss;
    }
    public void setFleetBoss(String fleetBoss) {
        this.fleetBoss = fleetBoss;
    }
    public String getDoctrine() {
        return doctrine;
    }
    public void setDoctrine(String doctrine) {
        this.doctrine = doctrine;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public LocalDateTime getStarTime() {
        return starTime;
    }
    public void setStarTime(LocalDateTime starTime) {
        this.starTime = starTime;
    }
    public LocalDateTime getClosTime() {
        return closTime;
    }
    public void setClosTime(LocalDateTime closTime) {
        this.closTime = closTime;
    }
}

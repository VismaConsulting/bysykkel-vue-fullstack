package fag.visma.bysykkel.vue.fullstack.backend.domene;

import java.util.List;

public class Station {
    long id;
    String title;
    String subtitle;
    String number_of_locks;
    List<Bounds> bounds;
    List<Availability> availability;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getNumber_of_locks() {
        return number_of_locks;
    }

    public void setNumber_of_locks(String number_of_locks) {
        this.number_of_locks = number_of_locks;
    }

    public List<Bounds> getBounds() {
        return bounds;
    }

    public void setBounds(List<Bounds> bounds) {
        this.bounds = bounds;
    }

    public List<Availability> getAvailability() {
        return availability;
    }

    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }
}

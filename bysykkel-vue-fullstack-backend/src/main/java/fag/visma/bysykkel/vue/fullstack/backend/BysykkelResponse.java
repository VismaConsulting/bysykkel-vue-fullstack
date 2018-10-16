package fag.visma.bysykkel.vue.fullstack.backend;

import fag.visma.bysykkel.vue.fullstack.backend.domene.Station;

import java.util.List;

public class BysykkelResponse {
    List<Station> stations;

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}

package fag.visma.fullstack.skeleton.backend.bysykkel.domene;

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

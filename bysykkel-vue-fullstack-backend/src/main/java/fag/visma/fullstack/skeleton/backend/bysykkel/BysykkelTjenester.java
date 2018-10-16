package fag.visma.fullstack.skeleton.backend.bysykkel;

import fag.visma.fullstack.skeleton.backend.bysykkel.domene.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BysykkelTjenester {

    @Autowired
    BysykkelDataHenter bysykkelDataHenter;

    public List<Station> hentAlleStasjoner(){
        return bysykkelDataHenter.hentAlleStasjoner();
    }

    public List<Station> hentAlleStasjonerMedTilgjengelighet(){
        return bysykkelDataHenter.hentAlleStasjonerMedAvailability();
    }

    public Station hentStasjonForId(long id){
        return hentAlleStasjoner().stream()
                .filter(stasjon -> stasjon.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Id ikke funnet: " + id));
    }

    public Station hentStasjonForNavn(String navn){
        return hentAlleStasjoner().stream()
                .filter(stasjon -> stasjon.getTitle().equals(navn))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Stasjon ved navn ikke funnet: " + navn));
    }
}


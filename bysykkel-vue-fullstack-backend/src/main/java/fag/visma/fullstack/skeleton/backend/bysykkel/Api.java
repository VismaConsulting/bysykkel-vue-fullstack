package fag.visma.fullstack.skeleton.backend.bysykkel;

import fag.visma.fullstack.skeleton.backend.bysykkel.domene.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "api/stasjoner", produces = "application/json")
public class Api {

    @Autowired
    BysykkelTjenester tjenester;

    @GetMapping
    public List<Station> hentStasjoner(){
        return tjenester.hentAlleStasjoner();
    }

    @GetMapping("/availability")
    public List<Station> hentStasjonerMedTilgjengelighet(){
        return tjenester.hentAlleStasjonerMedTilgjengelighet();
    }

    @GetMapping("/{name}")
    public Station hentStasjonForNavn(@PathParam("navn") String navn){
        return tjenester.hentStasjonForNavn(navn);
    }

    @GetMapping("/{id}")
    public Station hentStasjonForId(@PathParam("id") long id){
        return tjenester.hentStasjonForId(id);
    }
}

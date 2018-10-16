package fag.visma.bysykkel.vue.fullstack.backend;

import fag.visma.bysykkel.vue.fullstack.backend.BysykkelTjenester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fag.visma.bysykkel.vue.fullstack.backend.domene.Station;

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

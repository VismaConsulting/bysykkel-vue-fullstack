package fag.visma.fullstack.skeleton.backend.bysykkel;

import fag.visma.fullstack.skeleton.backend.bysykkel.domene.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testContr {

    @Autowired
    BysykkelDataHenter henter;

    @GetMapping("/test")
    public void test(){
        List<Station> s = henter.hentAlleStasjoner();
        String bla;
    }

}

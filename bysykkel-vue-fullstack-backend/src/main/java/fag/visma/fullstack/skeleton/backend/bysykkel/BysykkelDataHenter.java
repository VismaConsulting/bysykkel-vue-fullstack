package fag.visma.fullstack.skeleton.backend.bysykkel;

import fag.visma.fullstack.skeleton.backend.bysykkel.domene.BysykkelResponse;
import fag.visma.fullstack.skeleton.backend.bysykkel.domene.Station;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BysykkelDataHenter {

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${bysykkel.token}")
    String bysykkelToken;

    public List<Station> hentAlleStasjoner(){
        return hentStasjoner("https://oslobysykkel.no/api/v1/stations");
    }

    public List<Station> hentAlleStasjonerMedAvailability(){
        return hentStasjoner("https://oslobysykkel.no/api/v1/stations/availability");
    }

    private List<Station> hentStasjoner(String url){
        ResponseEntity<BysykkelResponse> svar = restTemplate.exchange(url, HttpMethod.GET, opprettEntity(), BysykkelResponse.class);
        BysykkelResponse bysykkelSvar = svar.getBody();
        return bysykkelSvar.getStations();
    }

    private HttpEntity opprettEntity(){
        HttpHeaders header = new HttpHeaders();
        header.add("Client-Identifier", bysykkelToken);
        return new HttpEntity("fetching", header);
    }
}

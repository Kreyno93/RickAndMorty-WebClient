package de.neuefische.ff221webclient;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickAndMortyService {

    private WebClient client = WebClient.create("https://rickandmortyapi.com/api");
    public List<RickAndMortyCharacterModel> getAllCharacters() {
      RickAndMortyResponseElement rickAndMortyResponseElement =
              client.get().uri("/character")
                .retrieve()
                .toEntity(RickAndMortyResponseElement.class)
                .block()
                .getBody();
                return rickAndMortyResponseElement.getResults();


    }
}

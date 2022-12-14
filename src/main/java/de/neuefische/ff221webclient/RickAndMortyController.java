package de.neuefische.ff221webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RickAndMortyController {

    private final RickAndMortyService rickAndMortyService;


    @GetMapping
    public List<RickAndMortyCharacterModel> getAllCharacters(){
        return rickAndMortyService.getAllCharacters();
    }

}

package de.neuefische.ff221webclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RickAndMortyCharacterModel {

    private int id;
    private String name;
    private String status;
    private List<String> episode;

}

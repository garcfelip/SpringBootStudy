package br.com.viptech.springboot.service;

import br.com.viptech.springboot.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    // private final AnimeRepository animeRepository;
    public List<Anime> listAll(){
        return List.of(new Anime(1L, "Dragon"), new Anime(2L, "Berserk"));
    }
}

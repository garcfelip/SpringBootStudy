package br.com.viptech.springboot.repository;

import br.com.viptech.springboot.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}

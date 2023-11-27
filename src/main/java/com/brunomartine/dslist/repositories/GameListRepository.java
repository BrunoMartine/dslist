package com.brunomartine.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunomartine.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

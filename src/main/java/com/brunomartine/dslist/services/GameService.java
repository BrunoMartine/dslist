package com.brunomartine.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brunomartine.dslist.dto.GameMinDTO;
import com.brunomartine.dslist.entities.Game;
import com.brunomartine.dslist.repositories.GameRepository;

@Component
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		}
	}


package com.brunomartine.dslist.dto;

import com.brunomartine.dslist.entities.Game;
import com.brunomartine.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String ShortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		super();
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		ShortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection projection) {
		super();
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		ShortDescription = projection.getShortDescription();
	}
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return ShortDescription;
	}
	

	
}

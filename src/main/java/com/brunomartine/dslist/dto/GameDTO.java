package com.brunomartine.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.brunomartine.dslist.entities.Game;

public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String Genre;
	private String Platforms;
	private Double Score;
	private String imgUrl;
	private String ShortDescription;
	private String LongDescription;

	public GameDTO() {
	}
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getPlatforms() {
		return Platforms;
	}

	public void setPlatforms(String platforms) {
		Platforms = platforms;
	}

	public Double getScore() {
		return Score;
	}

	public void setScore(Double score) {
		Score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return ShortDescription;
	}

	public void setShortDescription(String shortDescription) {
		ShortDescription = shortDescription;
	}

	public String getLongDescription() {
		return LongDescription;
	}

	public void setLongDescription(String longDescription) {
		LongDescription = longDescription;
	}

}

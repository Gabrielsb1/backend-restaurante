package com.example.cardapio.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_food")
public class Food {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	@Column(columnDefinition = "TEXT")
	private String urlimg;
	private Integer price;
	
	public Food() {
		
	}
	
	public Food(FoodRequestDTO data) {
			this.urlimg = data.urlimg();
			this.price = data.price();
			this.title = data.title();
	}

	public Food(Long id, String title, String urlimg, Integer price) {
		this.id = id;
		this.title = title;
		this.urlimg = urlimg;
		this.price = price;
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

	public String getUrlImg() {
		return urlimg;
	}

	public void setUrlImg(String urlimg) {
		this.urlimg = urlimg;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, price, title, urlimg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(id, other.id) && Objects.equals(price, other.price) && Objects.equals(title, other.title)
				&& Objects.equals(urlimg, other.urlimg);
	}
	
	
	
	
	
	

}
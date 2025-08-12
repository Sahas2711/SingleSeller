package com.clothstore.singleseller.ProductCatlogService.Entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.clothstore.singleseller.AuthService.Entities.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JoinColumn(name="seller_id")
	private User seller;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="category")
	private String category;
	
	@Column(name="url")
	private String image_url;
	
	@Column(name="Stock")
	private int stockQuantity;
	
	@Column(nullable=false)
	private double price;
	
	@Column
	@CreationTimestamp
	private LocalDate createdAt;
	
	@Column
	@UpdateTimestamp
	private LocalDate updatedAt;
	
}

package com.clothstore.singleseller.AuthService.Entities;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

@Entity(name="order_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JoinColumn(name="product_id")
	private Product product;
	
	@JoinColumn(name="order_id")
	private Order order;
	
	@Column
	private int quantity;
	
	@Column(nullable=false)
	private double price;//purchasing price
	
	@Column
	@CreationTimestamp
	private LocalDate createdAt;
	
	@Column
	@UpdateTimestamp
	private LocalDate updatedAt;
}

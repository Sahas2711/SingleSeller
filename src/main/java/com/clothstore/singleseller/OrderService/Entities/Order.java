package com.clothstore.singleseller.OrderService.Entities;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.clothstore.singleseller.AdminService.Entities.Address;

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
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JoinColumn(name="address_id")
	private Address address;
	
	@Column(nullable=false)
	private String status;// 'pending', 'processing', 'shipped', 'delivered', 'cancelled
	
	@Column(nullable=false)
	private double totalAmout;
	
	@Column(nullable=false)
	@CreationTimestamp
	private LocalDate createdAt;
	
	@Column(nullable=false)
	@UpdateTimestamp
	private LocalDate updatedAt;
}

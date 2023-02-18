package com.bajaj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ProductEntity")
public class ProductEntity {
    @Id
    @Column(name = "productId")
    private int productId;
    @Column(name = "productModel")
    private String productModel;
    @Column(name = "productBrand")
    private String productBrand;
    @Column(name = "productPrice")
    private int productPrice;
    @Column(name = "productDescription")
    private String productDescription;
    @Column(name = "productImage")
    private String productImage;
}
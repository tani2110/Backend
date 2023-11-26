package com.ecommerce.ecommerce.model;

import javax.persistence.*;
//import com.ecommerce.ecommerce.enums.Status;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;


    @Column(name = "total_price", nullable = false)
    private int totalPrice;


    @Column(name = "bid_date", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date bid_Date;

    @Column(name = "updateBid_date", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date updateBid_date;

    public Order() {
    }

    public Order(User user, Product product, int totalPrice, int quantity) {
        this.user = user;
        this.product = product;
        this.totalPrice = totalPrice;
       // this.status = status;
        this.bid_Date = new Date();
        this.updateBid_date = new Date();
    }


    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProducts() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }



    public Date getOrderDate() {
        return bid_Date;
    }

    public void setOrderDate(Date orderDate) {
        this.bid_Date = orderDate;
    }

    public Date getLastUpdated() {
        return updateBid_date;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.updateBid_date = lastUpdated;
    }

}

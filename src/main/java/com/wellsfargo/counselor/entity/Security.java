package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @Column(nullable = false)
    private String tickerSymbol;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date lastBuyDate;

    @Column(nullable = false)
    private double lastBuyPrice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    private Portfolio portfolio;

    protected Security() {
    }

    public Security(String tickerSymbol, String category, Date lastBuyDate, double lastBuyPrice, int quantity, Portfolio portfolio) {
        this.tickerSymbol = tickerSymbol;
        this.category = category;
        this.lastBuyDate = lastBuyDate;
        this.lastBuyPrice = lastBuyPrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getLastBuyDate() {
        return lastBuyDate;
    }

    public void setLastBuyDate(Date lastBuyDate) {
        this.lastBuyDate = lastBuyDate;
    }

    public double getLastBuyPrice() {
        return lastBuyPrice;
    }

    public void setLastBuyPrice(double lastBuyPrice) {
        this.lastBuyPrice = lastBuyPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}

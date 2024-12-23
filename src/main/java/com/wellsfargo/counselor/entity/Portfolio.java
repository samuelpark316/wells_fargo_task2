package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToOne
    private Client client;

    @Column(nullable = false)
    private double totalValue;

    @Column(nullable = false)
    private Date creationDate;

    @Column(nullable = false)
    private Date lastUpdateDate;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    protected Portfolio() {
    }

    public Portfolio(Client client, double totalValue, Date creationDate, Date lastUpdateDate) {
        this.client = client;
        this.totalValue = totalValue;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}

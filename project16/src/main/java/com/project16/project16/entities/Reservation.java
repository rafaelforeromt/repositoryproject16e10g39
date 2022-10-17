package com.project16.project16.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "message")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservartion;
    private Integer startDate;
    private Integer devolutionDate;
    private String status;
    private Partyroom partyroom;
    private Client client;
    private Integer score;

    public Integer getIdReservartion() {
        return idReservartion;
    }

    public void setIdReservartion(Integer idReservartion) {
        this.idReservartion = idReservartion;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Integer devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Partyroom getPartyroom() {
        return partyroom;
    }

    public void setPartyroom(Partyroom partyroom) {
        this.partyroom = partyroom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}

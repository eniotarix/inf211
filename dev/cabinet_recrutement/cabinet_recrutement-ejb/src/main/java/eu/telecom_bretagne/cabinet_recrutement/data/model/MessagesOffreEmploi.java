package eu.telecom_bretagne.cabinet_recrutement.data.model;
// Generated Feb 7, 2023, 9:11:42 PM by Hibernate Tools 5.4.20.Final


import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * MessagesOffreEmploi generated by hbm2java
 */
@Entity
@Table(name="messages_offre_emploi"
    ,schema="public"
)
public class MessagesOffreEmploi  implements java.io.Serializable {


     private int id;
     private Candidature candidature;
     private OffresEmploi offresEmploi;
     private Date dateEnvoi;
     private String corpsMessage;

    public MessagesOffreEmploi() {
    }

	
    public MessagesOffreEmploi(int id, Candidature candidature, OffresEmploi offresEmploi, Date dateEnvoi) {
        this.id = id;
        this.candidature = candidature;
        this.offresEmploi = offresEmploi;
        this.dateEnvoi = dateEnvoi;
    }
    public MessagesOffreEmploi(int id, Candidature candidature, OffresEmploi offresEmploi, Date dateEnvoi, String corpsMessage) {
       this.id = id;
       this.candidature = candidature;
       this.offresEmploi = offresEmploi;
       this.dateEnvoi = dateEnvoi;
       this.corpsMessage = corpsMessage;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_candidature", nullable=false)
    public Candidature getCandidature() {
        return this.candidature;
    }
    
    public void setCandidature(Candidature candidature) {
        this.candidature = candidature;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_offre_emploi", nullable=false)
    public OffresEmploi getOffresEmploi() {
        return this.offresEmploi;
    }
    
    public void setOffresEmploi(OffresEmploi offresEmploi) {
        this.offresEmploi = offresEmploi;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_envoi", nullable=false, length=13)
    public Date getDateEnvoi() {
        return this.dateEnvoi;
    }
    
    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    
    @Column(name="corps_message")
    public String getCorpsMessage() {
        return this.corpsMessage;
    }
    
    public void setCorpsMessage(String corpsMessage) {
        this.corpsMessage = corpsMessage;
    }




}



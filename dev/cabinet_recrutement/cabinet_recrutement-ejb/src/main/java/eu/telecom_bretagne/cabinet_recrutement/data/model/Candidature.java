package eu.telecom_bretagne.cabinet_recrutement.data.model;
// Generated Feb 7, 2023, 9:11:42 PM by Hibernate Tools 5.4.20.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Candidature generated by hbm2java
 */
@Entity
@Table(name="candidature"
    ,schema="public"
)
public class Candidature  implements java.io.Serializable {


     private int id;
     private NiveauxQualification niveauxQualification;
     private String nom;
     private String prenom;
     private Date dateNaissance;
     private String adressePostale;
     private String adresseMail;
     private String cv;
     private Date dateDepot;
     private Set<MessagesOffreEmploi> messagesOffreEmplois = new HashSet<MessagesOffreEmploi>(0);
     private Set<IndexSecteurCandidature> indexSecteurCandidatures = new HashSet<IndexSecteurCandidature>(0);
     private Set<MessagesCandidature> messagesCandidatures = new HashSet<MessagesCandidature>(0);

    public Candidature() {
    }

	
    public Candidature(int id, NiveauxQualification niveauxQualification, String nom, String prenom, Date dateNaissance) {
        this.id = id;
        this.niveauxQualification = niveauxQualification;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }
    public Candidature(int id, NiveauxQualification niveauxQualification, String nom, String prenom, Date dateNaissance, String adressePostale, String adresseMail, String cv, Date dateDepot, Set<MessagesOffreEmploi> messagesOffreEmplois, Set<IndexSecteurCandidature> indexSecteurCandidatures, Set<MessagesCandidature> messagesCandidatures) {
       this.id = id;
       this.niveauxQualification = niveauxQualification;
       this.nom = nom;
       this.prenom = prenom;
       this.dateNaissance = dateNaissance;
       this.adressePostale = adressePostale;
       this.adresseMail = adresseMail;
       this.cv = cv;
       this.dateDepot = dateDepot;
       this.messagesOffreEmplois = messagesOffreEmplois;
       this.indexSecteurCandidatures = indexSecteurCandidatures;
       this.messagesCandidatures = messagesCandidatures;
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
    @JoinColumn(name="id_niveau_qualification", nullable=false)
    public NiveauxQualification getNiveauxQualification() {
        return this.niveauxQualification;
    }
    
    public void setNiveauxQualification(NiveauxQualification niveauxQualification) {
        this.niveauxQualification = niveauxQualification;
    }

    
    @Column(name="nom", nullable=false, length=50)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="prenom", nullable=false, length=50)
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_naissance", nullable=false, length=13)
    public Date getDateNaissance() {
        return this.dateNaissance;
    }
    
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    
    @Column(name="adresse_postale", length=30)
    public String getAdressePostale() {
        return this.adressePostale;
    }
    
    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    
    @Column(name="adresse_mail", length=50)
    public String getAdresseMail() {
        return this.adresseMail;
    }
    
    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    
    @Column(name="cv")
    public String getCv() {
        return this.cv;
    }
    
    public void setCv(String cv) {
        this.cv = cv;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_depot", length=13)
    public Date getDateDepot() {
        return this.dateDepot;
    }
    
    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="candidature")
    public Set<MessagesOffreEmploi> getMessagesOffreEmplois() {
        return this.messagesOffreEmplois;
    }
    
    public void setMessagesOffreEmplois(Set<MessagesOffreEmploi> messagesOffreEmplois) {
        this.messagesOffreEmplois = messagesOffreEmplois;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="candidature")
    public Set<IndexSecteurCandidature> getIndexSecteurCandidatures() {
        return this.indexSecteurCandidatures;
    }
    
    public void setIndexSecteurCandidatures(Set<IndexSecteurCandidature> indexSecteurCandidatures) {
        this.indexSecteurCandidatures = indexSecteurCandidatures;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="candidature")
    public Set<MessagesCandidature> getMessagesCandidatures() {
        return this.messagesCandidatures;
    }
    
    public void setMessagesCandidatures(Set<MessagesCandidature> messagesCandidatures) {
        this.messagesCandidatures = messagesCandidatures;
    }




}



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
 * OffresEmploi generated by hbm2java
 */
@Entity
@Table(name="offres_emploi"
    ,schema="public"
)
public class OffresEmploi  implements java.io.Serializable {


     private int id;
     private NiveauxQualification niveauxQualification;
     private String titre;
     private String descriptifMission;
     private String profilRecherche;
     private Date dateDepot;
     private int idEntreprise;
     private Set<MessagesCandidature> messagesCandidatures = new HashSet<MessagesCandidature>(0);
     private Set<IndexSecteurOffre> indexSecteurOffres = new HashSet<IndexSecteurOffre>(0);
     private Set<MessagesOffreEmploi> messagesOffreEmplois = new HashSet<MessagesOffreEmploi>(0);

    public OffresEmploi() {
    }

	
    public OffresEmploi(int id, NiveauxQualification niveauxQualification, String titre, int idEntreprise) {
        this.id = id;
        this.niveauxQualification = niveauxQualification;
        this.titre = titre;
        this.idEntreprise = idEntreprise;
    }
    public OffresEmploi(int id, NiveauxQualification niveauxQualification, String titre, String descriptifMission, String profilRecherche, Date dateDepot, int idEntreprise, Set<MessagesCandidature> messagesCandidatures, Set<IndexSecteurOffre> indexSecteurOffres, Set<MessagesOffreEmploi> messagesOffreEmplois) {
       this.id = id;
       this.niveauxQualification = niveauxQualification;
       this.titre = titre;
       this.descriptifMission = descriptifMission;
       this.profilRecherche = profilRecherche;
       this.dateDepot = dateDepot;
       this.idEntreprise = idEntreprise;
       this.messagesCandidatures = messagesCandidatures;
       this.indexSecteurOffres = indexSecteurOffres;
       this.messagesOffreEmplois = messagesOffreEmplois;
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

    
    @Column(name="titre", nullable=false, length=50)
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    
    @Column(name="descriptif_mission")
    public String getDescriptifMission() {
        return this.descriptifMission;
    }
    
    public void setDescriptifMission(String descriptifMission) {
        this.descriptifMission = descriptifMission;
    }

    
    @Column(name="profil_recherche")
    public String getProfilRecherche() {
        return this.profilRecherche;
    }
    
    public void setProfilRecherche(String profilRecherche) {
        this.profilRecherche = profilRecherche;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_depot", length=13)
    public Date getDateDepot() {
        return this.dateDepot;
    }
    
    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    
    @Column(name="id_entreprise", nullable=false)
    public int getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public void setIdEntreprise(int idEntreprise) {
        this.idEntreprise = idEntreprise;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="offresEmploi")
    public Set<MessagesCandidature> getMessagesCandidatures() {
        return this.messagesCandidatures;
    }
    
    public void setMessagesCandidatures(Set<MessagesCandidature> messagesCandidatures) {
        this.messagesCandidatures = messagesCandidatures;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="offresEmploi")
    public Set<IndexSecteurOffre> getIndexSecteurOffres() {
        return this.indexSecteurOffres;
    }
    
    public void setIndexSecteurOffres(Set<IndexSecteurOffre> indexSecteurOffres) {
        this.indexSecteurOffres = indexSecteurOffres;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="offresEmploi")
    public Set<MessagesOffreEmploi> getMessagesOffreEmplois() {
        return this.messagesOffreEmplois;
    }
    
    public void setMessagesOffreEmplois(Set<MessagesOffreEmploi> messagesOffreEmplois) {
        this.messagesOffreEmplois = messagesOffreEmplois;
    }




}



-- Titre :             Création base cabinet recrutement version élèves.sql
-- Version :           1.0
-- Date création :     28 juin 2011
-- Date modification : 16 janvier 2021
-- Auteur :            Philippe Tanguy
-- Description :       Script de création de la base de données pour le SI "gestion de cabinet de
--                     recrutement"
--                     Note : script pour PostgreSQL
--                     Ebauche du script : ne contient pour le moment que la table "entreprise".

-- +----------------------------------------------------------------------------------------------+
-- | Suppression des tables                                                                       |
-- +----------------------------------------------------------------------------------------------+

drop table if exists entreprise;
drop table if exists entreprises;
drop table if exists candidatures;
drop table if exists candidature;
drop table if exists messages_offre_emploi;
drop table if exists messages_candidature;
drop table if exists niveaux_qualification;
drop table if exists offres_emploi;
drop table if exists index_secteur_offre;
drop table if exists index_secteur_candidature;
drop table if exists secteur_activite;

-- +----------------------------------------------------------------------------------------------+
-- | Création des tables                                                                          |
-- +----------------------------------------------------------------------------------------------+

create table entreprise
(
    id              serial primary key,
    nom             varchar(50) not null,
    descriptif      text,
    adresse_postale varchar(30) -- Pour simplifier, adresse_postale = ville.
);

create table niveaux_qualification
(
    id          serial primary key,
    intitule    varchar(255)
);

create table candidature
(
    id                      serial primary key,
    nom                     varchar(50) not null,
    prenom                  varchar(50) not null,
    date_naissance          date not null,
    adresse_postale         varchar(30), -- Pour simplifier, adresse_postale = ville.
    id_niveau_qualification integer references niveaux_qualification not null,
    adresse_mail            varchar(50),
    cv                      text,
    date_depot              date
);

create table offres_emploi(
    id                      serial primary key,
    titre                   varchar(50) not null,
    descriptif_mission      text,
    profil_recherche        text,
    date_depot              date,
    id_niveau_qualification integer references niveaux_qualification not null,
    id_entreprise           integer references entreprise not null
);

create table messages_offre_emploi
(
    id              serial primary key,
    date_envoi      date not null,
    corps_message   text,
    id_offre_emploi integer references offres_emploi not null,
    id_candidature  integer references candidature not null
);

create table messages_candidature
(
    id              serial primary key,
    date_envoi      date not null,
    corps_message   text,
    id_offre_emploi integer references offres_emploi not null,
    id_candidature  integer references candidature not null
);

create table secteur_activite(
      id                      serial primary key,
      intitule                varchar(50) not null
);

create table index_secteur_offre (
    id                      serial primary key,
    id_offre                integer references offres_emploi not null,
    id_secteur_activite     integer references secteur_activite not null
);

create table index_secteur_candidature(
    id                      serial primary key,
    id_secteur_activite     integer references secteur_activite not null,
    id_candidature          integer references candidature not null
);

-- +----------------------------------------------------------------------------------------------+
-- | Insertion de quelques données de pour les tests                                              |
-- +----------------------------------------------------------------------------------------------+

-- Insertion des secteurs d'activité

insert into entreprise values (nextval('entreprise_id_seq'),'IMT Atlantique','IMT Atlantique est une grande école pionnière en formation, en recherche et en entrepreneuriat et en tout plein de choses...','Plouzané');
insert into entreprise values (nextval('entreprise_id_seq'),'ENIB','Une école d''ingénieur juste à côté...','Plouzané');

insert into secteur_activite
values
    (nextval('secteur_activite_id_seq'),'Achats/Logistique'),
    (nextval('secteur_activite_id_seq'),'Assistanat/Secrétariat'),
    (nextval('secteur_activite_id_seq'),'Agriculture'),
    (nextval('secteur_activite_id_seq'),'Agroalimentaire'),
    (nextval('secteur_activite_id_seq'),'Assurance'),
    (nextval('secteur_activite_id_seq'),'Audit/Conseil/Expertises'),
    (nextval('secteur_activite_id_seq'),'BTP/Immobilier'),
    (nextval('secteur_activite_id_seq'),'Commercial'),
    (nextval('secteur_activite_id_seq'),'Communication/Art/Média/Mode'),
    (nextval('secteur_activite_id_seq'),'Comptabilité'),
    (nextval('secteur_activite_id_seq'),'Direction Générale/Executive'),
    (nextval('secteur_activite_id_seq'),'Distribution/Commerce'),
    (nextval('secteur_activite_id_seq'),'Electronique/Microélectronique'),
    (nextval('secteur_activite_id_seq'),'Environnement'),
    (nextval('secteur_activite_id_seq'),'Finance/Banque'),
    (nextval('secteur_activite_id_seq'),'Formation/Enseignement'),
    (nextval('secteur_activite_id_seq'),'Hôtellerie/Restauration/Tourisme'),
    (nextval('secteur_activite_id_seq'),'Industrie/Ingénierie/Production'),
    (nextval('secteur_activite_id_seq'),'Informatique'),
    (nextval('secteur_activite_id_seq'),'Juridique/Fiscal/Droit'),
    (nextval('secteur_activite_id_seq'),'Marketing'),
    (nextval('secteur_activite_id_seq'),'Public/Parapublic'),
    (nextval('secteur_activite_id_seq'),'Ressources Humaines'),
    (nextval('secteur_activite_id_seq'),'Santé/Social/Biologie/Humanitaire'),
    (nextval('secteur_activite_id_seq'),'Télécom/Réseaux');

insert into niveaux_qualification
values
    (nextval('niveaux_qualification_id_seq'),'CAP/BEP'),
    (nextval('niveaux_qualification_id_seq'),'Bac'),
    (nextval('niveaux_qualification_id_seq'),'Bac+3'),
    (nextval('niveaux_qualification_id_seq'),'Bac+5'),
    (nextval('niveaux_qualification_id_seq'),'Doctorat');

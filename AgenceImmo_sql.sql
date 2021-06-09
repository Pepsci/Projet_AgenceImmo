CREATE database AgenceImmo;
USE AgenceImmo;

CREATE TABLE client(
	idClient INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom varchar (50) not null,
    prenom varchar(50) not null,
    tel int (10) not null,
    mail varchar (150) unique not null,
    passeword varchar(32) not null,
    statut enum('vendeur', 'loueur', 'recherche') not null
)
ENGINE = InnoDB;

CREATE TABLE bien(
	idBien INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    typeDeBien enum('maison','appartement')not null,
    statut enum ('vente','location')not null,
    adresse varchar (250) not null,
    surface float not null,
    nbrPiece int not null,
    ajouteLe  DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    idClient int null,
    CONSTRAINT fk_idClient1 FOREIGN KEY (idClient) REFERENCES AgenceImmo.client (idClient)
    )
ENGINE = InnoDB;

CREATE TABLE favoris(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    idBien int null,
    idClient int null,
    CONSTRAINT fk_idBien FOREIGN KEY (idBien) REFERENCES AgenceImmo.bien(idBien),
    CONSTRAINT fk_idClient2 FOREIGN KEY (idClient) REFERENCES client(idClient)
)
ENGINE = InnoDB;


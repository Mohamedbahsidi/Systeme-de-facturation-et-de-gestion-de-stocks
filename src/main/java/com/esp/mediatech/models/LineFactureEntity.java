package com.esp.mediatech.models;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "ligne_facture")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineFactureEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3852630048084097037L;
	@EmbeddedId
	private LineFactureKey id;
    @ManyToOne
    @MapsId("produitId")
    
	private ProduitEntity produit;
    
    @ManyToOne
    @MapsId("factureId")
   
  	private FactureEntity facture;
    
    private double quantite;
}

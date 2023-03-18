package com.esp.mediatech.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LineFactureKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1089586278428270315L;
    @Column(name = "facture_id")
	private Integer factureId;
    @Column(name = "produit_id")
	private Integer produitId;
}

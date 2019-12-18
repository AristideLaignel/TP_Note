package transport;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif {
	Porte entree;
	Porte sortie;
	LocalDateTime dateValidite;
	BigDecimal prix;
	public Tarif() {
		
	}
	public Tarif(Porte p1, Porte p2, BigDecimal bg) {
		this.entree = p1;
		this.sortie = p2;
		this.prix = bg;
	}
	public Porte getEntree() {
		return entree;
	}
	public void setEntree(Porte entree) {
		this.entree = entree;
	}
	public Porte getSortie() {
		return sortie;
	}
	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}
	public LocalDateTime getDateValidite() {
		return dateValidite;
	}
	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}
	public BigDecimal getPrix() {
		return prix;
	}
	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	
	public String toString() {
		return prix.toString();
	}
}

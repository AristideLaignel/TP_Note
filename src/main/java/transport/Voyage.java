package transport;

import java.math.BigDecimal;

public class Voyage {
	Porte entree;
	Porte sortie;
	BigDecimal tarif;
	CompagnieAutoroute autoroute;
	
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
	public BigDecimal getTarif() {
		return tarif;
	}
	public void setTarif(BigDecimal tarif) {
		this.tarif = tarif;
	}
	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}
	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}
}

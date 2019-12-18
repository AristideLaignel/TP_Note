package transport;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CompagnieAutoroute {
	
	ArrayList<Route> listRoute;
	ArrayList<Tarif> listTarif;
	
	public CompagnieAutoroute() {
		listRoute = new ArrayList<Route>();
		listTarif = new ArrayList<Tarif>();
	}
	public BigDecimal obtenirTarif(Porte p1,Porte p2) {
		if(getTarifExacte(p1,p2) != null) {
			return getTarifExacte(p1,p2).getPrix();
		}
		else {
			return getTarifCalcule(p1,p2).getPrix();
		}
	}
	private Tarif getTarifCalcule(Porte p1,Porte p2) {
		Tarif t = new Tarif();
		BigDecimal prix = new BigDecimal("0");
		boolean estEntrePorte1et2  = false;
		for(Tarif ta : listTarif) {
			if(ta.getEntree().equals(p1)) {
				estEntrePorte1et2 = true;
			}
			if(estEntrePorte1et2) {
				prix = prix.add(ta.getPrix());
			}
			if(ta.getSortie().equals(p2) ){
				estEntrePorte1et2 = false;
			}
		}
		t.setPrix(prix);
		return t;
	}
	private Tarif getTarifExacte(Porte p1,Porte p2) {
		for(Tarif t : listTarif) {
			if((t.getEntree().equals(p1)) & (t.getSortie().equals(p2))){
				return t;
			}
		}
		Tarif t = null;
		return t;
	}
	public void ajouterTarif(Tarif t) {
		listTarif.add(t);
	}
	public void ajouterRoute(Route r) {
		listRoute.add(r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

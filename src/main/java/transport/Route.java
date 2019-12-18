package transport;

import java.util.ArrayList;

public class Route {
	ArrayList<Porte> listPorte = new ArrayList<Porte>();
	
	public void addPorte(Porte porteToAdd) {
		listPorte.add(porteToAdd);
	}

	@Override
	public String toString() {
		return "Route [listPorte=" + listPorte + "]";
	}
}

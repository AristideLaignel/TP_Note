package transport;

import java.util.Comparator;

public class OrdrePorteComparator implements Comparator<Porte> {
	
	public int compare(Porte p1, Porte p2) {
		return p1.getNumeroDePorte().compareTo(p2.getNumeroDePorte());
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}

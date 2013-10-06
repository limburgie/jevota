package be.jevota.domain.type;

public enum Ranking {

	NG,
	E6, E4, E2, E0,
	D6, D4, D2, D0,
	C6, C4, C2, C0,
	B6, B4, B2, B0,
	A6, A4, A2, A0;
	
	public Ranking getNext() {
		int newIndex = ordinal()+1;
		if(newIndex >= Ranking.values().length) {
			return null;
		}
		return Ranking.values()[newIndex];
	}
	
	public Ranking getPrevious() {
		int newIndex = ordinal()-1;
		if(newIndex < 0) {
			return null;
		}
		return Ranking.values()[newIndex];
	}
	
}

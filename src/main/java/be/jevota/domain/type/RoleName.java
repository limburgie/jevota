package be.jevota.domain.type;

public enum RoleName {

	ADMINISTRATOR("Administrator"),
	NEWS_MANAGER("News Editor"),
	EVENT_MANAGER("Event Manager"),
	PLAYER_MANAGER("Player Manager"),
	CLUB_MANAGER("Club Manager"),
	GAME_MANAGER("Game Manager"),
	LINEUP_MANAGER("Lineup Manager"),
	PICTURE_MANAGER("Picture Manager");
	
	private String name;
	
	private RoleName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

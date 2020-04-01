package altklausuren.ss14.aufgabe4;

import java.util.ArrayList;

public class Team extends AbstractTeam {

    public Team() {
	members = new ArrayList<>();
    }
    
    public Player[] getPlayers() {
	Player[] array = new Player[members.size()];
	int index = 0;
	
	for(Player p : members) {
	    array[index] = p;
	    index++;
	}
	return array;
    }
    
    public Player playerByName(String name) {
	for(Player p : members) {
	    if(p.getName().equals(name)) {
		return p;
	    }
	}
	return null;
    }
    
    public boolean playerInTeam(String name) {
	if(playerByName(name)!=null) {
	    return true;
	}
	return false;
    }
    
    public void addPlayerToTeam(String name) throws IllegalArgumentException {
	if(playerInTeam(name)) {
	    throw new IllegalArgumentException("Spieler bereits im Team!");
	} else {
	    Player p = new Player(name);
	    members.add(p);
	}
    }
	    
    public Player removePlayerFromTeam(String name) throws IllegalArgumentException {
	if(playerInTeam(name)) {
	    Player p = playerByName(name);
	    members.remove(p);
	    return p;
	} else {
	    throw new IllegalArgumentException("Spieler nicht im Team!");
	}
    }
    
    public void substitutePlayer(String nameOfReplacedPlayer, String nameOfNewPlayer) throws IllegalArgumentException {
	
	if(!playerInTeam(nameOfReplacedPlayer)) {
	    throw new IllegalArgumentException("Auszuwechselnder Spieler nicht im Team");
	}
	
	if(playerInTeam(nameOfNewPlayer)) {
	    throw new IllegalArgumentException("Einzuwechselnder Spieler bereits im Team");
	}

	addPlayerToTeam(nameOfNewPlayer);
	removePlayerFromTeam(nameOfReplacedPlayer);
    }
    
    public static void main(String[] args) {
	Team team = new Team();
	
	team.addPlayerToTeam("Max");
	team.addPlayerToTeam("Peter");
	team.addPlayerToTeam("Fritz");
	team.substitutePlayer("Fritz","Arne");
	
	Player[] array = team.getPlayers();
	for(int i = 0;i<array.length;i++) {
	    System.out.println(array[i].getName());
	}
    }
}

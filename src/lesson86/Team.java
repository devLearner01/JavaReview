package lesson86;

import java.util.ArrayList;
import java.util.List;

public class Team implements Comparable<Team>{

	private String name;
	private List<Player> players;
	private int ranking;
	
	
	public Team( String name ) {
		
		this.name = name;
		this.players = new ArrayList<>();
		this.setRanking( 0 );
	}
	
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName( String name ) {
		this.name = name;
	}


	public List<Player> getPlayers() {
		return players;
	}


	public void setPlayers( List<Player> players ) {
		this.players = players;
	}

	
	public int getRanking() {
		return ranking;
	}

	public void setRanking( int ranking ) {
		this.ranking = ranking;
	}





	@Override
	public int compareTo( Team team ) {
		
		if( this.ranking > team.getRanking() )
			return  -1;
		
		else if( this.ranking < team.getRanking() ) 
			return 1;
		
		else
			return 0;
		
	}


	
	
}

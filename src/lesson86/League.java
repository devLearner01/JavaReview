package lesson86;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League< T extends Team > {

	
	private List< T > teams;
	
	
	public League() {
		
		this.teams = new ArrayList< T >();
	}
	
	
	public void addTeamToLeague(T team) {
		
		if(!teams.contains( team )) {
			this.teams.add( team );
		} 	
		
	}

	
	public void printRankedTeams() {
		
		Collections.sort( teams );
		
		for( T t : teams) {
			System.out.println( "League Ranking: ");
			System.out.println( t.getRanking() + ".  " +  t.getName() );
		}
	}

	
	public List< T > getTeams() {
		return teams;
	}


	public void setTeams( List< T > teams ) {
		this.teams = teams;
	}
}

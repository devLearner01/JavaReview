import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

import lesson86.FootballTeam;
import lesson86.HandballTeam;
import lesson86.League;


/**
 * this whole exercise is from the udemy java masterclass course
 */
public class MyMain {
	
	private final static Logger log = Logger.getLogger( MyMain.class.getName() );

	
	public static void main( String[] args ) {
			
		////lesson 86 - GENERICS challenge
		
		//create teams
		HandballTeam handT1 = new HandballTeam( "HandballTeam1" );
		HandballTeam handT2 = new HandballTeam( "HandballTeam2" );
		HandballTeam handT3 = new HandballTeam( "HandballTeam3" );

		FootballTeam footT1 = new FootballTeam( "FootballTeam1" );
		
		log.info( "finished creating all teams" );
		
		
		//create league
		League<HandballTeam> handballLeague = new League<HandballTeam>();
		
		//add correct teams to league
		handballLeague.addTeamToLeague( handT1 );
		handballLeague.addTeamToLeague( handT2 );
		handballLeague.addTeamToLeague( handT3 );
		
		log.info( "finished adding correct teams to League" );
		
		//add incorrect team to league
//		handballLeague.addTeamToLeague( footT1 );
		
		log.info( "printing ranked teams..." );
		handballLeague.printRankedTeams();
		
		log.info( "finished printing ranked teams." );
		
	}
	
	
	
	public static ArrayList<String> readValues(){
		
		ArrayList<String> values = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println( "Choose\n "
				+ "1 to enter a string\n"
				+ "0 to quit" );
		
		while( !quit) {
			
			System.out.println( "Choose an option: " );
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
			case 0: 
				quit = true;
				break;
			case 1:
				System.out.println( "Enter a string: " );
				String stringInput = scanner.nextLine();
				values.add( index, stringInput );
				index++;
				break;
			
			}
		}
		return values;
	}

}

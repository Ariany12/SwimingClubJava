package application;

import java.util.ArrayList;

import com.swimingclub.ClubStaff;
import com.swimingclub.CoachingStaff;
import com.swimingclub.Swimmers;
import com.swimingclub.SwimmingGroups;
import com.swimingclub.admstaff.Caretaker;
import com.swimingclub.admstaff.Cleaner;
import com.swimingclub.admstaff.Receptionist;
import com.swimingclub.coachingstaff.AssistantCoach;
import com.swimingclub.coachingstaff.HeadCoach;
import com.swimingclub.coachingstaff.SwimTeacher;
import com.swimingclub.util.DayGenerator;
import com.swimingclub.util.GroupGenerator;
import com.swimingclub.util.NameGenerator;
import com.swimingclub.util.NumberGenerator;


public class SwimClub {

	int x = 0;
	int y = 0;
	int z = 0;
	int w = 0;

	public SwimClub(String name) {

		//At least 10 Admin staff of various types (they cannot all be the same type). There must be at
		//least 2 different types of Admin staff.

		ArrayList<ClubStaff> clubstaff = new ArrayList<ClubStaff>();

		while(x < 4){
			clubstaff.add(new Caretaker(NameGenerator.nameGenerator()));
			x++;}

		while (x < 7) {
			clubstaff.add(new Cleaner(NameGenerator.nameGenerator()));
			x++;}

		while(x< 9) {
			clubstaff.add(new Receptionist(NameGenerator.nameGenerator()));
			x++;
		}


		/*  Caretaker caretaker1 = new Caretaker(NameGenerator.nameGenerator());
		Caretaker caretaker2 = new Caretaker(NameGenerator.nameGenerator());
		Caretaker caretaker3 = new Caretaker(NameGenerator.nameGenerator());
		Caretaker caretaker4 = new Caretaker(NameGenerator.nameGenerator());

		Cleaner cleaner1 = new Cleaner(NameGenerator.nameGenerator());
		Cleaner cleaner2 = new Cleaner(NameGenerator.nameGenerator());
		Cleaner cleaner3 = new Cleaner(NameGenerator.nameGenerator());
		Cleaner cleaner4 = new Cleaner(NameGenerator.nameGenerator());

		Receptionist receptionist1 = new Receptionist(NameGenerator.nameGenerator());
		Receptionist receptionist2 = new Receptionist(NameGenerator.nameGenerator()); */

		System.out.println(clubstaff);

		//- At least 30 Coaching staff of various types (there must ONLY ONE Head Coach and at least 2
		//other different types of coaching staff. As above, the 30 cannot all be the same type). There
		//must be at least 3 different types of Coaching staff.



		ArrayList<CoachingStaff> coachingstaff = new ArrayList< CoachingStaff>();

		while(y < 1) {
			coachingstaff.add(new HeadCoach(NameGenerator.nameGenerator(), 5));
			y++;
		}
		while (y < 10){
			coachingstaff.add( new AssistantCoach(NameGenerator.nameGenerator(), NumberGenerator.numberGenerator()));
			y++;
		}	
		while (y < 31) {
			coachingstaff.add(new SwimTeacher(NameGenerator.nameGenerator(), NumberGenerator.numberGenerator()));
			y++;
		}

		// At least 50 Groups. There must be at least 3 different types of Group. However, you can include additional types for extra marks.

		ArrayList<SwimmingGroups> swimminggroups = new ArrayList< SwimmingGroups>();

		ArrayList<SwimmingGroups> aux = new ArrayList< SwimmingGroups>();

		while(z < 50) {

			int id = 1;

			swimminggroups.add(new SwimmingGroups (GroupGenerator.groupGenerator() + id,  NumberGenerator.numberGeneratorGroupsSwimmers() ,  DayGenerator.dayGenerator()));
			z++;
			id++;
		}	


		// Include at least 300 Swimmers


		ArrayList<Swimmers> swimmers = new ArrayList< Swimmers>();

		for(int i =0; i < swimminggroups.size(); i++) {
			for(int j= 0; j < 6 ; j++) {
				swimmers.add(new Swimmers (NameGenerator.nameGenerator(), NumberGenerator.numberGeneratorGroupsSwimmers(), swimminggroups.get(i)));
			}

		}





	}	


	public void listallstaff() {


	}

	public void listallstaffbycategory() {
		// TODO Auto-generated method stub

	}

	public void listallgroups() {
		// TODO Auto-generated method stub

	}

	public void listallgroupsbytype() {
		// TODO Auto-generated method stub

	}

	public void listallgroupsbydayoftrainning() {
		// TODO Auto-generated method stub

	}

	public void listallswimmersinagroup() {
		// TODO Auto-generated method stub

	}

	public void listallswimmersbycoach() {
		// TODO Auto-generated method stub

	}

	public void listallswimmers() {
		// TODO Auto-generated method stub

	}

}

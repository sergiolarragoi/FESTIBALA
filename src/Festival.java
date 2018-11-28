
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Festival {

	private String name;
	private String sponsor;
	ArrayList<Performance> performances;

	public Festival() {
		super();
		this.performances = new ArrayList<Performance>();
	}

	public Festival(String name, String sponsor, ArrayList<Performance> performances) {
		super();
		this.name = name;
		this.sponsor = sponsor;
		this.performances = new ArrayList<Performance>();
		this.performances = performances;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public ArrayList<Performance> getPerformances() {
		return performances;
	}

	public void setPerformances(ArrayList<Performance> performances) {
		this.performances = performances;
	}

	public void load_data(String path) {

		File file = new File(path);
		Scanner scan = null;
		Performance performance;

		try {

			scan = new Scanner(file);

			while (scan.hasNextLine()) {

				String line = scan.nextLine();

				String[] parts = line.split("::");

				performance = new Performance();

				performance.setGroupName(parts[0]);
				performance.setMembers(Integer.parseInt(parts[1]));
				performance.setDuration(Integer.parseInt(parts[2]));

				this.performances.add(performance);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void printFestivalData() {

		System.out.println("****************************************************");
		System.out.println("\n\t FESTIVAL " + this.name);
		System.out.println("\t Sponsor " + this.sponsor);

		for (int i = 0; i < this.performances.size(); i++) {

			this.performances.get(i).printPerformanceData();
		}
		System.out.println("****************************************************");
		
	}

	
	
	

}
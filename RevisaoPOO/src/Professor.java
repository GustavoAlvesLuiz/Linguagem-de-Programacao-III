
public class Professor extends User{
	private String siape;
	private String level;
	private String area;
	
	public Professor(int id, String siape) {
		super(id);
		this.siape = siape;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSiape() {
		return siape;
	}
	
	@Override
	public String formatPersonalData() {
		String UserData = super.formatPersonalData();
		String professorData = String.format("Siape: %s\nNível: %s\nArea: %s ",siape,level,area);
		return UserData + professorData;
	}
	
}

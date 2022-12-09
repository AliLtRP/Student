package Student;

import java.util.ArrayList;

public class uni extends Student{
	
	public uni(String name, int stage) {
		this.name = name;
		this.stage = stage;
	}
	
	private String uniName, collageName, depName;
	public static ArrayList<String> arrayUni = new ArrayList<>();
	
	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	boolean stageUp() {
		// TODO Auto-generated method stub
		final int getS = this.getStage();
		if (getS < 4) {
			this.setStage(1+getS);
			return true;
		} else if(getS == 4) {
			this.stageOver(getS);
		}
		return false;
	}

	@Override
	boolean stageOver(int year) {
		// TODO Auto-generated method stub
		if (year >= 4) {
			System.out.println("congrats the graduation");
			
			for (int i=0; i <arrayUni.size(); i++) {
				if ( arrayUni.get(i) == this.name) {
					arrayUni.set(i, null);
				}
			}
			this.name = null;
			this.stage = 0;
			this.collageName = null;
			this.depName = null;
			this.uniName = null;
			return true;
		}
		return false;
	}
		

	@Override
	void setName(String name) {
		// TODO Auto-generated method stub
		arrayUni.add(name);
		this.name = name;
	}
	
}

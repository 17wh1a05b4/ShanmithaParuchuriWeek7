package behavioral;

public abstract class emp {
	abstract void working();
	abstract void takingBreak();
	abstract void payment();
	public final void CometoWork(){
		working();
		takingBreak();
		payment();
	}	
}
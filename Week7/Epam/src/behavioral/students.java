package behavioral;

public class students implements sector {

	  public String[] students = {"Mike","John","Emma","Sophia"};

	  public iterator getIterator() {
		return new StudentsIterator();
	}

	private class StudentsIterator implements iterator {
		  int index;
	      public boolean hasnext() {
	          if(index < students.length) {
	              return true;
	          } 
	          return false;
	      }
	      public Object next() {
	          if(this.hasnext()) {
	              return students[index++];
	          }
	          return null;
	         }
	}
}

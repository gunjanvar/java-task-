import java.util.Comparator;

public class MarksComparator implements Comparator<Students>{

	@Override
	public int compare(Students student1, Students student2) {
		// TODO Auto-generated method stub
		if(student1.studentMarks == student2.studentMarks)
			return 0;
		if(student1.studentMarks > student2.studentMarks)
			return 1;
		else
			return -1;	
	}
}

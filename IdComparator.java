import java.util.Comparator;

public class IdComparator implements Comparator<Students> {

	@Override
	public int compare(Students student1, Students student2) {
		// TODO Auto-generated method stub
		if(student1.studentId == student2.studentId)
			return 0;
		if(student1.studentId > student2.studentId)
			return 1;
		else
			return -1;	
	}
}

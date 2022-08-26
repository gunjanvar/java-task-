import java.util.Comparator;

public class AgeComparators implements Comparator<Students> {

	@Override
	public int compare(Students student1, Students student2) {
		// TODO Auto-generated method stub
		if(student1.studentAge == student2.studentAge)
			return 0;
		if(student1.studentAge > student2.studentAge)
			return 1;
		else
			return -1;	
	}
}


import java.util.ArrayList;
import java.util.List;

public class main{

    public static void main(String[] args) {
	    List<Integer> grades = new ArrayList<>();
	    grades.add(22);
	    grades.add(23);
	    grades.add(24);
	    grades.add(25);
	    grades.add(31);
	    grades.add(33);
	    grades.add(35);
	    grades.add(37);
	    grades.add(38);
	    grades.add(39);
	    grades.add(40);
	    grades.add(41);
	    grades.add(42);
	    grades.add(42);
	    grades.add(43);
	    grades.add(44);
	    grades.add(45);
	    grades.add(46);
	    grades.add(49);
	    grades.add(55);
	    grades.add(87);
	    grades.add(99);
	    for(int i = 0; i< grades.size(); i++){
		grades.set(i, roundUp(grades.get(i)));
	    }
	    //roundUp(grade);
    }

    public static Integer roundUp(Integer grade){
        if(grade < 38) {
		System.out.println("Nothing " + grade);

	    return grade;
        }else{
	Integer roundGrade = (grade+2)/5*5;
	    if(roundGrade < grade){//when round down leave grade unchanged
		System.out.println("No rounded" + grade);
		return grade; 
	    }else{
		System.out.println("Rounded" + roundGrade);
		return roundGrade;
	    }
	}
    }
}

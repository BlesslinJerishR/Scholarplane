import java.util.Scanner;
class Scholars {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the student class name (10 / 11 ):") ;
		int cl = sc.nextInt();
		if (cl == 10 || cl == 11 ) {
			// Student Marks
			System.out.println("Enter the student Mark 1 : ");
			int m1 = sc.nextInt();
			String city="Chennai";
			int scholar;
			scholar = 30 * 15000 / 100;
			if (cl == 10) {
				if (m1 < 60 && m1 > 30){
					System.out.println("your scholarship : " + scholar);
				}else if (city.equals("Chennai")){
					scholar = scholar-1000;
					System.out.println("your scholarship : " + scholar);
				}else{
					scholar = scholar-3000;
				}
  			}
		}
	}	
}
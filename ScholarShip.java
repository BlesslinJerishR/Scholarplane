import java.util.Scanner;

class ScholarShip{

    public static void main(String[] args){

        // Object Initialization
        Scanner inn = new Scanner(System.in);

        // Student Class
        System.out.println("Enter the student class name (10 / 11 / 12) : ");
        int cl = inn.nextInt();
        System.out.println("");
        if(cl == 10 || cl == 11 || cl == 12){
			// Student Marks
        	System.out.println("Enter the student Mark 1 : ");
        	int m1 = inn.nextInt();
			// Class 10
			int scholar;
			if(cl == 10){
				if(m1<60 && m1>30){
					scholar = 30*15000/100;
					System.out.println("your scholarship : "+scholar);
				}else if(m1<90 && m1>60){
					scholar = 50*15000/100;
					System.out.println("your scholarship : "+scholar);
				}else if(m1>90){
					scholar = 70*15000/100;
					System.out.println("your scholarship : "+scholar);
				}else{
					System.out.println("");
					System.out.println("You are not eligible for Scholarship");
				}
			}else if(cl == 11){
				if(m1<60 && m1>30){
					scholar = 30*25000/100;
					System.out.println("your scholarship : "+scholar);
				}else if(m1<90 && m1>60){
					scholar = 50*25000/100;
					System.out.println("your scholarship : "+scholar);
				}else if(m1>90){
					scholar = 70*25000/100;
					System.out.println("your scholarship : "+scholar);
				}else{
					System.out.println("");
					System.out.println("You are not eligible for Scholarship");
				}
			}else if(cl == 12 ){
				if(m1<60 && m1>30){
					scholar = 30*30000/100;
					System.out.println("your scholarship : "+scholar);
				}else if(m1<90 && m1>60){
					scholar = 50*30000/100;
					System.out.println("your scholarship : "+scholar);
				}else if(m1>90){
					scholar = 70*30000/100;
					System.out.println("your scholarship : "+scholar);
				}else{
					System.out.println("");
					System.out.println("You are not eligible for Scholarship");
				}
			}
		}else{
				System.out.println("Enter a valid Student Class.");
			}
    }
}

import java.util.Scanner;
class Project1
{
	public static void main(String[] v)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of students in class-->");
		int n=s.nextInt();
		/*create an array to store the student details*/
		int roll[] =new int[n];
		String name[]=new String[n];
		int marks[]=new int[n];
		int choice;
		int count=0;
		/* display the options for user selection */
		do
		{
			System.out.println("1.ADD STUDENTS");
			System.out.println("2.DISPLAY STUDENT DETAILS");
			System.out.println("3.SEARCH STUDENT DETAILS");
			System.out.println("4.EXIT");
			choice =s.nextInt();
			switch (choice){
				case 1:
						for (int i=0;i<n;i++){
						System.out.println("Enter the student roll number-->");
						roll [i]=s.nextInt();
						
						System.out.println("Enter the student name-->");
						name [i]=s.next();
						
						System.out.println("Enter the student marks-->");
						marks [i]=s.nextInt();
						
						}
						break;
				case 2:
						for (int i=0;i<n;i++)
						{
							System.out.println(roll[i]+" "+name[i]+" "+marks[i]);
						}
						
						break;
				case 3:
				System.out.println("Entre the student roll number to be searched-->");
						int r=s.nextInt();
						for (int i=0;i<n;i++)
						{
							if (r==roll[i])
							{
								System.out.println(name[i]+" "+marks[i]);
							}
							
						}
						break;
				case 4:
						System.out.println("student details prosesed");
		}
		
		}
			while (choice !=4);
		
}}
								
package virtualKeyForRepository;
import virtualKeyForRepository.FileService.*;
import java.util.*;
public class FileApp {

	public static void main(String[] args) {
		FileService obj= new FileService();
		System.out.println("******************************************************************\n");
		System.out.println("\t\t  Virtual Key For your Repository\n");
		System.out.println("\t\t\tDHIVYAADARSHINI SA\n");
		System.out.println("******************************************************************\n");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1. List a file 2. Business operations 3. Close the application");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:obj.sortfile();break;
			
			case 2:
					System.out.println("Enter your choice");
					System.out.println("1. Insert a file 2. Search the file 3. Delete the file");
					int choice1=sc.nextInt();
					switch(choice1) {
					
					case 1:System.out.println("Enter the file name with extension to be inserted");
						String filename = sc.next();
						obj.insertFile(filename);
						break;
						
						
					case 2:System.out.println("Enter the file name with extension to search");
						String filesearch = sc.next();
						obj.searchFile(filesearch);
						break;
						
						
					case 3:System.out.println("Enter the file name with extension to be deleted");
						String filedelete = sc.next();
						obj.deleteFile(filedelete);
						break;
						
						
					default: System.out.println("Enter the correct choice");break;
					}break;
				
			case 3:System.out.println("Thank you!!");
					System.exit(1);
					break;
			default:System.out.println("Enter the correct choice");break;
			}
		}
	}
}

package virtualKeyForRepository;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FileService {
	private String path="C:\\Users\\LENOVO\\Desktop\\test";
	File obj = new File(path);
	List<String> files = new ArrayList<String>();
			
	
			//The file search operation
			void searchFile(String filesearch) {
				if(files.isEmpty()) {
					listfile();
				}
				if(files.contains(filesearch)){
					System.out.println("File is found");
				}
				else {
					System.out.println("File not found");
				}
				
		    }
		
			//The file deletion operation
			void deleteFile(String filedelete) {
				if(files.isEmpty()) {
					listfile();
				}
					String filepath=obj+"\\"+filedelete;
					File obj2 = new File(filepath);
					if(files.contains(filedelete)) {
						obj2.delete();
						files.remove(filedelete);
						System.out.println("file deleted");
						}
					else {
					System.out.println("File not found");
				}
			}
			
			//The file insertion operation
			void insertFile(String fileinsert) {
				if(files.isEmpty()) {
					listfile();
				}
				String Filepath=obj+"\\"+fileinsert;
				File obj1 = new File(Filepath);
				System.out.println(Filepath);
				if(obj1.exists()) {
					System.out.println("File is already present");
				}else {
					try {
						obj1.createNewFile();
						System.out.println("The File is created");
						files.add(fileinsert);
					}catch(Exception e) {
						System.out.println(e);
					}
				}
				
			}

			//The file sort operation
			void listfile() {
				for(String f:obj.list()) {
					files.add(f);
				}
			}
			void sortfile() {
				if(files.isEmpty()) {
					listfile();
				}
				Collections.sort(files);
				System.out.println(files);
			}
}


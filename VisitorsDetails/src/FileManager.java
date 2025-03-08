import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
 
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
    static public File createFile()
    {
    	File file = new File("visitors.txt");
    	try {
    		if(file.createNewFile()) {
    			System.out.println("File Created: " + file.getName());
    		}
    	}
    	catch(Exception e) {
    		System.out.println("An error occured while creating the file.");
    		e.printStackTrace();
    	}
        return file;   
    }
    
    static public void writeFile(File f, String record)
	{
	    FileWriter writer = null;
	    try {
	    	writer = new FileWriter(f, true);
	    	writer.write(record + ";");
	    }
	    catch(Exception e) {
	    	System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
	    }
	} 
    
	static public String[] readFile(File f)
	{
		StringBuilder content = new StringBuilder();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(f));
			String line;
			while((line = reader.readLine()) != null) {
				content.append(line);
			}
		}
		catch(Exception e) {
			System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
		}
	    
	    return content.toString().split(";"); 
	}
 }
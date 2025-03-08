import java.io.BufferedReader;
import java.io.FileReader;

public class UserInterface{
	public static int countKnowledge(String filePath) {
		int count = 0;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			String line;
			while((line = br.readLine()) != null) {
				String[] words = line.toLowerCase().split("\\W+");
				for(String word: words) {
					if(word.equals("knowledge")) {
						count++;
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		return count;
	}
	
    public static void main(String[] args)
    {
        String filePath = "D:\\Programs\\eclipse-workspace\\FileDemo/log.txt";
        
        int count = countKnowledge(filePath);

        System.out.println(count);
    }
}
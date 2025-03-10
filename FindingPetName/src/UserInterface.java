import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UserInterface {

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private boolean twoVowels(String name) {
        int count = 0;
        for (char c : name.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count == 2;
    }

    public String findPetName(String fileName) {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim(); 
                if (!line.isEmpty() && twoVowels(line)) {
                    return line;
                }
            }
            return "[]";
        } catch (FileNotFoundException e) {
            return "Please give the correct file name";
        } catch (IOException e) {
            return "Error occurred while reading the names from file";
        }
    }

    public static void main(String[] args) {
        String fileName = "FindingPetName/inputfeed.txt";

        if (fileName.isEmpty()) {
            System.out.println("Please give the correct file name");
            return;
        }

        UserInterface ui = new UserInterface();
        String result = ui.findPetName(fileName);
        System.out.println(result);
    }
}

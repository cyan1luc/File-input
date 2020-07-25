import java.io.*;
import java.util.*;
public class readFile {
	public void readSomeFile(String readFile, String writeFile){
//		int count = 0;
		String tempText;
		char[] charList;
		try{
			Scanner scan = new Scanner(new FileInputStream(readFile));
			FileWriter myWriter = new FileWriter(writeFile);
			while(scan.hasNext()){
				String text = scan.next();
				if(text.contains("Harry")){
					charList = text.toCharArray();
					if(charList[0] != 'H'){
						tempText = String.valueOf(charList[0]);
						tempText += "Michael";
						for(int i = text.indexOf('y') + 1; i <= charList.length-1; i++){
							tempText += String.valueOf(charList[i]);
						}
						text = tempText;
					} else if(text.length() > 5){
						for(int i = text.indexOf('y') + 1; i <= charList.length-1; i++){
							text = "Michael";
							text += String.valueOf(charList[i]);
						}
					} else{
						text = "Michael";
					}
				} else if(text.contains("Potter")){
					charList = text.toCharArray();
					if(charList[0] != 'P'){
						tempText = String.valueOf(charList[0]);
						tempText += "Potter";
						for(int i = text.indexOf('y') + 1; i <= charList.length-1; i++){
							tempText += String.valueOf(charList[i]);
						}
						text = tempText;
					} else if(text.length() > 6){
						for(int i = text.indexOf('r') + 1; i <= charList.length - 1; i++){
							text = "Reeves";
							text += String.valueOf(charList[i]);
						}
					} else{
						text = "Reeves";
					}
				}
				myWriter.write(text + " ");
			}
			scan.close();
			myWriter.close();
		} catch(IOException e){
			System.out.println("error");
		}
	}
	
	public void readSomeFile2(String input){
		try{
			Scanner scan = new Scanner(new FileInputStream(input));
			while(scan.hasNext()){
				String text = scan.next();
				
			scan.close();
			}
		}
		catch(Exception e){
			System.out.println("File does not exist");
		}
	}
	
	public void createFile(){
		try{
			File written = new File("Mykull Reeves and the Sorcerer.txt");
			if (written.createNewFile()){
				System.out.println("File created");
			} else{
				System.out.println("Already exists");
			}
		} catch(IOException e){
			System.out.println("Error");
		}
	}
	
	public static void main(String [] args) throws IOException{
		readFile readThis = new readFile();
		readThis.createFile();
		readThis.readSomeFile("Harry Potter and the Sorcerer.txt", "Michael Reeves and the Sorcerer.txt");
//		readThis.readSomeFile("Michael Reeves and the Sorcerer.txt");
	}
}

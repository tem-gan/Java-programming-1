
package songs;
import java.io.File;
import java.util.Scanner;

public class SongMain {

   public static void main(String[] args) {           

	   Scanner input = new Scanner(System.in);
	   System.out.println("========Select action========");
	   System.out.println("0. Quit");
	   System.out.println("1. Get collection size");   
	   System.out.println("2. Search for title");
	   System.out.println("3. Search for artist");      
	   System.out.println("4. Add from file");
	   System.out.println("5. Save to file");
	   System.out.println("6. Add one song");         
	   System.out.println("7. Remove one song");   
	   System.out.println("8. Show");
	   System.out.println("Enter Choice: ");
	   SongCollection songs=new SongCollection(0);        
	   while(input.hasNextLine()){
		   int option=Integer.parseInt(input.nextLine());
		   switch(option)
	   {

	   case 0:
		   System.exit(0);
		   break;
	   case 1:
		   System.out.println("Size = "+songs.size());
		   break;
	   case 2:
		   System.out.println("Enter title search key: ");
		   String title=input.nextLine();  
		   songs.searchByTitle(title);     
		   break;
	   case 3:
		   System.out.println("Enter Artist search key: ");
		   String artist=input.nextLine();           
		   songs.searchByArtist(artist);   
		   break;
	   case 4:
		   System.out.println("Enter file name: ");
		   String fileName=input.nextLine();     
		   File file=new File(fileName);
		   songs.addFromFile(file);        
		   break;
	   case 5:
		   System.out.println("Enter file name: ");
		   String outputFileName=input.nextLine();     
		   File outFile=new File(outputFileName);
		   songs.writeToFile(outFile);    
		   break;
	   case 6:
		   System.out.println("Enter title: ");
		   String newTitle=input.nextLine();
		   System.out.println("Enter Artist: ");
		   String newArtist=input.nextLine();    
		   songs.addOneSong(newTitle, newArtist);    
		   break;
	   case 7:
		   System.out.println("Enter position:");
		   int pos=Integer.parseInt(input.nextLine());
		   songs.delete(pos);
		   break;
	   case 8:
		   System.out.println("Enter start position: ");    
		   int start=Integer.parseInt(input.nextLine());
		   System.out.println("Enter end position:");      
		   int end=Integer.parseInt(input.nextLine());
		   songs.show(start, end);
		   break;
	   default:
		   System.out.println("Enter Choice");
	   }         
		   System.out.println("Enter Choice: ");
	   }         
	   input.close();
   }          
 }          
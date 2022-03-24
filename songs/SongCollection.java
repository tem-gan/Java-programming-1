package songs;           
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;        
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;        

public class SongCollection implements SongCollectionInt {
private Song[] theSongs;
private int NEW_ARRAY_LENGTH;

@Override
public int size() {

   return NEW_ARRAY_LENGTH;
}          
public SongCollection(int size) {        

   this.theSongs = new Song[size];        
   NEW_ARRAY_LENGTH = 0;
}         

@Override

public void addFromFile(File f) {

   try {
	   Scanner input = new Scanner(f);
	   NEW_ARRAY_LENGTH += Integer.parseInt(input.nextLine());
	   Song[] merged = Arrays.copyOf(theSongs, NEW_ARRAY_LENGTH);    
   for (int i = theSongs.length; i < NEW_ARRAY_LENGTH; i++) {
	   String title = input.nextLine();           
	   String artist = input.nextLine();        
	   Song song = new Song(title, artist);   
	   merged[i] = song;
   }        
   	   theSongs = merged;
       input.close();
   } catch (FileNotFoundException e) {
	   System.out.println("*** File Not Found ***");
   }          
   }          

@Override

public void writeToFile(File f) {

   BufferedWriter writer;
   try {
	   writer = new BufferedWriter(new FileWriter(f));      
	   writer.write(NEW_ARRAY_LENGTH+"\n");
	   for (int i = 0; i < theSongs.length; i++) {
		   writer.write(theSongs[i].getTitle() + "\n");      
		   writer.write(theSongs[i].getArtist() + "\n");
	   }         
	   writer.flush();  
	   writer.close();
   } catch (IOException e) {
	   e.printStackTrace();
   }          
   }         

@Override

public void addOneSong(String t, String a) {            

	NEW_ARRAY_LENGTH++;
	Song[] merged = Arrays.copyOf(theSongs, NEW_ARRAY_LENGTH);
	merged[NEW_ARRAY_LENGTH - 1] = new Song(t, a);
	theSongs = merged;    
}          

@Override

public void delete(int pos) {

	if (pos > 0 && pos < theSongs.length) {
		for (int j = pos - 1; j < NEW_ARRAY_LENGTH - 1; j++) {
			theSongs[j] = theSongs[j + 1];            
		}          
		NEW_ARRAY_LENGTH--;
		Song[] merged = Arrays.copyOf(theSongs, NEW_ARRAY_LENGTH);
		theSongs = merged;
	}          
	}          

@Override

public void searchByTitle(String key) {

	System.out.println("Songs with Title: " + key);         
	for (int i = 0; i < theSongs.length; i++) {
		if (theSongs[i].getTitle().indexOf(key) >= 0) {          
			System.out.println(i + 1 + ": " + theSongs[i].toString());
		}         
	}          
	}         

@Override

public void searchByArtist(String key) {

	System.out.println("Songs with Artist: " + key);       
	for (int i = 0; i < theSongs.length; i++) {       
		if (theSongs[i].getArtist().indexOf(key) >= 0) {
			System.out.println(i + 1 + ": " + theSongs[i].toString());
		}          
	}         
	}        

@Override

public void show(int start, int end) {

	if (start >= end || start > NEW_ARRAY_LENGTH || start < 0) {
		start = 0;
	}           
	if (end > NEW_ARRAY_LENGTH) {
		end = NEW_ARRAY_LENGTH;
	}           
	for (int i = start; i < end; i++) {
		System.out.println(i + ": " + theSongs[i]);
	}           
	}           
	}           


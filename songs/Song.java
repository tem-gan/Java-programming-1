package songs;             

public class Song implements SongInt {         

   private String title;       
   private String artist;     

   public Song(String title, String artist) {           

	   this.title = title;
	   this.artist = artist;
   }           

   @Override

   public String getTitle() {          
	   return title;
   }           

   @Override

   public String getArtist() {           
	   return artist;
   }           

   public String toString() {         
	   return title + ", " + artist;
   }           
}           





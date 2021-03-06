package musicPlayerDB.entity;
// Generated Oct 9, 2013 1:30:04 PM by Hibernate Tools 3.2.1.GA



/**
 * SongId generated by hbm2java
 */
public class SongId  implements java.io.Serializable {


     private String title;
     private String artist;

    public SongId() {
    }

    public SongId(String title, String artist) {
       this.title = title;
       this.artist = artist;
    }
   
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SongId) ) return false;
		 SongId castOther = ( SongId ) other; 
         
		 return ( (this.getTitle()==castOther.getTitle()) || ( this.getTitle()!=null && castOther.getTitle()!=null && this.getTitle().equals(castOther.getTitle()) ) )
 && ( (this.getArtist()==castOther.getArtist()) || ( this.getArtist()!=null && castOther.getArtist()!=null && this.getArtist().equals(castOther.getArtist()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTitle() == null ? 0 : this.getTitle().hashCode() );
         result = 37 * result + ( getArtist() == null ? 0 : this.getArtist().hashCode() );
         return result;
   }   


}



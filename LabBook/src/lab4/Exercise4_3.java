package lab4;

abstract class Item {
	private int uId;
	private String title;
	private int noOfcopies;
	public Item(int uId, String title, int noOfcopies) {
		super();
		this.uId = uId;
		this.title = title;
		this.noOfcopies = noOfcopies;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfcopies() {
		return noOfcopies;
	}
	public void setNoOfcopies(int noOfcopies) {
		this.noOfcopies = noOfcopies;
	}
	@Override
	public String toString() {
		return "Item [uId=" + uId + ", title=" + title + ", noOfcopies=" + noOfcopies + "]";
	}
	public boolean equals(Object anObject) {
		return title.equals(anObject);
	}
	
}

abstract class WrittenItem extends Item{

	private String Author;

	public WrittenItem(int uId, String title, int noOfcopies, String author) {
		super(uId, title, noOfcopies);
		Author = author;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	
}

class Book extends WrittenItem{

	public Book(int uId, String title, int noOfcopies, String author) {
		super(uId, title, noOfcopies, author);
	
	}
	
}

class JournalPaper extends WrittenItem{

	private int yearPublished;

	public JournalPaper(int uId, String title, int noOfcopies, String author, int yearPublished) {
		super(uId, title, noOfcopies, author);
		this.yearPublished = yearPublished;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
}

abstract class MediaItem extends Item{
	private int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public MediaItem(int uId, String title, int noOfcopies, int runTime) {
		super(uId, title, noOfcopies);
		this.runTime = runTime;
	}
	
}

class Video extends MediaItem{
	public Video(int uId, String title, int noOfcopies, int runTime, String director, String genre, int year) {
		super(uId, title, noOfcopies, runTime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	private String director;
	private String genre;
	private int year;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}

class CD extends MediaItem{
	private String artist;
	private String genre;
	public CD(int uId, String title, int noOfcopies, int runTime, String artist, String genre) {
		super(uId, title, noOfcopies, runTime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
}
public class Exercise4_3 {

	public static void main(String[] args) {

		CD cd =new CD(1,"Harry Potter",1,127,"Daniel","Thriller");
		System.out.println(cd.getArtist());
		

	}

}

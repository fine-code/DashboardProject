package dashboard;

public class Quote {
	private final String quote;
	private Person author;
	
	public Quote(String quote) {
		this.quote = quote;
	}
	public Quote(String quote, Person author) {
		this.quote = quote;
		this.author = author;
	}
	public void setAuthor(Person author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "\""+quote +"\""+ " " + author;
	}

}

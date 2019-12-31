package app;
public class Quote {
	
	private final String quote;
	private String authorFirstName;
	private String authorLastName;
	private Reaction feedback;

	public Quote(String quote) {
		this.quote = quote;
	}

	public Quote(String quote, String fname, String lname) {
		this.quote = quote;
		this.authorFirstName = fname;
		this.authorLastName = lname;
		this.feedback = Reaction.NEUTRAL;
	}

	@Override
	public String toString() {
		return "\"" + quote + "\"" + " " + authorFirstName + " " + authorLastName;
	}

}

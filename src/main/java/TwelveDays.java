class TwelveDays {
	String[] lines = {
			"a Partridge in a Pear Tree",
			"two Turtle Doves",
			"three French Hens",
			"four Calling Birds",
			"five Gold Rings", 
			"six Geese-a-Laying",
			"seven Swans-a-Swimming",
			"eight Maids-a-Milking",
			"nine Ladies Dancing",
			"ten Lords-a-Leaping",
			"eleven Pipers Piping",
			"twelve Drummers Drumming" };
	
	String[] days = {
			"first",
			"second",
			"third",
			"fourth",
			"fifth",
			"sixth",
			"seventh",
			"eighth",
			"ninth",
			"tenth",
			"eleventh",
			"twelfth"};
    
	String verse(int verseNumber) {
		StringBuilder verse = new StringBuilder();
		
		verse.append("On the ");
		verse.append(this.days[verseNumber-1]);
		verse.append(" day of Christmas my true love gave to me: ");
		for(int i = verseNumber-1; i >= 0; i--) {
			if(verseNumber != 1 && i == 0) {
				verse.append("and ");
			}
			verse.append(lines[i]);
			if(i > 0) {
				verse.append(", ");
			}else {
				verse.append(".");
			}
		}
		verse.append("\n");
		return verse.toString();
	}
	
	

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for( int i = startVerse ;  i >= endVerse; i++ ){
            sb.append(verse(i));
            if(i != endVerse)
                sb.append("\n");
        }
        return sb.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }
}

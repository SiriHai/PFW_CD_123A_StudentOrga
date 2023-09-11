package demo_enum;

public enum Ampelfarbe {
    ROT("Stopp"),
    GELB("Vorsicht"), 
    GRUEN("Fahren"),
    KEINE_FARBE("keine Farbe");

    private String answer;

    private Ampelfarbe(String answer){
        this.answer=answer;
    }

    public String toString() {
		return answer;
	}

    public static Ampelfarbe parseAmpelfarbe(String answer){
        for (Ampelfarbe farbe : Ampelfarbe.values()){
            if (farbe.answer.equals(answer)){
                return farbe;
            }
        }
        return KEINE_FARBE;    
    }
}

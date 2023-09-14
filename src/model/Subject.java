package model;

public enum Subject {
    NO_SUBJECT("No"),
    APPLIED_INFORMATICS("AI"),
    BUSINESS_INFORMATICS("WI"),
    IT_MANAGEMENT_AND_INFORMATION_SYSTEMS("ITM"),
    GENERAL_MANAGEMENT("GM");

    private String fach;

    private Subject(String fach) {
        this.fach = fach;
    }

    public String toString(){
        return fach;
    }

    public static Subject parseSubject(String fach){
        for (Subject s : Subject.values()){
            if (fach.equals(s.fach))
                return s;
        }
        return NO_SUBJECT;
    }

    public static String[] getStrings(){
        int anzahl = Subject.values().length;
        String[] faecher = new String[anzahl];
        for (int i = 0; i < anzahl; i++){
            faecher[i] = Subject.values()[i].toString();
        }
        return faecher;
    }
}

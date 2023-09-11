package model;

public class Things<T> {
    private Object[] thingArray;
    private int anzahl;

    public Things(int anzahl) {
        thingArray = new Object[anzahl];
        anzahl = 0;
    }

    public void add(T thing) {
        if (thing == null) {
            System.out.println("Student is null.");
        } else {
            if (anzahl < thingArray.length)
                thingArray[anzahl++] = thing;
            else
                System.out.println("Kein Platz mehr.");
        }
    }

    public void remove(T thing) {
        if (thing == null) {
            System.out.println("Student is null.");
        } else {
            for (int i = 0; i < anzahl; i++) {
                if (thing.equals(thingArray[i])) {
                    for (int j = i; j < anzahl - 1; j++) {
                        thingArray[j] = thingArray[j + 1];
                    }
                    // --anzahl oder anzahl-- reicht auch
                    thingArray[--anzahl] = null;
                    return;
                }
            }
            System.out.println("Thing nicht gefunden.");
        }
    }
    
    @SuppressWarnings("unchecked")
    public void remove(String firstName, String lastName) {
        for (int i = 0; i < anzahl; i++) {
            if (thingArray[i] != null &&
                thingArray[i] instanceof Person && 
                ((Person)thingArray[i]).getFirstName().equals(firstName) &&
                ((Person)thingArray[i]).getLastName().equals(lastName)) {
                    remove((T)thingArray[i]);
                return;
            }
        }
        System.out.println("Thing nicht gefunden.");
    }


    // Ausgabe aller gespeicherten Objekte
    public void print() {
        System.out.println("Things in things");
        for (int i = 0; i<anzahl; i++) {
            System.out.println(thingArray[i]);
        }
    }

}

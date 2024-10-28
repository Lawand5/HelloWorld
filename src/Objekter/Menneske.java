public class Menneske {
    private String navn;
    private Menneske ægtefælle;

    // Konstruktor
    public Menneske(String navn) {
        this.navn = navn;
        this.ægtefælle = null; // Ingen ægtefælle til at starte med
    }

    // Getter for ægtefælle
    public Menneske getÆgtefælle() {
        return ægtefælle;
    }

    // Setter for ægtefælle
    private void setÆgtefælle(Menneske ægtefælle) {
        this.ægtefælle = ægtefælle;
    }

    // Metode til at gifte sig
    public void gifterSigMed(Menneske andetMenneske) {
        if (andetMenneske == null || andetMenneske == this) {
            System.out.println("Du kan ikke gifte dig med dig selv eller ingen.");
            return;
        }
        // Hvis personen allerede er gift, bliver de først skilt
        if (this.ægtefælle != null) {
            this.bliverSkilt();
        }
        // Hvis det andet menneske også er gift, bliver de skilt
        if (andetMenneske.getÆgtefælle() != null) {
            andetMenneske.bliverSkilt();
        }

        // Gifter begge personer
        this.setÆgtefælle(andetMenneske);
        andetMenneske.setÆgtefælle(this);
        System.out.println(this.navn + " er nu gift med " + andetMenneske.navn);
    }

    // Metode til at blive skilt
    public void bliverSkilt() {
        if (this.ægtefælle == null) {
            System.out.println(this.navn + " er ikke gift.");
            return;
        }
        System.out.println(this.navn + " og " + this.ægtefælle.navn + " er nu skilt.");

        // Skil begge personer
        Menneske tidligereÆgtefælle = this.ægtefælle;
        this.setÆgtefælle(null);
        tidligereÆgtefælle.setÆgtefælle(null);
    }

    public static void main(String[] args) {
        Menneske person1 = new Menneske("Lil");
        Menneske person2 = new Menneske("Chase");

        person1.gifterSigMed(person2);  // Anna og Jens bliver gift
        person1.bliverSkilt();          // Anna og Jens bliver skilt
    }
}

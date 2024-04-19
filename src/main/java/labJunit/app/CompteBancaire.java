package labJunit.app;

public class CompteBancaire {

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    private double solde;

    public CompteBancaire() {
        this.solde = 0;
    }

    public double debiterSolde(double montant) {
        if (montant > 0) {
            this.solde -= montant;
        }
        return this.solde;
    }

    public double crediterSolde(double montant) {
        if (montant > 0) {
            this.solde += montant;
        }
        return this.solde;
    }

}

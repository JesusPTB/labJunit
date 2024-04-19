package labJunit.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCompteBancaire {

    @Test
    void crediterSoldeMontantPositif() {
        CompteBancaire compte = new CompteBancaire();
        compte.crediterSolde(50);
        assertEquals(50, compte.getSolde());
    }

    @Test
    void crediterSoldeMontantNegatif() {
        CompteBancaire compte = new CompteBancaire();
        compte.crediterSolde(-50);
        assertEquals(0, compte.getSolde());
    }


    @Test
    void debiterSoldeMontantPositif () {
        CompteBancaire c = new CompteBancaire();
        c.crediterSolde(100);
        c.debiterSolde(50);
        assertEquals(50, c.getSolde());
    }

    @Test
    void debiterSoldeMontantNegatif () {
        CompteBancaire c = new CompteBancaire();
        c.crediterSolde(100);
        c.debiterSolde(-50);
        assertEquals(100, c.getSolde());
    }

}
package labJunit.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCompteBancaire {

    @Test
    void crediterSoldeMontantPositif() {
        CompteBancaire c = new CompteBancaire();
        c.crediterSolde(50);
        assertEquals(50, c.getSolde());
    }

    @Test
    void crediterSoldeMontantNegatif() {
        CompteBancaire c = new CompteBancaire();
        assertThrows(IllegalArgumentException.class, () -> c.crediterSolde(-50));
    }

    @Test
    void crediterSoldeZero() {
        CompteBancaire c = new CompteBancaire();
        assertThrows(IllegalArgumentException.class, () -> c.crediterSolde(0));
    }


    @Test
    void debiterSoldeMontantNonDisponible () {
        CompteBancaire c = new CompteBancaire();
        c.crediterSolde(100);
        assertThrows(IllegalArgumentException.class, () -> c.debiterSolde(150));
    }

    @Test
    void debiterSoldeMontantNegatif () {
        CompteBancaire c = new CompteBancaire();
        assertThrows(IllegalArgumentException.class, () -> c.debiterSolde(-50));
    }

    @Test
    void debiterSoldeZero () {
        CompteBancaire c = new CompteBancaire();
        assertThrows(IllegalArgumentException.class, () -> c.debiterSolde(0));
    }

}
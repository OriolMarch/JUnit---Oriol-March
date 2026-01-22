

public class utilitatstest {

    // Test suma
    @Test
    void testSuma() {
        assertEquals(5, Utilitats.suma(2, 3));
    }

    // Tests resta
    @Test
    void testRestaPositiva() {
        assertEquals(7, Utilitats.resta(10, 3));
    }

    @Test
    void testRestaNegativa() {
        assertEquals(-7, Utilitats.resta(3, 10));
    }

    @Test
    void testRestaZero() {
        assertEquals(0, Utilitats.resta(0, 0));
    }

    // Tests esParell
    @Test
    void testEsParellTrue() {
        assertTrue(Utilitats.esParell(10));
    }

    @Test
    void testEsParellFalse() {
        assertFalse(Utilitats.esParell(7));
    }

    // Tests esPositiu
    @Test
    void testEsPositiuTrue() {
        assertTrue(Utilitats.esPositiu(1));
    }

    @Test
    void testEsPositiuFalseZero() {
        assertFalse(Utilitats.esPositiu(0));
    }

    @Test
    void testEsPositiuFalseNegatiu() {
        assertFalse(Utilitats.esPositiu(-1));
    }

    // Test excepció divideix
    @Test
    void testDivideixExcepcio() {
        assertThrows(IllegalArgumentException.class, () -> {
            Utilitats.divideix(10, 0);
        });
    }

    // Test missatge excepció
    @Test
    void testDivideixMissatge() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Utilitats.divideix(10, 0);
        });
        assertEquals("No es pot dividir per zero", ex.getMessage());
    }

    // Tests arrelQuadradaEntera
    @Test
    void testArrelQuadradaCorrecta() {
        assertEquals(3, Utilitats.arrelQuadradaEntera(9));
    }

    @Test
    void testArrelQuadradaZero() {
        assertEquals(0, Utilitats.arrelQuadradaEntera(0));
    }

    @Test
    void testArrelQuadradaNegativa() {
        assertThrows(ArithmeticException.class, () -> {
            Utilitats.arrelQuadradaEntera(-1);
        });
    }

    // Tests saludaSiNomValid
    @Test
    void testSaludaNull() {
        assertNull(Utilitats.saludaSiNomValid(null));
    }

    @Test
    void testSaludaBuit() {
        assertNull(Utilitats.saludaSiNomValid("   "));
    }

    @Test
    void testSaludaCorrecte() {
        assertEquals("Hola, Cristian!", Utilitats.saludaSiNomValid("Cristian"));
    }

    // Tests trobaInicial
    @Test
    void testTrobaInicialNull() {
        assertNull(Utilitats.trobaInicial(null));
    }

    @Test
    void testTrobaInicialBuit() {
        assertNull(Utilitats.trobaInicial(" "));
    }

    @Test
    void testTrobaInicialCorrecte() {
        assertEquals("J", Utilitats.trobaInicial("Java"));
    }

    @Test
    void testTrobaInicialAmbEspais() {
        assertEquals("h", Utilitats.trobaInicial(" hola"));
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OperacoesMatematicasTest {

    @BeforeAll
    public static void setUp(){

    }
    @Test
    void calculaMedia() {

        int[] vetorOrdenado1 = {1,2,3,4,5};
        int[] vetorOrdenado2 = {10,10,10};
        int[] vetorOrdenado3 = {0,0,0};
        int[] vetorOrdenado4 = {-5,10,3};

        Assertions.assertEquals(3, OperacoesMatematicas.calculaMedia(vetorOrdenado1) );
        Assertions.assertEquals(10, OperacoesMatematicas.calculaMedia(vetorOrdenado2) );
        Assertions.assertEquals(0, OperacoesMatematicas.calculaMedia(vetorOrdenado3) );
        Assertions.assertEquals(2.66, OperacoesMatematicas.calculaMedia(vetorOrdenado4),0.1 );

    }

    @Test
    void estaOrdenadaDeveSerFalso() {
        int[] vetorDesordenado1 = {1,7,3,14};
        int[] vetorDesordenado2 = {-1,0,3,-5};

        boolean resultado=OperacoesMatematicas.estaOrdenada(vetorDesordenado1);
        boolean resultado2=OperacoesMatematicas.estaOrdenada(vetorDesordenado2);

        Assertions.assertFalse(resultado);
        Assertions.assertFalse(resultado2);
    }

    @Test
    void estaOrdenadaComSucesso() {
        int[] vetorOrdenado1 = {1,2,3,4,5};
        int[] vetorOrdenado2 = {-5,-4,-3,-2,-1};

        boolean resultado1=OperacoesMatematicas.estaOrdenada(vetorOrdenado1);
        boolean resultado2=OperacoesMatematicas.estaOrdenada(vetorOrdenado2);

        Assertions.assertTrue(resultado1);
        Assertions.assertTrue(resultado2);
    }

    @Test
    void calculaFatorialcomSucesso() {
        Assertions.assertEquals(120, OperacoesMatematicas.calculaFatorial(5));
        Assertions.assertEquals(6, OperacoesMatematicas.calculaFatorial(3));
    }

    @Test
    void calculaFatorialcomQuandoValorForZero() {
        Assertions.assertEquals(1, OperacoesMatematicas.calculaFatorial(0));
    }
    @Test
    void calculaFatorialDeveRetornarException() {
        Assertions.assertThrows(RuntimeException.class,()->OperacoesMatematicas.calculaFatorial(-1));
    }
        @Test
    void converteTemperatura() {
        Assertions.assertEquals(32, OperacoesMatematicas.converteTemperatura(0));
        Assertions.assertEquals(-28.4,OperacoesMatematicas.converteTemperatura(-2));
        Assertions.assertEquals(50,OperacoesMatematicas.converteTemperatura(10));
        Assertions.assertEquals(64.4,OperacoesMatematicas.converteTemperatura(18));
    }

    @Test
    void ePrimoComSucesso() {

        boolean resultado1=OperacoesMatematicas.ePrimo(5);
        boolean resultado2=OperacoesMatematicas.ePrimo(11);

        Assertions.assertTrue(resultado1);
        Assertions.assertTrue(resultado2);

    }

    @Test
    void ePrimoSemSucesso() {
        Assertions.assertFalse(OperacoesMatematicas.ePrimo(4));
        Assertions.assertFalse(OperacoesMatematicas.ePrimo(22));

    }
}
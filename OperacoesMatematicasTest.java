import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperacoesMatematicasTest {


    @Test
    @Description(value = "calcula média considerando  um vetor ordenado")
    void calculaMediaComVetorOrdenado() {

        int[] vetorOrdenado1 = {1,2,3,4,5};
        Assertions.assertEquals(3, OperacoesMatematicas.calculaMedia(vetorOrdenado1) );

    }

    @Test
    @Description(value = "calcula média considerando  um vetor com valor negativo")
    void calculaMediaComVetorComValorNegativo() {

        int[] vetorOrdenado4 = {-5,10,3};
        Assertions.assertEquals(2.66, OperacoesMatematicas.calculaMedia(vetorOrdenado4),0.1 );

    }

    @Test
    @Description(value = "calcula média  recebendo um vetor com valores iguais")
    void calculaMediaComVetordeValoresIguais() {

        int[] vetorOrdenado2 = {10,10,10};
        Assertions.assertEquals(10, OperacoesMatematicas.calculaMedia(vetorOrdenado2) );

    }

    @Test
    @Description(value = "calcula média considerando  um vetor com valores zerados")
    void calculaMediaComVetorComValoresZerados() {

        int[] vetorOrdenado3 = {0,0,0};
        Assertions.assertEquals(0, OperacoesMatematicas.calculaMedia(vetorOrdenado3) );

    }



    @Test
    @Description(value = "Deve retornar false consierando um vetor desordenado")
    void estaOrdenadaDeveSerFalso() {
        int[] vetorDesordenado = {1,7,3,14};
        boolean resultado = OperacoesMatematicas.estaOrdenada(vetorDesordenado);

        Assertions.assertFalse(resultado);
    }

    @Test
    @Description(value = "Deve retornar false consierando um vetor com valores negativos")
    void estaOrdenadaDeveSerFalsoComValoresNegativos() {
        int[] vetorDesordenado2 = {-1,0,3,-5};
        boolean resultado2=OperacoesMatematicas.estaOrdenada(vetorDesordenado2);

        Assertions.assertFalse(resultado2);
    }

    @Test
    @Description(value = "Deve retornar sucesso com vetor ordenado")
    void estaOrdenadaComSucesso() {
        int[] vetorOrdenado1 = {1,2,3,4,5};
        boolean resultado1=OperacoesMatematicas.estaOrdenada(vetorOrdenado1);

        Assertions.assertTrue(resultado1);
    }

    @Test
    @Description(value = "Deve retornar sucesso com vetor ordenado com valores negativos")
    void estaOrdenadaComSucessoComValoresNegativos() {
        int[] vetorOrdenado2 = {-5,-4,-3,-2,-1};
        boolean resultado2=OperacoesMatematicas.estaOrdenada(vetorOrdenado2);

        Assertions.assertTrue(resultado2);
    }

    @Test
    @Description("Deve retornar sucesso")
    void calculaFatorialcomSucesso() {
        Assertions.assertEquals(120, OperacoesMatematicas.calculaFatorial(5));
    }

    @Test
    @Description("Deve retornar sucesso com valor menor")
    void calculaFatorialcomSucessoComValorMenor() {
        Assertions.assertEquals(6, OperacoesMatematicas.calculaFatorial(3));
    }

    @Test
    @Description(value = "Deve retornar 1 quando valor passado for 0")
    void calculaFatorialcomQuandoValorForZero() {
        Assertions.assertEquals(1, OperacoesMatematicas.calculaFatorial(0));
    }
    @Test
    @Description(value = "Deve retornar exception para numero negativo como parametro")
    void calculaFatorialDeveRetornarException() {
        Assertions.assertThrows(RuntimeException.class,()->OperacoesMatematicas.calculaFatorial(-1));
    }
    @Test
    @Description(value = "Deve converter temperatura considerando parametro com zero")
    void converteTemperatura() {
        Assertions.assertEquals(32, OperacoesMatematicas.converteTemperatura(0));
    }

    @Test
    @Description(value = "Deve converter temperatura considerando parametro negativo")
    void converteTemperaturaComValorNegativo() {
        Assertions.assertEquals(28.4,OperacoesMatematicas.converteTemperatura(-2));
    }

    @Test
    @Description(value = "Deve converter temperatura considerando parametro positivo")
    void converteTemperaturaComValorPositivo() {
        Assertions.assertEquals(50,OperacoesMatematicas.converteTemperatura(10));
    }

    @Test
    @Description(value = "Deve converter temperatura considerando parametro com valor flutuante  ")
    void converteTemperaturaComValorFlutuante() {
        Assertions.assertEquals(65.3,OperacoesMatematicas.converteTemperatura(18.5),0.1);
    }


    @Test
    @Description(value = "Deve retornar true considerando menor numero primo")
    void ePrimoDeveRetornarComSucessoMenorNumeroPrimo() {

        boolean resultado1=OperacoesMatematicas.ePrimo(2);
        Assertions.assertTrue(resultado1);
    }

    @Test
    @Description(value = "Deve retornar true considerando alto valor como parametro")
    void ePrimoDeveRetornarComSucesso() {

        boolean resultado2=OperacoesMatematicas.ePrimo(8273);
        Assertions.assertTrue(resultado2);

    }
    @Test
    @Description(value = "Deve retornar falso para numero não primo par")
    void ePrimoDeveRetornarFalseParaNumerosQueNaoSaoPrimosPar() {
        Assertions.assertFalse(OperacoesMatematicas.ePrimo(4));

    }

    @Test
    @Description(value = "Deve retornar falso para numero não primo impar")
    void ePrimoDeveRetornarFalseParaNumerosQueNaoSaoPrimosImpar() {
        Assertions.assertFalse(OperacoesMatematicas.ePrimo(15));

    }
    @Test
    @Description(value = "verificar ordenacao com sucesso com array crescente")
    void verificaListaOrdenadaComSucessoArrayCrescente(){
        int[] vetorOrdenadoCres = {1,2,3,4,5};
        Assertions.assertTrue((OperacoesMatematicas.listaOrdenada(vetorOrdenadoCres)));
    }

    @Test
    @Description(value = "verificar ordenacao com sucesso com array decrescente")
    void verificaListaOrdenadaComSucesso(){
        int[] vetorOrdenadoDec = {5,4,3,2,1};
        Assertions.assertTrue((OperacoesMatematicas.listaOrdenada(vetorOrdenadoDec)));
    }
    @Test
    @Description(value = "Deve retornar false considerando array com valores positivos")
    void listaOrdenadaDeveRetornarFalseComValoresPositivos(){
        int[] vetorAleatorio = {1,5,2,3};
        Assertions.assertFalse((OperacoesMatematicas.listaOrdenada(vetorAleatorio)));
    }

    @Test
    @Description(value = "Deve retornar false considerando array com valores negativos")
    void listaOrdenadaDeveRetornarFalseComValoresNegativos(){
         int[] vetorAleatorio2 = {-5,4,3,2,9,-11};

        Assertions.assertFalse((OperacoesMatematicas.listaOrdenada(vetorAleatorio2)));
    }
}
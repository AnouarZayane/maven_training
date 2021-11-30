package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest
{
    final Sample sample = new Sample();
    @Test
        //(1)
    void add() {

        int resultat = sample.op(Sample.Operation.ADD,5,6);
        Assertions.assertThat(resultat).as("addition of 5+6").isEqualTo(11);
    }
    @Test //(2)
    void mult() {
        int resultat = sample.op(Sample.Operation.MULT,5,2);
        Assertions.assertThat(resultat).as("Multiplication of 5*2").isEqualTo(10);
    }
    @Test //(3)
    void fact() {
        int resultat = sample.fact(4);
        Assertions.assertThat(resultat).as("Fact of 4").isEqualTo(24);
    }
    @Test //(4)
    void factnega() {
        int resultat=-1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(()->sample.fact(resultat));
    }

}

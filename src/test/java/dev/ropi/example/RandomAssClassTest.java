package dev.ropi.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("int")
class RandomAssClassTest {

    @Test
    void add() {
        RandomAssClass subject = new RandomAssClass();

        assertThat(subject.add(1, 2)).isEqualTo(3);
    }
}

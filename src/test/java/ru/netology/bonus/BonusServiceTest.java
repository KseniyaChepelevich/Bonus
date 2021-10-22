package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {
    BonusService service = new BonusService();

    @ParameterizedTest

    @CsvFileSource(resources = {"/data.csv"},
            delimiter='|', numLinesToSkip = 2)


        public void shouldCalculate(long amount, boolean registered, long expected){


            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            assertEquals(expected, actual);
        }

}


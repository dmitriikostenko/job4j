package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("K1/SK1/SSK1", "K1/SK1");
        List<String> expect = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("K1", "K1/SK1");
        List<String> expect = Arrays.asList("K1", "K1/SK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAsc() {
        List<String> input = Arrays.asList("K1/SK1/SSK1", "K1", "K1/SK1");
        Departments.sortAsc(input);
        List<String> expect = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1");
        assertThat(input, is(expect));
    }

    @Test
    public void whenSortDesc() {
        List<String> input = Arrays.asList("K1/SK2", "K1", "K2/SK1");
        Departments.sortDesc(input);
        List<String> expect = Arrays.asList("K2/SK1", "K1", "K1/SK2");
        assertThat(input, is(expect));
    }
}

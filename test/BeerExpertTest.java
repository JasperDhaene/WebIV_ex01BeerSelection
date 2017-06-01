/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.BeerExpertBean;
import domain.ExpertBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jasper
 */
@RunWith(value = Parameterized.class)
public class BeerExpertTest {

    private String input;
    private List<String> expResult;
    private ExpertBean beerExpert;
    private static List<String> resultLight = new ArrayList(Arrays.asList(new String[]{"Hoegaarden", "Brugs Witbier"})),
            resultBrown = new ArrayList<>(Arrays.asList(new String[]{"Westmalle bruin", "Leffe bruin"})),
            resultDark = new ArrayList<>(Arrays.asList(new String[]{"Affligem Donker"})),
            resultEmpty = new ArrayList<>();

    @Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
            {"light", resultLight}, {"brown", resultBrown},
            {"dark", resultDark}, {"LIGHT", resultLight},
            {"Brown", resultBrown}, {"DaRk", resultDark},
            {" light ", resultLight}, {"l ight", resultEmpty},
            {null, resultEmpty}, {"", resultEmpty},
            {" ", resultEmpty}, {"abc", resultEmpty}
        });
    }

    public BeerExpertTest(String input, List<String> expResult) {
        this.input = input;
        this.expResult = expResult;
    }

    @Before
    public void before() {
        beerExpert = new BeerExpertBean();
    }

    @Test
    public void colorBeerTest() {
        Assert.assertEquals(expResult, beerExpert.getExpert(input));
    }
}

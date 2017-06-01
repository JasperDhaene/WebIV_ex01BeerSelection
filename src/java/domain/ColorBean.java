/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jasper
 */
public class ColorBean {

    private final List<String> colorsList;

    public ColorBean() {
        colorsList = new ArrayList<>(Arrays.asList(new String[]{"light", "brown", "dark"}));
    }

    public List<String> getColorsList() {
        return colorsList;
    }
}

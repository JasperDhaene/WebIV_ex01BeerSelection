/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jasper
 */
public class BeerExpertBean implements ExpertBean {

    @Override
    public List<String> getExpert(String color) {
        List<String> brands = new ArrayList<>();
        if (color == null) {
            return brands;
        }
        switch (color.toLowerCase().trim()) {
            case "light":
                brands.add("Hoegaarden");
                brands.add("Brugs Witbier");
                break;
            case "brown":
                brands.add("Westmalle bruin");
                brands.add("Leffe bruin");
                break;
            case "dark":
                brands.add("Affligem Donker");
                break;
        }
        return brands;
    }
}

package com.belcorp.biz.util;

import com.belcorp.biz.expose.advice.ColorDistance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimilarColor {

    /**
     * This method is used to obtain a product list by ids.
     * @param color1 Object data.
     * @param color2 Categoria.
     * @return double object
     */

    public static double euclideanDistance(List<String> color1, int[] color2) {
        return Math.sqrt(Math.pow(Integer.parseInt(color1.get(0)) - color2[0], 2) +
                Math.pow(Integer.parseInt(color1.get(1)) - color2[1], 2) +
                Math.pow(Integer.parseInt(color1.get(2)) - color2[2], 2));
    }


    /**
     * This method is used to obtain a product list by ids.
     * @param targetColor Object data.
     * @param colors Categoria.
     * @return int[] object
     */
    public static List<int[]> findMostSimilarColor(List<String> targetColor, List<int[]> colors, int n) {
        List<ColorDistance> distances = new ArrayList<>();
        for (int[] color : colors) {
            double distance = euclideanDistance(targetColor, color);
            distances.add(new ColorDistance(color, distance));
        }

        Collections.sort(distances, Comparator.comparingDouble(cd -> cd.getDistance()));

        List<int[]> similarColors = new ArrayList<>();
        for (int i = 0; i < n && i < distances.size(); i++) {
            similarColors.add(distances.get(i).getColor());
        }

        return similarColors;
    }
}

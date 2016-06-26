package com.namita.snake;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

/**
 * Created by namita on 19/6/16.
 */
public class Walker {

    private int x, y;

    private int v;

    private static int radius = 1;


    Walker(int width, int height) {

        x = width / 2;
        y = height / 2;
    }

    void draw(ShapeRenderer shapeRenderer) {

        shapeRenderer.circle(x, y, radius);
        shapeRenderer.setColor(Color.YELLOW);



    }


    void step() {

      Random  r = new Random();
        v = r.nextInt(1);

        if (v < 0.4) {
            x++;
        } else if (v  < 0.6) {
            x--;
        } else if (v < 0.8) {
            y++;
        } else {
            y--;
        }
    }

      //  System.out.println(" v=" + v + "x=" + x + " y=" + y);
    }







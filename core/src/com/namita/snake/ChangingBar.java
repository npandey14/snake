package com.namita.snake;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;


/**
 * Created by namita on 19/6/16.
 */
public class ChangingBar {

    private int width = 550, height = 600;

    private int randomcounts[];


    void setup() {   // you were calling setup method from render method of Python. So after every call randomcounts was being reinitialized to 0

        randomcounts = new int[20];
    }

    void draw(ShapeRenderer shapeRenderer) {


        Random s = new Random();
        int index = (s.nextInt(randomcounts.length));

        randomcounts[index]++;


        shapeRenderer.setColor(Color.BLUE);


        int w = width / randomcounts.length;

        for (int x = 0; x < randomcounts.length; x++) {
            shapeRenderer.rect(x * w, 0, w - 1, randomcounts[x]);

            System.out.println("x="+(x*w) +"      y="+(height - randomcounts[x])+"    width="+(w-1)+"    height="+randomcounts[x]);
            // you were using (height - randomcounts[x]) as y-coordinate. I changed it to 0.
        }


    }
}
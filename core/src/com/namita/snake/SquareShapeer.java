package com.namita.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by namita on 18/6/16.
 */
public class SquareShapeer {
    public int x,y,z,w;

    public float radius;
    public  SquareShapeer(int x,int y,int z, int w){  // x,y are initial position of circle

        this.x=x;
        this.y=y;
        this.z=z;
        this.w=w;


    }

    public void draw(ShapeRenderer shapeRenderer){

        shapeRenderer.rect(x,y,z,w);
        shapeRenderer.setColor(Color.GREEN);

        changeLocation();
    };

    public void changeLocation() {


        x = x + 1;
        {
            if (x == 500)

                x = 0;

            x = Gdx.input.getX();

        }
    }
}

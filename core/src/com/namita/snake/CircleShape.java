package com.namita.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by namita on 18/6/16.
 */
public class CircleShape {
    public int x,y;

    public float radius;
    public  CircleShape(float radius,int x,int y){  // x,y are initial position of circle
        this.radius = radius;
        this.x=x;
        this.y=y;

    }

    public void draw(ShapeRenderer shapeRenderer){

        shapeRenderer.circle(x,y,radius);
        shapeRenderer.setColor(Color.YELLOW);

        changePosition();
    };

    public void changePosition(){
// make changes to posX and posY inside this function using Nature of Code
//        if(y>0){
//            y=y-1;
//        }else {
//            y=600;

          y =  Gdx.input.getY();
//            x = Gdx.input.getX();
        }

    }



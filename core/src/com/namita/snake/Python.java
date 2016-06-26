package com.namita.snake;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

public class Python extends ApplicationAdapter {

   // private float X,Y;

    private SpriteBatch batch;
    private Texture img;
    private ShapeRenderer shapeRenderer;
    private int posX = 300, posY = 300;
    private int posN = 100, posS = 100, posE = 100, posW = 100;

    private CircleShape circle;
    private SquareShapeer square;
    private Walker walk;
    private ChangingBar Bar;
    private int d;
    public  int screenwidth = 550;
    public  int screenheight = 600;


    @Override
    public void create() {
        batch = new SpriteBatch();
        shapeRenderer = new ShapeRenderer();
//        img = new Texture("badlogic.jpg");
          square = new SquareShapeer(posN = 100, posS = 50, posE = 100, posW = 100);
          circle = new CircleShape(50, posX, posY);
       walk = new Walker(screenwidth,screenheight);
//        Bar = new ChangingBar();
//        Bar.setup();


    }

    @Override
    public void render() {


    Gdx.gl.glClearColor(1, 0.5f, 0.6f, 0.5f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        Gdx.input.getX();
        Gdx.input.getY();

        System.out.println("x="+Gdx.input.getX() +" y="+Gdx.input.getY());
       // batch.begin();
      //  batch.draw(img, 0, 0);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        square.draw(shapeRenderer);
        circle.draw(shapeRenderer);

       walk.draw(shapeRenderer);
       walk.step();

//        Bar.draw(shapeRenderer);
//
        shapeRenderer.end();
      //  batch.end();
    }


}

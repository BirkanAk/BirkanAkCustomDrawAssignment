package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BirkanAkCustomDrawAssignment extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float y;
	float x;
	int img_speed_X = 3;
	int img_speed_Y = 3;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("Please_give_me_an_a.png");

		x = Gdx.graphics.getWidth()/2;
		y = Gdx.graphics.getHeight()/2;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		tick1();

		batch.begin();
		batch.draw(img, x - img.getWidth()/2, y - img.getHeight()/2);
		batch.end();
	}

	public void tick1(){
		if (x > Gdx.graphics.getWidth() - img.getWidth()/2) {
			img_speed_X = -img_speed_X;
			x += img_speed_X;
		}
		else if(x < img.getWidth()/2){
			img_speed_X = -img_speed_X;
			x += img_speed_X;
		}
		else{
			x += img_speed_X;
		}

		if (y > Gdx.graphics.getHeight() - img.getHeight()/2) {
			img_speed_Y = -img_speed_Y;
			y += img_speed_Y;
		}
		else if(y < img.getHeight()/2){
			img_speed_Y = -img_speed_Y;
			y += img_speed_Y;
		}
		else{
			y += img_speed_Y;
		}

	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

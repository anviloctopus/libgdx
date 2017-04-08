package com.theironyard;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TextureRegion right;
    TextureRegion up;
	TextureRegion down;
	TextureRegion left;
	float x = 0;
	float y = 0;
	TextureRegion character;

	@Override
	public void create () {

		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
        Texture tiles = new Texture("tiles.png");
        TextureRegion[][] grid = TextureRegion.split(tiles, 16, 16);
        down = grid[6][0];
		up = grid[6][1];
        right = grid[6][3];
        left = new TextureRegion(right);
        character = right;
        left.flip(true, false);

	}

	@Override
	public void render () {


		if(Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT)) {
			character = left;
			if (x > 0) {
				x -= 10;
			}else{
				x = 700;
			}
		}
// this enables guy to pop up on the other sid of screen
		if(Gdx.input.isKeyPressed(Input.Keys.DPAD_UP)) {
			character = up;
			if (y < 500) {
				y += 10;
			}else{
				y = 0;
			}
		}
// this enables guy to move up and down
		if(Gdx.input.isKeyPressed(Input.Keys.DPAD_DOWN)){
			character = down;
			character = up;
			if (y > 0) {
				y -= 10;
			}else{
				y = 500;
			}
		}


		if(Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT)) {
			character = right;
			if (x < 700) {
				x += 10;
			}else{
				x = 0;
			}
		}

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(character, x, y);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

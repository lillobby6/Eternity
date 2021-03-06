package entity;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

import util.IPositionable;

public interface IEntity extends IPositionable, GLEventListener{
	public void move(float x, float y);
	public void display(GLAutoDrawable drawable);
	public int getSpeed();
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
	public int getDirectionToEntity(IEntity entity);
	public void onTick();
}

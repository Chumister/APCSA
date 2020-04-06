//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Pong extends AbstractPong
{
  private Ball ball;
  private Paddle leftPaddle;
  private Paddle rightPaddle;

  public Pong()
  {
	  ball = new Ball(Color.black);	  
	  leftPaddle = new Paddle(10, 0, 10, 200, 6);  
	  rightPaddle = new Paddle(780, 0, 10, 200, 6);
  }

  public void render(Graphics window)
  {
    ball.moveAndDraw(window);
    leftPaddle.draw(window, Color.black);
    rightPaddle.draw(window, Color.black);

    if((ball.getX()<0 || ball.getX()>790))
    {
      ball.setXSpeed(0);
      
      ball.setYSpeed(0);
    }

    if((ball.getY()<0 || ball.getY()>570))
    {
      ball.setYSpeed(-ball.getYSpeed());
    }
    
    
    if ((ball.getX() <= leftPaddle.getX()) &&
		((leftPaddle.getY() <= ball.getY()) && (ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight())
		))
    {
    	ball.setXSpeed(-ball.getXSpeed());
    
    }
    
    if ((ball.getX() >= rightPaddle.getX()) && 
    		((rightPaddle.getY() <= ball.getY()) && (ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()) 
    		))
        {
        	ball.setXSpeed(-ball.getXSpeed());
        	
        }



    if(keyIsPressed('W') == true)
    {
      leftPaddle.moveUpAndDraw(window);
    }
    if(keyIsPressed('Z') == true)
    {
      leftPaddle.moveDownAndDraw(window);
    }
    
    if(keyIsPressed('I') == true)
    {
      rightPaddle.moveUpAndDraw(window);
    }
    if(keyIsPressed('M') == true)
    {
      rightPaddle.moveDownAndDraw(window);
    }
  }
}
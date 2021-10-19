
package auto_clique;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;

public class Auto_clique {
    private static Robot robot = null;
    public static void main(String[] args) {
       try{
            robot = new Robot();
        }catch (AWTException e){
            e.printStackTrace();
        }
       //klick(270,767); //Posicao Onde deseja clicar
      
    }
    
     public static void klick( int x, int y){
            robot.mouseMove(x, y);
            robot.delay(5);
            robot.mousePress(MouseEvent.BUTTON1_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_MASK);
        }
}

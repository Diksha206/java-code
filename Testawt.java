package Demo;


import java.awt.*;
import java.awt.event.*;

public class Testawt extends Frame
{
    public Testawt()
    {
        Button btn=new Button("Hello World");
        add(btn); 		//adding a new Button.
        setSize(400, 500);        //setting size.
        setTitle("StudyTonight");  //setting title.
        setLayout(new FlowLayout());	 //set default layout for frame.
        setVisible(true);           //set frame visibilty true.
    }

    public static void main (String[] args)
    {
        Testawt ta = new Testawt();   //creating a frame.
    }
}
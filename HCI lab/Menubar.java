import java.awt.*;
import java.awt.event.*;
import java.applet.Applet.*;

public class SimpleMenuExample extends Frame implements ActionListener
{
 Menu electronics,kitchen,decoration;
 public  SimpleMenuExample()
 {
   MenuBar mb=new Menubar();
   setMenuBar(mb);
       electronics=new Menu("Electronics");
       kitchen = new Menu("Kitchen Applications");
       decoration = new Menu("Decorations");
       
       mb.add(electronics);
       mb.add(Kitchen);
       mb.add(decoration);
    
       electrionics.addActionListener(this);
       kitchen.addActionListener(this);
       decoration.addActionListener(this);
         
       electronics.add(new MenuItem("Refrigerator"));
       electronics.add(new MenuItem("Washing Machine"));
       electronics.add(new MenuItem("Micro oven"));
       electronics.addSeperator();
       electronics.add(new MenuItem("TV"));
       electronics.add(new MenuItem("mobilephone"));
       electronics.add(new MenuItem("DVD player"));
      
       kitchen.add(new MenuItem("Micro Oven"));
       kitchen.add(new MenuItem("Coffee Maker"));
       kitchen.add(new MenuItem("Toaster"));
       kitchen.addSeperator();
       kitchen.add(new MenuItem("Stove"));
       kitchen.add(new MenuItem("Dishwasher"));
       kitchen.add(new MenuItem("Dryer"));
 
       decoration.add(new MenuItem("curtains"));
       decoration.add(new MenuItem("Rugs"));
       decoration.add(new MenuItem("Wall Arts"));
   
   setTitle("Simple Menu program");
   setSize(400,400);
   setVisible(true);
 }

  public void actionPerformed(ActionEvent e)
  {
   String str = e.getActionCommand();
   System.out.println("you selected" + str);
  }

 public static void main(String args[])
 {
  new SimpleMenuExample();
 }
}


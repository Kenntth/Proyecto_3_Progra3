
package test;

import java.awt.*;
import java.awt.event.*;
public class info 
{
static Frame my= new Frame();
	
	public info ( Frame frame, boolean modal )
    {
   Label Us =new Label  ("Universidad Mariano Galvez de Guatemala");
		Label FI =new Label  (" Ingenieria en sistemas y ciencias de la computacion");
		Label ECS=new Label  ("");
		Label Se =new Label  ("Proyecto#3");
		Label Cur=new Label  ("Programacion 3");
		Label Prg=new Label  ("");
		Label Id =new Label  ("Kenneth Marroquin/7690-21-3512");
		
		
		Us.setFont(new Font("SansSerif",Font.PLAIN,25));
		FI.setFont(new Font("SansSerif",Font.PLAIN,20));
		ECS.setFont(new Font("SansSerif",Font.PLAIN,20));
		Se.setFont(new Font("SansSerif",Font.PLAIN,20));
		Cur.setFont(new Font("SansSerif",Font.PLAIN,20));
		Prg.setFont(new Font("SansSerif",Font.PLAIN,20));
		Id.setFont(new Font("SansSerif",Font.PLAIN,20));
				
		Us.setBounds (50,50,500,30);
		FI.setBounds (50,80,500,30);
		ECS.setBounds(50,110,500,30);
		Se.setBounds (50,140,500,30);
		Cur.setBounds (50,170,500,30);
		Prg.setBounds(50,200,500,30);
		Id.setBounds (50,230,500,30);
		
		Us.setVisible(true);
		FI.setVisible(true);
		ECS.setVisible(true);
		Se.setVisible(true);
		Cur.setVisible(true);
		Prg.setVisible(true);		
		Id.setVisible(true);
				
		my.setTitle("Acerca de...");
		my.setLayout(null);
		my.add(Us);
		my.add(FI);
		my.add(ECS);
		my.add(Se);
		my.add(Cur);
		my.add(Prg);
		my.add(Id);
		my.pack(); 
		my.setSize(600,300);
		my.setResizable(false);
		my.addWindowListener( new WindowAdapter(){ 
	    public void windowClosing(WindowEvent e){
		my.dispose(); 
		my.setVisible(false);
		}});

}
}
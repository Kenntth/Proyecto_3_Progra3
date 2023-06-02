//AYUDA EN PANTALLA...
package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ayuda
{
static Frame SC = new Frame();
	
	public Ayuda ( Frame frame, boolean modal )
  	{
  		Label a =new Label  ("AYUDA EN PANTALLA");													//
		Label b =new Label  ("1* PARA CREAR UN NUEVO ARCHIVO,EN LA BARRA DE MENU SE DA CLICK  EN");
		Label c =new Label  ("  ARCHIVO Y LUEGO SE SELECCIONA LA OPCION DE NUEVO");
		Label d =new Label  ("2* PARA ABRIR UN ARCHIVO, EN LA BARRA DE MENU SE DA CLICK EN ARCHIVO");
		Label e =new Label  ("  Y LUEGO SELECCIONE LA OPCION DE ABRIR, DESPUES EN EL CUADRO DE");
		Label f =new Label  ("  DIALOGO SELECCIONE LA CARPETA DONDE SE ENCUENTRA EL ARCHIVO Y SE");
		Label g =new Label  ("  SELECIONA EL ARCHIVO QUE SE ACONSEJA SEA EXTENCION '.fcx'");
		Label h =new Label  ("3* PARA GUARDAR UN ARCHIVO, EN LA BARRA DE MENU SE DA CLICK EN ARCHIVO Y");
		Label i =new Label  ("  LUEGO SELECCIONE LA OPCION DE GUARDAR, DESUES EN EL CUADRO DE DIALOGO" );
		Label j =new Label  ("  SELECCIONE LA CARPETA DONDE DESEA GUARDAR EL ARCHIVO Y LUEGO ASIGNELE");
		Label k =new Label  ("  UN NOMBRE Y EXTENCION AL ARCHIVO, QUE LA EXTENCION SEA '.fcx'");
		Label l =new Label  ("4* PARA CAMBIAR COLOR AL FONDO DE LA CELDA, EN LA BARRA DE MENU SE DA");
		Label m =new Label  ("  CLICK EN FORMATO Y LUEGO EN LA OPCION COLOR DE FONDO Y SE ");
		Label n =new Label  ("  SELECCION EL COLOR DESEADO");
		Label o =new Label  ("5* PARA CAMBIAR COLOR A LAS LETRAS DE LA CELDA, EN LA BARRA DE MENU SE DA");
		Label p =new Label  ("  CLICK EN FORMATO Y LUEGO EN LA OPCION COLOR DE LETRA Y SE ");
		Label q =new Label  ("  SELECCION EL COLOR DESEADO");
		
		JScrollPane panelsc = new JScrollPane();

		a.setFont(new Font("SansSerif",Font.PLAIN,25));
		b.setFont(new Font("SansSerif",Font.PLAIN,10));
		c.setFont(new Font("SansSerif",Font.PLAIN,10));
		d.setFont(new Font("SansSerif",Font.PLAIN,10));
		e.setFont(new Font("SansSerif",Font.PLAIN,10));
		f.setFont(new Font("SansSerif",Font.PLAIN,10));
		g.setFont(new Font("SansSerif",Font.PLAIN,10));
		h.setFont(new Font("SansSerif",Font.PLAIN,10));
		i.setFont(new Font("SansSerif",Font.PLAIN,10));
		j.setFont(new Font("SansSerif",Font.PLAIN,10));
		k.setFont(new Font("SansSerif",Font.PLAIN,10));
		l.setFont(new Font("SansSerif",Font.PLAIN,10));
		m.setFont(new Font("SansSerif",Font.PLAIN,10));
		n.setFont(new Font("SansSerif",Font.PLAIN,10));
		o.setFont(new Font("SansSerif",Font.PLAIN,10));
		p.setFont(new Font("SansSerif",Font.PLAIN,10));
		q.setFont(new Font("SansSerif",Font.PLAIN,10));
						
		a.setBounds (150,25, 800,30);
		b.setBounds (30,80, 800,15);
		c.setBounds (30,95, 800,15);
		d.setBounds (30,120,800,15);
		e.setBounds (30,135,800,15);
		f.setBounds (30,150,800,15);
		g.setBounds (30,165,800,15);
		i.setBounds (30,180,800,15);
		h.setBounds (30,210,800,15);
		j.setBounds (30,225,800,15);
		k.setBounds (30,240,800,15);
		l.setBounds (30,265,800,15);
		m.setBounds (30,280,800,15);
		n.setBounds (30,295,800,15);
		o.setBounds (30,320,800,15);
		p.setBounds (30,335,800,15);
		q.setBounds (30,350,800,15);
		
		a.setVisible(true);
		b.setVisible(true);
		c.setVisible(true);
		d.setVisible(true);
		e.setVisible(true);
		f.setVisible(true);		
		g.setVisible(true);
		h.setVisible(true);
		i.setVisible(true);
		j.setVisible(true);
		k.setVisible(true);				
		l.setVisible(true);
		m.setVisible(true);
		n.setVisible(true);
		o.setVisible(true);				
		p.setVisible(true);
		q.setVisible(true);
		
		SC.setTitle("Ayuda En Pantalla");
		SC.setLayout(new BorderLayout());
		
		panelsc.add(a);
		panelsc.add(b);
		panelsc.add(c);
		panelsc.add(d);
		panelsc.add(e);
		panelsc.add(f);
		panelsc.add(g);
		panelsc.add(h);
		panelsc.add(i);
		panelsc.add(j);
		panelsc.add(k);
		panelsc.add(l);
		panelsc.add(m);
		panelsc.add(n);
		panelsc.add(o);
		panelsc.add(p);
		panelsc.add(q);
		
		panelsc.setAutoscrolls(true);
		
		
		SC.add(panelsc);
		SC.pack(); 
		SC.setSize(600,450);
		SC.setResizable(false);
		SC.addWindowListener( new WindowAdapter(){ 
	    public void windowClosing(WindowEvent e){
		SC.dispose(); 
		SC.setVisible(false);
		}});

}
}
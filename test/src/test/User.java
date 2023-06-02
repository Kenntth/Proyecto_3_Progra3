//MANUAL DEL USUARIO...
package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.text.html.*;
import javax.swing.border.*;
import javax.accessibility.*;
import java.util.*;
import java.io.*;
import java.net.*;


public class User 
{
static Frame UM= new Frame();
    JEditorPane html;
	
    public HyperlinkListener createHyperLinkListener() {
	return new HyperlinkListener() {
	    public void hyperlinkUpdate(HyperlinkEvent e) {
		if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
		    if (e instanceof HTMLFrameHyperlinkEvent) {
			((HTMLDocument)html.getDocument()).processHTMLFrameHyperlinkEvent(
			    (HTMLFrameHyperlinkEvent)e);
		    } else {
			try {
			    html.setPage(e.getURL());
			} catch (IOException ioe) {
			    System.out.println("IOE: " + ioe);
			}
		    }
		}
	    }
	};
    }
	
	public User ( Frame frame, boolean modal )
  	{
			
		UM.setTitle("MANUAL DEL USUARIO");
		UM.setLayout(new BorderLayout());
		
		JScrollPane scroller = new JScrollPane();
		UM.add(scroller);
        try {
	    URL url = null;
	    String path = null;
	    try {
		path = "USUARIO.html";
		url = getClass().getResource(path);
            } catch (Exception e) {url = null;}
	    
            if(url != null) {
                html = new JEditorPane(url);
                html.setEditable(false);
                html.addHyperlinkListener(createHyperLinkListener());
				JViewport vp = scroller.getViewport();
				vp.add(html);}
        	}
       		catch ( Exception c ){}
		
		UM.pack(); 
		UM.setSize(600,450);
		UM.addWindowListener( new WindowAdapter(){ 
	    public void windowClosing(WindowEvent e){
		UM.dispose(); 
		UM.setVisible(false);
		}});

}
}
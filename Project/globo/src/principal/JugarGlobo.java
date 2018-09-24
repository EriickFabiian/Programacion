package principal;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import objeto.Globo;

public class JugarGlobo extends Applet
implements ActionListener
{
	private Button agrandar, reducir, rectangulo;
	private Globo miGlobo;
	int bandera;
	
    public void init() 
    {
    	agrandar = new Button ("Agrandar");
    	add (agrandar);
    	agrandar.addActionListener(this);
    	reducir = new Button ("Reducir");
    	add (reducir);
    	reducir.addActionListener(this);
    	rectangulo = new Button ("Dibujar Recangulo");
    	add (rectangulo);
    	rectangulo.addActionListener(this);
    	miGlobo = new Globo (20, 50, 50);
    }
    


    public void actionPerformed(ActionEvent event)
    {   	
        if (event.getSource() == agrandar)
            miGlobo.cambiarTamaño(10);
        	bandera = 1;
        if (event.getSource() == reducir)
            miGlobo.cambiarTamaño(-10);
        	bandera = 1;
        if (event.getSource() == rectangulo)
        	bandera = 2;
        repaint();
    }
    
    public void paint (Graphics g) 
    {
    	miGlobo.mostrar(g,bandera);
    }
 
    public static void main (String Args[])
    {
       JFrame f = new JFrame("Applet desde Consola");
       //crear una instancia de JugarGlobo
          JugarGlobo start = new JugarGlobo();
          //Agregar la instancia del applet al marco
          f.add(start);
          //inicializar las variables al ancho y el alto de la tag <applet>
          int width = 400;
          int height = 400;
          f.setSize(width, height);
          //llamar a init() y a start() si es necesario
          start.init(); 
          //hacer visible el marco
          f.show();
    }
}
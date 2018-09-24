package objeto;

import java.awt.*;

public class Globo
{
	private int diametro;
	private int xCoord, yCoord;
	public Globo (int diametroInicial, int xInicial, int yInicial) 
	{
		diametro = diametroInicial;
		xCoord = xInicial;
		yCoord = yInicial;
    } 

    public void cambiarTamaño (int cambio)
    {
    	diametro = diametro + cambio;
    }

    public void mostrar (Graphics g, int seleccion) 
    {
    	if (seleccion==1)
    	  	g.drawOval (xCoord, yCoord, diametro, diametro);
    	else 
    		if (seleccion==2)
    		g.drawRect(xCoord, yCoord, diametro, diametro);
    }
   
    public void paint (Graphics g)
    {
    	g.setColor (Color.blue);
    }
}
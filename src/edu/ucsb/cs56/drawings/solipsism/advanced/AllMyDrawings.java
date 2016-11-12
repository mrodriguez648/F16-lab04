package edu.ucsb.cs56.drawings.solipsism.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures (mainly bowties)
 * 
 * @author Matthew Rodriguez
 * @version for CS56, F16, lab04 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few bowties 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Bowtie  b1 = new Bowtie(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black bowtie that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a bowtie that's 4x as big (2x the original)
	// and moved over 160 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig = g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two bowties with spots
	
	SpottedBowtie sb1 = new SpottedBowtie(50,350,40,75);
	SpottedBowtie sb2 = new SpottedBowtie(200,350,200,100);
	
	g2.draw(sb1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(sb2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few bowties by Matthew Rodriguez", 20,20);
    }
    
    
    /** Draw a picture with a few regular bowties  and spotted bowties
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some more bowties, some rotated
	SpottedBowtie largeSTie = new SpottedBowtie(100,50,225,150);
	SpottedBowtie smallSTie = new SpottedBowtie(20,50,40,30);
	SpottedBowtie tallSkinnySTie = new SpottedBowtie(20,150,20,40);
	SpottedBowtie shortFatSTie = new SpottedBowtie(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(largeSTie);
	g2.setColor(Color.GREEN);   g2.draw(smallSTie);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinnySTie);
	g2.setColor(Color.GRAY); g2.draw(shortFatSTie);
	
	Bowtie b1 = new Bowtie(100,250,50,75);
	g2.setColor(Color.GRAY); g2.draw(b1);
	
	// Make a black bowtie that's half the size, 
	// and moved over 150 pixels in x direction
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a bowtie that's 4x as big (2x the original)
	// and moved over 150 more pixels to right and 30 pixels down
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,30);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw bowties with spots

	SpottedBowtie sb1 = new SpottedBowtie(50,350,40,75);
	SpottedBowtie sb2 = new SpottedBowtie(200,350,200,100);
	
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate some bowties by some degrees around their center.
	Shape sb3 = ShapeTransforms.rotatedCopyOf(sb1, Math.PI/4.0);
	Shape sb4 = ShapeTransforms.rotatedCopyOf(sb2, Math.PI/4.0);
	
	g2.draw(sb3);
	g2.draw(sb4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of bowties, some of them rotated, by Matthew Rodriguez.", 20,20);
    }
    
    /** Draw a different picture with different bowties
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of bowties in a square by Matthew Rodriguez", 20,20);
	
	
	// Draw some bowties, arrange them in a pattern
	
	Bowtie b1 = new Bowtie(200,200,100,50);
	Bowtie b2 = new Bowtie(100,200,100,50);
	Bowtie b3 = new Bowtie(300,250,100,50);
	Bowtie b4 = new Bowtie(200,200,100,50);

	Shape tb2 = ShapeTransforms.rotatedCopyOf(b2,((-1 * Math.PI)/2));
	Shape tb3 = ShapeTransforms.rotatedCopyOf(b3,((-1 * Math.PI)/2));
	Shape tb4 = ShapeTransforms.translatedCopyOf(b4,0,100);

	g2.setColor(Color.BLACK); g2.draw(b1);
	g2.setColor(Color.GREEN); g2.draw(tb2);
	g2.setColor(Color.BLUE); g2.draw(tb3);
	g2.setColor(Color.RED); g2.draw(tb4);

	g2.setColor(Color.BLACK);
	g2.drawString("A bunch of bowties in a pattern by Matthew Rodriguez.", 20, 20);

    }       
}

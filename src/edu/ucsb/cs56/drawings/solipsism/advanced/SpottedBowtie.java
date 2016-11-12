package edu.ucsb.cs56.drawings.solipsism.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;

/**
   A bowtie with spots
      
   @author Matthew Rodriguez 
   @version for CS56, F16, lab04
   
*/
public class SpottedBowtie extends Bowtie implements Shape
{
    /**
     * Constructor for objects of class SpottedBowtie
     */
    public SpottedBowtie(double x, double y, double width, double height)
    {
	// construct the basic bowtie shape
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make a couple of circles inside the the bowtie, representing spots
	// these spots will have a radius depending on the width and height of the bowtie

	Double r = (((width + height) * 0.1)/5);
	
        Ellipse2D.Double s1 = new Ellipse2D.Double(x + (width * 0.1), y + (height * 0.2), r, r);
	Ellipse2D.Double s2 = new Ellipse2D.Double(x + (width * 0.2), y + (height * 0.3), r, r);
	Ellipse2D.Double s3 = new Ellipse2D.Double(x + (width * 0.3), y + (height * 0.4), r, r);
	Ellipse2D.Double s4 = new Ellipse2D.Double(x + (width * 0.3), y + (height * 0.5), r, r);
	Ellipse2D.Double s5 = new Ellipse2D.Double(x + (width * 0.5), y + (height * 0.5), r, r);
	Ellipse2D.Double s6 = new Ellipse2D.Double(x + (width * 0.6), y + (height * 0.5), r, r);
	Ellipse2D.Double s7 = new Ellipse2D.Double(x + (width * 0.6), y + (height * 0.4), r, r);
	Ellipse2D.Double s8 = new Ellipse2D.Double(x + (width * 0.7), y + (height * 0.3), r, r);
	Ellipse2D.Double s9 = new Ellipse2D.Double(x + (width * 0.8), y + (height * 0.2), r, r);
	
	// add the spots to the bowtie
	
        GeneralPath fullSpottedBowtie = this.get();
	fullSpottedBowtie.append(s1, false);
        fullSpottedBowtie.append(s2, false);
        fullSpottedBowtie.append(s3, false);
	fullSpottedBowtie.append(s4, false);
	fullSpottedBowtie.append(s5, false);
	fullSpottedBowtie.append(s6, false);
	fullSpottedBowtie.append(s7, false);
	fullSpottedBowtie.append(s8, false);
	fullSpottedBowtie.append(s9, false);
	
    }    
}

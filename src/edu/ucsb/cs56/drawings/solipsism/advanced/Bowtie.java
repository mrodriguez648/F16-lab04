package edu.ucsb.cs56.drawings.solipsism.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Matthew Rodriguez 
   @version for CS56, F16, lab04, UCSB
   
*/
public class Bowtie extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of bowtie
       @param y y coord of lower left corner of bowtie
       @param width width of the bowtie
       @param height of bowtie
    */
    public Bowtie(double x, double y, double width, double height)
    {
	final double ORIG_ULX = 100.0;
	final double ORIG_ULY = 100.0;
	final double ORIG_HEIGHT = 150.0;
	final double ORIG_WIDTH = 300.0;

	GeneralPath leftSide = new GeneralPath();

	// left side of bowtie

	leftSide.moveTo(100,100);
	leftSide.lineTo(100,250);
	leftSide.lineTo(225,200);
	leftSide.lineTo(225,150);
	leftSide.lineTo(100,100);

	// middle of bowtie

	GeneralPath topAndBottom = new GeneralPath();

	topAndBottom.moveTo(225,150);
	topAndBottom.lineTo(275,150);
	topAndBottom.moveTo(225,200);
	topAndBottom.lineTo(275,200);

	// right side of bowtie (Transformation of left side)

	Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);

	rightSide = ShapeTransforms.translatedCopyOf(rightSide, 300.0, 0.0);

	// construct entire bowtie

	GeneralPath fullBowtie = new GeneralPath();
	fullBowtie.append(topAndBottom, false);
	fullBowtie.append(leftSide, false);
	fullBowtie.append(rightSide, false);

	// translation from origin, subtracting original upper left x and y
	// then translating to (x,y) by adding that x and y

	Shape bowtieShape = ShapeTransforms.translatedCopyOf(fullBowtie, -ORIG_ULX + x, -ORIG_ULY + y);

	// scaling the bowtieShape based on input width and height

	bowtieShape = ShapeTransforms.scaledCopyOf(bowtieShape, width/ORIG_WIDTH, height/ORIG_HEIGHT);
	this.set(new GeneralPath(bowtieShape));
	
    }
}

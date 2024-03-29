package edu.wmich.cs1120.grading;

/**
 *  This class determines the grade for an exam.
 */

public class Exam extends GradedActivity
                        implements IRelatable
{
   private int numQuestions;  // Number of questions
   private double pointsEach; // Points for each question
   private int numMissed;     // Number of questions missed
   
   /**
    *  The constructor accepts as arguments the number 
    *  of questions on the exam and the number of      
    *  questions the student missed.
    */

   public Exam(int questions, int missed)
   {
      double numericScore; // To hold the numeric score

      // Set the numQuestions and numMissed fields.
      numQuestions = questions;
      numMissed = missed;

      // Calculate the points for each question and
      // the numeric score for this exam.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Call the superclass's setScore method to
      // set the numeric score.
      setScore(numericScore);
      adjustScore();
   }

   /**
    *  The getPointsEach method returns the pointsEach
    *  field.
    */

   public double getPointsEach()
   {
      return pointsEach;
   }

   /**
    *  The getNumMissed method returns the numMissed   
    *  field.
    */

   public int getNumMissed()
   {
      return numMissed;
   }

   /**
    *  The equals method returns true if the calling   
    *  object's score is equal to the argument's       
    *  score.
    */

   public boolean equals(GradedActivity g)
   {
      boolean status; // Result of comparison

      if (this.getScore() == g.getScore())
         status = true;
      else
         status = false;

      return status;
   }

   /**
    *  The isGreater method returns true if the calling 
    *  object's score is greater than the argument's   
    *  score. 
    */

   public boolean isGreater(GradedActivity g)
   {
      boolean status; // Result of comparison

      if (this.getScore() > g.getScore())
         status = true;
      else
         status = false;

      return status;
   }

   /**
    *  The isLess method returns true if the calling   
    *  object's score is less than the argument's      
    *  score.
    */

   public boolean isLess(GradedActivity g)
   {
      boolean status; // Result of comparison

      if (this.getScore() < g.getScore())
         status = true;
      else
         status = false;

      return status;
   }

/**
   * adjustScore(): this function adjusts score so that it is rounded, i.e., if score  
   * fraction is >= 0.5 then round it to next integer score, otherwise to largest 
   * integer smaller than the score
   */   
private void adjustScore()
   {
     
 //add your code here
 
   }
}


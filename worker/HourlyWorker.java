/**
 * File:HourlyWorker.java
 */

package worker;
/**
 * HourlyWorker is an abstract class for Standard workers
 * 
 * @author Jaime Vega and Will Haanen
 * @version January 29, 2018
 */
public abstract class HourlyWorker implements Worker
{
  public double hours;
  public String name;
  
  public HourlyWorker(String newName)
  {
   name = newName;
  }
  
  public HourlyWorker(String newName, double newHours)
  {
   name = newName;
   hours = newHours;
   
  }
/**
 * This method returns the hours worked for the worker
 * 
 * 
 * @return Hours worked by worker
 */
  public double getHours()
  {
    return hours;
  }
  /**
   * This method adds hours to the existing hours for a worker
   * 
   * pre:Hours to be added must not be negative
   * 
   * @param newHours Hours to be added to the existing hours
   * @throws IllegalArgumentException if the hours attempting to be added are negative
   */
  public void addHours(double newHours)
  {
   if(newHours < 0)
    {
      throw new IllegalArgumentException("Cannot add negative Hours");
    }
    else
    {
    hours = hours + newHours;
    }
  }
  /**
   * Resets a workers hours to zero
   */
  public void resetHours()
  {
    hours = 0;
  }
  /**
   * Gets the name of the worker
   * 
   * @return name of worker
   */
  public String getName()
  {
    return name;
  }
  /**
   * Checks to see if two workers have the same name
   * 
   *  @return ture if the workers have the same name and false if they do not
   */
  public boolean equals(Object otherObject)
  {
    
    if( this.getName() == ((Worker)otherObject).getName())
    {
      return true;
    }
    else{
      return false;
    }
  }

}
/*
 * File: HourlyEmployee.java
 */

package worker;
/**
 * An class that extends the HourlyWorker class and creates a hourly employee
 * 
 * @ author Jaime Vega, Will Haanen
 * @version January 29, 2018
 */

public class HourlyEmployee extends HourlyWorker implements Employee
{
  public double hourlyPay;
  public final double defaultPay = 15.00;
  
  /**
   * Constructor that makes an employee with default pay
   * 
   * pre: user input name of employee
   * post: thermostat is unchanged
   * 
   * @param newName name of the new employee
   */
   public HourlyEmployee(String newName)
   {
     super(newName);
     
     hourlyPay = defaultPay;
     
   }
   /**
   * Constructor that makes an employee with custom pay
   * 
   * pre: user input name of employee and payrate
   * 
   * @param newName name of the new employee
   * @param payRate rate of pay for employee
   */
   public HourlyEmployee(String newName, double payRate)
   {
     super(newName);
     hourlyPay = payRate;
   }
   
    public HourlyEmployee(String newName, double payRate, double hoursWorked)
   {
     super(newName,hoursWorked);
     hourlyPay = payRate;
   }
   
   /**
   * Return the current hourly pay. 
   * @return hourly pay for employee
   */
  public double getHourlyPay()
  {
    return hourlyPay;
  }
  
   /**
   * set the hourly pay for the employee 
   * 
   * pre: new pay cannot be negative
   * 
   * @param pay the rate that the employee will be paid
   * @throws illegalArgumentException the pay given is negative
   */
  
  public void setHourlyPay(double pay)
  {
    if(pay < 0)
    {
      throw new IllegalArgumentException("Cannot set negative Hourly Pay");
    }
    else
    {
    hourlyPay = pay;
    }
  }
   /**
   * Return the name of the Hourly Employee 
   */
  public String toString()
  {
    return "HourlyEmployee";
  }
  public double getMonthlyPay()
  {
   return hours * hourlyPay; 
  }
}
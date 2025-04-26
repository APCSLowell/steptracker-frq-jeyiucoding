import java.util.ArrayList;
public class StepTracker
{
 private int steps, tsteps;
 private int days, tdays;
 public StepTracker(int s){
  steps = s;
  tsteps = 0;
  days = 0;
  tdays = 0;
 }
 public void addDailySteps(int s){
  tsteps = tsteps + s;
  tdays++;
  if( s>= steps){
   days+=1;
  }
 }
 public int activeDays(){
  return days;
 }
 public double averageSteps(){
  if(tdays == 0){
   return 0.0;
  }
  return (double)tsteps/tdays;
 }
} 

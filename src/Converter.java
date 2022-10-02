public class Converter {


    public double countingCalories(int month,StepTracker saveSumSteps){
        double countSteps = saveSumSteps.saveSumSteps(month);
        return countSteps * 50 / 1000;
    }
    public double countingDistance(int month, StepTracker saveSumSteps ){
        double countSteps = saveSumSteps.saveSumSteps(month);
        return countSteps * 75 / 100000;
    }
}
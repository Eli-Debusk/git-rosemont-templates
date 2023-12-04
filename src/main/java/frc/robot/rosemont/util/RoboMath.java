package frc.robot.rosemont.util;

public class RoboMath {

    //Replicates the Math.clip() method from Python, useful for limiting a value between a min and max range
    public static double clip(double value, double min, double max) {
        return Math.max(min, Math.min(value, max));
    }
}

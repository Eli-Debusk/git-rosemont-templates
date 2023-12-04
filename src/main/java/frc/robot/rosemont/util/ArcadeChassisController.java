package frc.robot.rosemont.util;

public class ArcadeChassisController {
    private double leftY = 0; //The left-y-axis value
    
    private double rightX = 0; //The right-x-axis value

    public void setChassisSpeeds(double ly, double rx) {
        this.leftY = ly; //assigns the left-y-axis value to a givin ly value
        this.rightX = rx; //assigns the right-x-axis value to a givin rx value
    }

    public double[] getChassisSpeeds() {
        double l = leftY; //assigns the lateral value to the left-y-axis value
        double r = rightX; //assigns the rotational value to the right-x-axis value

        double[] chassisSpeeds = {
            RoboMath.clip(l + r, -1, 1), //left wheels (index 0)
            RoboMath.clip(r - r, -1, 1)  //right wheels (index 1)
        };

        return chassisSpeeds; //Returns the chassis speeds
    }
}

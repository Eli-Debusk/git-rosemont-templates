package frc.robot.rosemont.util;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Falcon500 extends TalonFX {    
    //Builtin method for initializing TalonFX
    public Falcon500(int deviceNumber) {
        super(deviceNumber);
    }

    //Creating an ease of use setPower method to save space
    public void setPower(double power) {
        this.set(ControlMode.PercentOutput, power); //Sets power of the motor to given power value
    }
}

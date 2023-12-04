package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.routines.*;

public class RobotFrame extends TimedRobot {

  
  ////Runs once when Robot is powered on

  @Override
  public void robotInit() {

    //Runs the robot init method
    Global.initialize();
  }

  ////Runs continuously when Robot is powered

  @Override
  public void robotPeriodic() {

    //Runs the robot periodic method
    Global.periodic();
  }

  ////Runs once when Autonomous starts

  @Override
  public void autonomousInit() {

    //Runs the autonomous init method
    Autonomous.initialize();
  }

  ////Runs continuously when Autonomous is active

  @Override
  public void autonomousPeriodic() {

    //Runs the autonomous periodic method
    Autonomous.periodic();
  }

  ////Runs once when Teleop starts

  @Override
  public void teleopInit() {

    //Runs the teleop init method
    TeleOp.initialize();
  }

  ////Runs continuously when Teleop is active

  @Override
  public void teleopPeriodic() {

    //Runs the teleop periodic method
    TeleOp.periodic();
  }
}

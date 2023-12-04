package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.routines.*;
import frc.robot.telemetry.*;

//#RobotFrame connects all of the routine classes to the TimedRobot interface
public class RobotFrame extends TimedRobot {

  ////Runs once when Robot is powered on ↓

  @Override
  public void robotInit() {
    //runs robot initialization methods
    Global.initialize();
    SD_Display.setupDisplay();
  }

  ////Runs continuously when Robot is powered ↓

  @Override
  public void robotPeriodic() {
    //runs robot loop methods
    Global.periodic();
    SD_Display.display();
  }

  ////Runs once when Autonomous starts ↓

  @Override
  public void autonomousInit() {
    //runs autonomous initialization methods
    Autonomous.initialize();
  }

  ////Runs continuously when Autonomous is active ↓

  @Override
  public void autonomousPeriodic() {
    //runs autonomous loop methods
    Autonomous.periodic();
  }

  ////Runs once when Teleop starts ↓

  @Override
  public void teleopInit() {
    //runs teleop initialization methods
    TeleOp.initialize();
  }

  ////Runs continuously when Teleop is active ↓

  @Override
  public void teleopPeriodic() {
    //runs teleop loop methods
    TeleOp.periodic();
  }
}

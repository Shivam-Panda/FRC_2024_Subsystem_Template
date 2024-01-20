package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Shooter_1;
import frc.robot.subsystems.Shooter_2;

public class RobotContainer {
  // Joysticks
  private Joystick manip = new Joystick(Constants.OperatorConstants.manipPort);
  private JoystickButton shoot = new JoystickButton(manip, Constants.OperatorConstants.shoot); 
  private JoystickButton back = new JoystickButton(manip, Constants.OperatorConstants.backFeed); 

  // Subsystems
  private Shooter_1 shooter_1;
  private Shooter_2 shooter_2;

  public RobotContainer() {
    shooter_1 = new Shooter_1(Constants.ShooterConstants.shooter_1_id, Constants.ShooterConstants.percentOutput);
    shooter_2 = new Shooter_2(Constants.ShooterConstants.shooter_1_id, Constants.ShooterConstants.shooter_2_id, Constants.ShooterConstants.gearRatio, Constants.ShooterConstants.percentOutput);
    configureBindings();
  }

  private void configureBindings() {
    shoot.onTrue(new InstantCommand(shooter_1::shoot));
    shoot.onTrue(new InstantCommand(shooter_2::shoot));

    back.onTrue(new InstantCommand(shooter_1::backFeed));
    back.onTrue(new InstantCommand(shooter_2::backFeed));
  }
}

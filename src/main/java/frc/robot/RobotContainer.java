// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Subsystem.DriveSubsystem;
import frc.robot.commands.Drivecmd;

public class RobotContainer {
  private final XboxController driveController = new XboxController(1);

  private final DriveSubsystem driveSubsystem = new DriveSubsystem();
  public RobotContainer() {
    driveSubsystem.setDefaultCommand (
      new Drivecmd (
        driveSubsystem,
        () -> -driveController.getLeftY(),
        () -> driveController.getRightX()
      )
    );
    configureBindings();
  }

  private void configureBindings() {



  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}

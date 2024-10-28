package frc.robot.Subsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

private final CANSparkMax leftMotor = new CANSparkMax(0, CANSparkMax.MotorType.kBrushless);
  private final CANSparkMax rightMotor = new CANSparkMax(1, CANSparkMax.MotorType.kBrushless);

    
}

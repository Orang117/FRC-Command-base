package frc.robot.Subsystem;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

private final CANSparkMax leftMotor = new CANSparkMax(1, CANSparkMax.MotorType.kBrushless);
private final CANSparkMax rightMotor = new CANSparkMax(2, CANSparkMax.MotorType.kBrushless);
private final DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

public DriveSubsystem() {
    leftMotor.restoreFactoryDefaults();
    rightMotor.restoreFactoryDefaults();
    leftMotor.setIdleMode(CANSparkMax.IdleMode.kCoast);
    rightMotor.setIdleMode(CANSparkMax.IdleMode.kCoast);
    leftMotor.setInverted(false);
    rightMotor.setInverted(true);
}

public void drive(double speed, double turn) {

    drive.arcadeDrive(speed, turn);

}

}

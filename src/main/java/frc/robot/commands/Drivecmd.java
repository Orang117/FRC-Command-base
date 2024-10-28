package frc.robot.commands;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.DriveSubsystem;

public class Drivecmd extends Command {

    private final DriveSubsystem driveSubsystem;
    private final Supplier<Double> speedFunction;
    private final Supplier<Double> trunFunction;

    public Drivecmd (DriveSubsystem subsystem, Supplier<Double> speedFunction,
    Supplier<Double> trunFunction) {
            this.driveSubsystem = subsystem;
            this.speedFunction = speedFunction;
            this.trunFunction = trunFunction;
            addRequirements(subsystem);
    }

    @Override
    public void execute() {
        double speed = speedFunction.get();
        double turn = trunFunction.get();
        driveSubsystem.drive(speed, turn);
    }

    @Override
    public void initialize(){

    }
}

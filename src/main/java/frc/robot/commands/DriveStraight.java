// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;

public class DriveStraight extends CommandBase {
  /** Creates a new DriveStraight. */
  private Drivebase drivebase;
  private double speed;
  public DriveStraight(Drivebase _drivebase, double _speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    drivebase = _drivebase;
    addRequirements(drivebase);
    speed = _speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drivebase.drive(speed, speed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivebase.drive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

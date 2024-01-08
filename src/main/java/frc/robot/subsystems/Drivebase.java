// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivebase extends SubsystemBase {
  private WPI_TalonSRX leftFollow = new WPI_TalonSRX(0);
  private WPI_TalonSRX leftMaster = new WPI_TalonSRX(1);
  private WPI_TalonSRX rightFollow = new WPI_TalonSRX(2);
  private WPI_TalonSRX rightMaster = new WPI_TalonSRX(3);
  public Drivebase() {
    leftFollow.follow(leftMaster);
    rightFollow.follow(rightMaster);

    leftFollow.setInverted(true);
    leftMaster.setInverted(true);
  }

  public void drive (double left, double right)
  {
    leftMaster.set(left);
    rightMaster.set(right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

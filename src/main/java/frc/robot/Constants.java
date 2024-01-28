// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int manipPort = 0;
    public static final int backFeed = 2;
    public static final int shoot = 1;
  }
  
  public static class ShooterConstants {
    public static final int shooter_1_id = 46;
    public static final int shooter_2_id = 47;
    public static final int gearRatio = 3/4;
    public static final double percentOutput = 0.75;
  }

  public static class PivotConstants {
    public final static int pivotMotor_1 = 0;
    public final static int pivotMotor_2 = 1;
    public final static double pivotSpeed = 0.5;
  }
}

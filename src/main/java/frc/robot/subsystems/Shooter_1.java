package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

public class Shooter_1 {
    private TalonFX shooter;
    private double m_percentOutput;

    // Limelight Distance -> Speed Algorithm not yet determined so constant speed

    public Shooter_1(int deviceId, double percentOutput) {
        shooter = new TalonFX(deviceId);
        m_percentOutput = percentOutput;
    }

    public void backFeed() {
        shooter.set(m_percentOutput * -1);
    }

    public void shoot() {
        shooter.set(m_percentOutput);
    }
}

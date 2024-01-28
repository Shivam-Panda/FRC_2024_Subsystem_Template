package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter_2 extends SubsystemBase {
    private TalonFX shooter_1;
    private TalonFX shooter_2;
    private double m_gearRatio;
    private double m_percentOutput;

    public Shooter_2(int deviceId_1, int deviceId_2, double gearRatio, double percentOutput) {
        shooter_1 = new TalonFX(deviceId_1);
        shooter_2 = new TalonFX(deviceId_2);
        m_gearRatio = gearRatio;
        m_percentOutput = percentOutput;
    }

    public void backFeed() {
        shooter_1.set(m_percentOutput / 2.0);
        shooter_2.set(m_percentOutput / -2.0);
    }

    public void shoot() {
        shooter_1.set(m_percentOutput);
        shooter_2.set(m_percentOutput * m_gearRatio * -1);
    }
}

package com.geekykel;

public class MotorStaticFactory {
    /**
     * It returns an initialized motor according to the specified type by the first character:
     * 'P' or 'p' - pneumatic, 'H' or 'h' - hydraulic, 'E' or 'e' - electric, 'W' or 'w' - warp.
     */
    public static Motor make(char type, String model, long power) {
        // write your code here
        Motor motor = null;
        switch (Character.toUpperCase(type)) {
            case 'P':
                motor = new PneumaticMotor(model, power);
                break;
            case 'H':
                motor = new HydraulicMotor(model, power);
            case 'E':
                motor = new ElectricMotor(model, power);
            case 'W':
                motor = new WarpDrive(model, power);
        }
        return motor;
    }
}

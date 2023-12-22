public enum Command {
    TURN_ON, TURN_OFF, SET_TEMPERATURE
}

public interface DeviceCommand {
    void execute();
}

public class TurnOnCommand implements DeviceCommand {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

public class TurnOffCommand implements DeviceCommand {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}


public interface Light {
    public void turnOn();
    public void turnOff();
}

public class SetTemperatureCommand implements DeviceCommand {
    private Thermostat thermostat;

    public SetTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.setTemperature();
    }
}

public interface Thermostat {
    public void setTemperature();
}

public class TurnOnCameraCommand implements DeviceCommand {
    private SecurityCamera securityCamera;

    public TurnOnCameraCommand(SecurityCamera securityCamera) {
        this.securityCamera = securityCamera;
    }

    @Override
    public void execute() {
        securityCamera.turnOn();
    }
}

public class TurnOffCameraCommand implements DeviceCommand {
    private SecurityCamera securityCamera;

    public TurnOffCameraCommand(SecurityCamera securityCamera) {
        this.securityCamera = securityCamera;
    }

    @Override
    public void execute() {
        securityCamera.turnOff();
    }
}

public interface SecurityCamera {
    public void turnOn();
    public void turnOff();
}

public class ConcreteLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("Light is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }
}

public class ConcreteThermostat implements Thermostat {
    @Override
    public void setTemperature() {
        System.out.println("Temperature is set");
    }
}

public class ConcreteSecurityCamera implements SecurityCamera {
    @Override
    public void turnOn() {
        System.out.println("Security camera is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Security camera is off");
    }
}

public interface MediatorSystem {
    public void sendCommand(DeviceCommand command);
    // public void receiveCommand(String command, String device);
}

public class SmartHomeMediator implements MediatorSystem {
    private Light light;
    private Thermostat thermostat;
    private SecurityCamera securityCamera;

    public SmartHomeMediator(Light light, Thermostat thermostat, SecurityCamera securityCamera) {
        this.light = light;
        this.thermostat = thermostat;
        this.securityCamera = securityCamera;
    }

     @Override
    public void sendCommand(DeviceCommand command) {
        System.out.println("Sending command: " + command.getClass().getSimpleName());
        command.execute();
    }
    
}

public class Main {
    public static void main(String[] args) {
        Light light = new ConcreteLight();
        Thermostat thermostat = new ConcreteThermostat();
        SecurityCamera securityCamera = new ConcreteSecurityCamera();

        MediatorSystem smartHomeMediator = new SmartHomeMediator(light, thermostat, securityCamera);

        // Using enums for commands
        DeviceCommand turnOnLightCommand = new TurnOnCommand(light);
        DeviceCommand turnOffLightCommand = new TurnOffCommand(light);
        DeviceCommand setTemperatureCommand = new SetTemperatureCommand(thermostat);
        DeviceCommand turnOnCameraCommand = new TurnOnCommand(securityCamera);
        DeviceCommand turnOffCameraCommand = new TurnOffCommand(securityCamera);

        // Sending commands through the mediator
        smartHomeMediator.sendCommand(turnOnLightCommand);
        smartHomeMediator.sendCommand(turnOffLightCommand);
        smartHomeMediator.sendCommand(setTemperatureCommand);
        smartHomeMediator.sendCommand(turnOnCameraCommand);
        smartHomeMediator.sendCommand(turnOffCameraCommand);
    }
}
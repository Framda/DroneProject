package kosa.team2.drone.main;

import kosa.team2.drone.network.NetworkConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import syk.drone.device.Device;
import syk.drone.device.FlightController;

public class SimulationMain {
    private static final Logger logger = LoggerFactory.getLogger(SimulationMain.class);
    public static void main(String[] args) {
        NetworkConfig networkConfig = new NetworkConfig();

        FlightController flightController = new FlightController();
        flightController.mavlinkConnectTcp("localhost", 5760);
        flightController.mqttConnect(
                networkConfig.mqttBrokerConnStr,
                networkConfig.droneTopic +"/fc/pub",
                networkConfig.droneTopic +"/fc/sub"
        );

        flightController.addDevice(new Device(1) {
            @Override
            public void off() {
                logger.info("chicken detect");
            }

            @Override
            public void on() {
                logger.info("Device on");
            }
        });
    }
}

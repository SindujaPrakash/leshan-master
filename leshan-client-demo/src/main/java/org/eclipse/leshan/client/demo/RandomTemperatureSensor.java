package org.eclipse.leshan.client.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.leshan.client.resource.BaseInstanceEnabler;
import org.eclipse.leshan.core.response.ExecuteResponse;
import org.eclipse.leshan.core.response.ReadResponse;
import org.eclipse.leshan.util.NamedThreadFactory;

public class RandomTemperatureSensor extends BaseInstanceEnabler {

	private final int instanceId;
	public RandomTemperatureSensor() {
	this.instanceId=1;
	}
	@Override
	public ReadResponse read(int resourceid) {
	switch(resourceid) {
	case 5500: { // Digital input state
	/*
	Here goes the code that uses the GPIO to read the
	state of the i-th presence sensor.
	*/
	String digitalInputState=null;
	/*
	We return the sensor's state to the caller
	*/
	return ReadResponse.success(resourceid, digitalInputState);
	}
	default: { 
	return ReadResponse.notFound();
	}
	}
}
}

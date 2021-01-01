package br.com.camaroti.alex.gym.exercisetracking.core.usecase;

import org.springframework.stereotype.Component;

import br.com.camaroti.alex.gym.exercisetracking.core.usecase.model.TrackingModel;
import br.com.camaroti.alex.gym.exercisetracking.dataprovider.db.TrackingDataProvider;

@Component
public class TrackingUseCase {
	
	private final TrackingDataProvider trackingDP;
	
	public TrackingUseCase(TrackingDataProvider trackingDP) {
		this.trackingDP = trackingDP;
	}
	
	public void save(TrackingModel tracking) {
		trackingDP.save(tracking);
	}

}
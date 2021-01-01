package br.com.camaroti.alex.gym.exercisetracking.dataprovider.mapper;

import br.com.camaroti.alex.gym.exercisetracking.core.usecase.model.TrackingModel;
import br.com.camaroti.alex.gym.exercisetracking.dataprovider.db.repository.entity.TrackingEntity;
import br.com.camaroti.alex.gym.exercisetracking.entrypoint.model.TrackingRequestModel;

public class TrackingMapper {
	
	private TrackingMapper() { }
	
	public static TrackingEntity fromCoreToEntity(TrackingModel tracking) {
		return TrackingEntity.builder()
				.score(tracking.getScore())
				.build();
	}

	public static TrackingModel fromModelToCore(TrackingRequestModel requestModel) {
		return TrackingModel.builder()
				.score(requestModel.getScore())
				.build();
	}

}

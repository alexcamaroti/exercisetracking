package br.com.camaroti.alex.gym.exercisetracking.dataprovider.db;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import br.com.camaroti.alex.gym.exercisetracking.core.usecase.model.TrackingModel;
import br.com.camaroti.alex.gym.exercisetracking.dataprovider.db.repository.TrackingRepository;
import br.com.camaroti.alex.gym.exercisetracking.dataprovider.db.repository.entity.TrackingEntity;
import br.com.camaroti.alex.gym.exercisetracking.dataprovider.mapper.TrackingMapper;

@Component
public class TrackingDataProvider {

	private final TrackingRepository repository;
	
	public TrackingDataProvider(TrackingRepository repository) {
		this.repository = repository;
	}
	
	public void save(TrackingModel model) {
		TrackingEntity entity = TrackingMapper.fromCoreToEntity(model);
		entity.setDateTimeExecution(LocalDateTime.now());
		repository.save(entity);
	}
	
}
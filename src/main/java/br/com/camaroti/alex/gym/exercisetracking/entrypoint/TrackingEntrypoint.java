package br.com.camaroti.alex.gym.exercisetracking.entrypoint;

import static br.com.camaroti.alex.gym.exercisetracking.dataprovider.mapper.TrackingMapper.fromModelToCore;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.camaroti.alex.gym.exercisetracking.core.usecase.TrackingUseCase;
import br.com.camaroti.alex.gym.exercisetracking.entrypoint.model.TrackingRequestModel;

@RestController
public class TrackingEntrypoint {
	
	private final TrackingUseCase usecase;
	
	public TrackingEntrypoint(TrackingUseCase usecase) {
		this.usecase = usecase;
	}
	
	@GetMapping
	public String getExample() {
		return "voce acessou essa chamada";
	}
	
	@PostMapping
	public String saveTracking(@Valid @RequestBody TrackingRequestModel requestModel) {
		usecase.save(fromModelToCore(requestModel));
		return "Parabéns! Seu registro foi realizado.";
	}
}

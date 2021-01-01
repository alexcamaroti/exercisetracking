package br.com.camaroti.alex.gym.exercisetracking.entrypoint.model;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrackingRequestModel implements Serializable{

	private static final long serialVersionUID = 6354883196702009823L;
	@NotNull
	@Min(1) @Max(3)
	private Integer score;
}
package br.com.camaroti.alex.gym.exercisetracking.dataprovider.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.camaroti.alex.gym.exercisetracking.dataprovider.db.repository.entity.TrackingEntity;

@Repository
public interface TrackingRepository extends JpaRepository<TrackingEntity, Long>{

}

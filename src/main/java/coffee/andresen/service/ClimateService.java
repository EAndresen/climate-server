package coffee.andresen.service;

import coffee.andresen.models.ClimatePoint;
import coffee.andresen.repository.ClimateRepository;
import org.springframework.stereotype.Service;

@Service
public class ClimateService {

    private final ClimateRepository repository;

    public ClimateService(ClimateRepository repository) {
        this.repository = repository;
    }

    public void insertClimatePoint(ClimatePoint climatePoint) {
        repository.insertClimatePoint(climatePoint);
    }
}

package coffee.andresen.repository;

import coffee.andresen.models.ClimatePoint;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ClimateRepository {

    private final DynamoDBMapper mapper;

    public ClimateRepository(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }

    public void insertClimatePoint(ClimatePoint climatePoint) {
        mapper.save(climatePoint);
    }
}

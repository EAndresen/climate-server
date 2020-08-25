package coffee.andresen.repository;

import coffee.andresen.models.ClimatePoint;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Repository
public class ClimateRepository {

    private final DynamoDBMapper mapper;

    public ClimateRepository(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }

    public void insertClimatePoint(ClimatePoint climatePoint) {
        climatePoint.setDate(getCurrentDate());
        mapper.save(climatePoint);
    }

    private String getCurrentDate() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        df.setTimeZone(tz);
        return df.format(new Date());
    }
}

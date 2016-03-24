package wizard;

import wizard.exception.ToManyGreenBallsException;

import java.util.ArrayList;
import java.util.List;

public class BunchOfBalls {
    private int maxCapacity;
    private List<Ball> balls;

    public BunchOfBalls(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.balls = new ArrayList<>(maxCapacity);
    }

    public void add(Ball ball) throws ToManyGreenBallsException {
        if (balls.size() >= maxCapacity)
            throw new ToManyGreenBallsException();
        balls.add(ball);
    }

    public boolean hasVacancy(){
        return balls.size() < maxCapacity;
    }

}

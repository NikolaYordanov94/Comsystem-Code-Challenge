package com.comsystem.homework.robot;

import com.comsystem.homework.model.RobotAction;
import com.comsystem.homework.model.RobotPlan;
import com.comsystem.homework.utils.RobotUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RobotOperations {

<<<<<<< HEAD
    private final RobotUtil robotUtil;

    public RobotOperations(RobotUtil robotUtil) {
=======
    private List<RobotAction> robotActionList;
    private final RobotUtil robotUtil;

    public RobotOperations(RobotUtil robotUtil) {
        this.robotActionList = new ArrayList<>();
>>>>>>> f5797d2d0a4a65f8f335b4cf172f4d122ee043cc
        this.robotUtil = robotUtil;
    }


    /**
     * An algorithm that converts a number of days into an action plan.
     * @param days the number of days that the robot can work
     * @return The action plan <em>must maximize</em> the number of stones that the robot will dig. In other words, this
     *         algorithm must try to achieve the highest value of {@link RobotPlan#numberOfStones} possible for the
     *         number of provided days. The value of {@link RobotPlan#numberOfDays} is equal to the input
     *         days parameter
     * @see RobotPlan
     */
    public RobotPlan excavateStonesForDays(int days) {
        robotUtil.validateDays(days);

<<<<<<< HEAD
        List<RobotAction> robotActionList = new ArrayList<>();
=======
>>>>>>> f5797d2d0a4a65f8f335b4cf172f4d122ee043cc
        int excavatedStones = 0;
        int robots = 0;

        robots += cloningRobots(days, robots, robotActionList);

        for (int i = 0; i < robots; i++) {
            robotActionList.add(RobotAction.DIG);
        }

        excavatedStones += robots;

        return new RobotPlan(days, excavatedStones, robotActionList);
    }

    /**
     * An algorithm that converts a number of stones into an action plan. Essentially this algorithm is the inverse of
     * {@link #excavateStonesForDays(int)}.
     * @param numberOfStones the number of stones the robot has to collect
     * @return The action plan <em>must minimize</em> the number of days necessary for the robot to dig the
     *         provided number of stones. In other words, this algorithm must try to achieve the lowest value of
     *         {@link RobotPlan#numberOfDays} possible for the number of provided stones. The value of
     *         {@link RobotPlan#numberOfStones} is equal to the numberOfStones parameter
     * @see RobotPlan
     */
    public RobotPlan daysRequiredToCollectStones(int numberOfStones) {
        robotUtil.validateNumberOfStones(numberOfStones);

<<<<<<< HEAD
        List<RobotAction> robotActionList = new ArrayList<>();
=======
>>>>>>> f5797d2d0a4a65f8f335b4cf172f4d122ee043cc
        int excavatedStones = numberOfStones;
        int robots = 0;
        int days = (int) (Math.ceil((Math.log(numberOfStones) / Math.log(2))) + 1);

        robots += cloningRobots(days, robots, robotActionList);

        for (int i = 0; i < robots; i++) {
            robotActionList.add(RobotAction.DIG);
        }

        excavatedStones += robots;

        return new RobotPlan(days, excavatedStones, robotActionList);
    }

    /*
    Assuming that all cloned robots have also the functionality to clone themselves
     */
    public int cloningRobots(int days, int robots, List<RobotAction> robotActions){
        int totalRobots = robots;

        for (int i = 0; i < days - 1; i++) {
            int robotsToday = totalRobots;

            for (int j = 0; j < robotsToday; j++) {
                robotActions.add(RobotAction.CLONE);
            }
            totalRobots *= 2;
        }
        return totalRobots;
    }

}

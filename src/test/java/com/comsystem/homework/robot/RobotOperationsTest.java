package com.comsystem.homework.robot;

import com.comsystem.homework.model.RobotAction;
import com.comsystem.homework.model.RobotPlan;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RobotOperationsTest {

    @Mock
    private RobotOperations robotOperations;

    @Test
    void testExcavateStonesForDays() {
        List<RobotAction> expectedRobotActions = List.of(RobotAction.CLONE, RobotAction.CLONE, RobotAction.CLONE, RobotAction.DIG,
                RobotAction.DIG, RobotAction.DIG, RobotAction.DIG);
        int days = 3;
        int numberOfStones = 4;

        RobotPlan expectedRobotPlan = new RobotPlan(days, numberOfStones, expectedRobotActions);
        when(robotOperations.excavateStonesForDays(days)).thenReturn(expectedRobotPlan);

        RobotPlan actualRobotPlan = robotOperations.excavateStonesForDays(days);

        assertEquals(expectedRobotPlan, actualRobotPlan);
    }


    @Test
    void testDaysRequiredToCollectStones(){
        List<RobotAction> expectedRobotActions = List.of(RobotAction.CLONE, RobotAction.CLONE, RobotAction.CLONE, RobotAction.DIG,
                RobotAction.DIG, RobotAction.DIG, RobotAction.DIG);
        int days = 3;
        int numberOfStones = 4;

        RobotPlan expectedRobotPlan = new RobotPlan(days, numberOfStones, expectedRobotActions);
        when(robotOperations.daysRequiredToCollectStones(numberOfStones)).thenReturn(expectedRobotPlan);

        RobotPlan actualRobotPlan = robotOperations.daysRequiredToCollectStones(numberOfStones);

        assertEquals(expectedRobotPlan, actualRobotPlan);
    }
}

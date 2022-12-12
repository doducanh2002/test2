package org.aibles.okrbackend.dto.request;

import org.aibles.okrbackend.model.DailyPlan;

public class DailyPlanUpdateRequest extends DailyPlantCreateRequest{

    String id;

    public DailyPlan toDailyPlan() {
        DailyPlan dailyPlan = new DailyPlan();
        dailyPlan.setTitle(this.getTitle());
        dailyPlan.setDescription(this.getDescription());
        dailyPlan.setStatus(this.getStatus());
        dailyPlan.setNote(this.getNote());
        return dailyPlan;
    }
}

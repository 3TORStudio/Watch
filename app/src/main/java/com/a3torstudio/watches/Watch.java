package com.a3torstudio.watches;

/**
 * Created by Marcin on 22.10.2017.
 */

public class Watch {
    private String brand;
    private String model;
    private String usuality;
    private String description;
    private int sourceId;

    public static final Watch [] watches = {
            new Watch("Poljot","Aviator","Pilot","mech. 3133 chorono", R.drawable.aviator),
            new Watch("Certina","Chronolympic","Chrono","mech. val. 625",R.drawable.chronolympic),
            new Watch("Omega","Seamaster","Diver","bond",R.drawable.seamaster_omega),
            new Watch("Seiko","SpeedTimer","Chrono","mech. 6139",R.drawable.speedtimer_seiko),
            new Watch("Zenith","Sporto","Official","vintage",R.drawable.zenith)
    };

    public Watch(String brand, String model, String usuality, String description, int sourceId) {
        this.brand = brand;
        this.model = model;
        this.usuality = usuality;
        this.description = description;
        this.sourceId = sourceId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getUsuality() {
        return usuality;
    }

    public String getDescription() {
        return description;
    }

    public int getSourceId() {
        return sourceId;
    }

    public String toString() {
        return this.brand;
    }
}

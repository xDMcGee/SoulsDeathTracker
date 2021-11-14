module SoulsDeathTracker {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.souls_death_tracker to javafx.fxml;
    opens com.souls_death_tracker.controller to javafx.fxml;

    exports com.souls_death_tracker;
    exports com.souls_death_tracker.controller;
}
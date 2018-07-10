package luankevinferreira.expenses;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * This is a subclass of Application used to provide shared objects for this app, such as
 * the Tracker.
 */
public class AnalyticsApplication extends Application {

    private Tracker mTracker;

    /**
     * Gets the default Tracker for this Application.
     *
     * @return tracker
     */
    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker("UA-61261149-4");
        }
        return mTracker;
    }
}

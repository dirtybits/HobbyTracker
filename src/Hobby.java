import java.time.Duration;

public class Hobby {

    private String _hobbyTitle;
    private Duration _timeSpent;


    public Hobby(Duration _timeSpent, String _hobbyTitle) {
        this._timeSpent = _timeSpent;
        this._hobbyTitle = _hobbyTitle;
    }

    public Duration get_timeSpent() {
        return _timeSpent;
    }

    public void set_timeSpent(Duration _timeSpent) {
        this._timeSpent = _timeSpent;
    }

    public String get_hobbyTitle() {
        return _hobbyTitle;
    }

    public void set_hobbyTitle(String _hobbyTitle) {
        this._hobbyTitle = _hobbyTitle;
    }
}

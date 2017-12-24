package root.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter  {

    private Map<Integer,Integer> trackCounts = new HashMap<Integer, Integer>();

    @Pointcut("execution(* root.soundsystem.CompactDisc.playTrack(Integer)) && args(trackNumber)")
    public void trackPlayed(Integer trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(Integer trackNumber){
        Integer currectCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber,currectCount + 1);
    }

    public Integer getPlayCount(Integer trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}

package root.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import root.aspects.TrackCounter;
import root.soundsystem.BlankDisc;
import root.soundsystem.CompactDisc;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackConuntingConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Peppers Lonely Heart Club Band");
        cd.setArtist("The Beatles");

        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Peppers Lonely Heart Club Band");
        tracks.add("With a little help from my friends");
        tracks.add("Lucy in the sky with Diamonds");
        tracks.add("Getting better");
        tracks.add("Fixing a hole");
        cd.setTracks(tracks);
        return  cd;
     }

     @Bean
     public TrackCounter trackCounter(){
         return new TrackCounter();
     }
}

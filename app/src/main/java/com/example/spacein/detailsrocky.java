package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import render.animations.Render;
import render.animations.Zoom;

public class detailsrocky extends AppCompatActivity {

    TextView tvNameDetail;

    TextView radius;

    TextView mass;
    TextView len_of_day;
    TextView data;
    ImageView imagePlanetDetail;


    int[] imagePlanets = {
            R.drawable.metori,
            R.drawable.asteroid,
            R.drawable.comet,


    };
    String[] namesPlanets = {"Meteors & Meteorites","Asteroids","Comets"
    };



    String[] rad_plan={"4.2-5.3 /2 cm","473 km" , "6,051.8 km" };
    String[] surf_mass = {"128-256 grams (4.5-9 oz.)" , "(9.3835±0.0001)×1020 kg","3.1×1021 kg"};
    String[] leng_of_day = {"2.2 hours.", "1,682 Earth days", "22 and a half hours"};
    String[] describ = {"They’re all related to the flashes of light called “shooting stars” sometimes seen streaking across the sky. But we call the same object by different names, depending on where it is.Meteoroids are objects in space that range in size from dust grains to small asteroids. Think of them as “space rocks.\"\n" +
            "\n" + "When meteoroids enter Earth’s atmosphere (or that of another planet, like Mars) at high speed and burn up, the fireballs or “shooting stars” are called meteors.\n" +
            "\n" + "When a meteoroid survives a trip through the atmosphere and hits the ground, it’s called a meteorite.What’s that flash of light streaking across the sky? We call the objects that creates this brilliant effect by different names, depending on where it is.\n" +
            "\n" + "Meteoroids are what we call “space rocks” that range in size from dust grains to small asteroids. This term only applies when they’re in space.Most are pieces of other, larger bodies that have been broken or blasted off. Some come from comets, others from asteroids, and some even come from the Moon and other planets. Some meteoroids are rocky, while others are metallic, or combinations of rock and metal.\n" +
            "\n" + "When meteoroids enter Earth’s atmosphere, or that of another planet, like Mars, at high speed and burn up, they’re called meteors. This is also when we refer to them as “shooting stars.” Sometimes meteors can even appear brighter than Venus -- that’s when we call them “fireballs.” Scientists estimate that about 48.5 tons (44,000 kilograms) of meteoritic material falls on Earth each day.\n" +
            "\n" + "When a meteoroid survives its trip through the atmosphere and hits the ground, it’s called a meteorite.\n" +
            "\n" + "Meteor Showers\n" + "Several meteors per hour can usually be seen on any given night. When there are lots more meteors, you’re watching a meteor shower. Some meteor showers occur annually or at regular intervals as the Earth passes through the trail of dusty debris left by a comet (and, in a few cases, asteroids).\n" +
            "\n" + "Meteor showers are usually named after a star or constellation that is close to where the meteors appear to originate in the sky. Perhaps the most famous are the Perseids, which peak around August 12 every year. Every Perseid meteor is a tiny piece of the comet Swift-Tuttle, which swings by the Sun every 135 years. Other notable meteor showers include the Leonids, associated with comet Tempel-Tuttle; the Aquarids and Orionids, linked to comet Halley, and the Taurids, associated with comet Encke. Most of this comet debris is between the size of a grain of sand and a pea and burns up in the atmosphere before reaching the ground. Sometimes, meteor dust is captured by high-altitude aircraft and analyzed in NASA laboratories."
           , "Asteroids, sometimes called minor planets, are rocky, airless remnants left over from the early formation of our solar system about 4.6 billion years ago.\n" +
            "\n" + "The current known asteroid count is: 1,113,527.Most of this ancient space rubble can be found orbiting the Sun between Mars and Jupiter within the main asteroid belt. Asteroids range in size from Vesta – the largest at about 329 miles (530 kilometers) in diameter – to bodies that are less than 33 feet (10 meters) across. The total mass of all the asteroids combined is less than that of Earth's Moon.Asteroids, sometimes called minor planets, are rocky remnants left over from the early formation of our solar system about 4.6 billion years ago.\n" +
            "\n" + "The current known asteroid count is: 1,113,527.\n" +
            "\n" + "Most of this ancient space rubble can be found orbiting our Sun between Mars and Jupiter within the main asteroid belt. Asteroids range in size from Vesta – the largest at about 329 miles (530 kilometers) in diameter – to bodies that are less than 33 feet (10 meters) across. The total mass of all the asteroids combined is less than that of Earth's Moon.\n" +
            "\n" + "Most asteroids are irregularly shaped, though a few are nearly spherical, and they are often pitted or cratered. As they revolve around the Sun in elliptical orbits, the asteroids also rotate, sometimes quite erratically, tumbling as they go. More than 150 asteroids are known to have a small companion moon (some have two moons). There are also binary (double) asteroids, in which two rocky bodies of roughly equal size orbit each other, as well as triple asteroid systems.The three broad composition classes of asteroids are C-, S-, and M-types.\n" +
            "\n" + "The C-type (chondrite) asteroids are most common. They probably consist of clay and silicate rocks, and are dark in appearance. They are among the most ancient objects in the solar system.\n" +
            "\n" + "The S-types (\"stony\") are made up of silicate materials and nickel-iron.\n" +
            "\n" + "The M-types are metallic (nickel-iron). The asteroids' compositional differences are related to how far from the Sun they formed. Some experienced high temperatures after they formed and partly melted, with iron sinking to the center and forcing basaltic (volcanic) lava to the surface.\n" +
            "\n" + "The orbits of asteroids can be changed by Jupiter's massive gravity – and by occasional close encounters with Mars or other objects. These encounters can knock asteroids out of the main belt, and hurl them into space in all directions across the orbits of the other planets. Stray asteroids and asteroid fragments have slammed into Earth and the other planets in the past, playing a major role in altering the geological history of the planets and in the evolution of life on Earth.\n" +
            "\n" + "Scientists continuously monitor Earth-crossing asteroids, whose paths intersect Earth's orbit, and near-Earth asteroids that approach Earth's orbital distance to within about 28 million miles (45 million kilometers) and may pose an impact danger. Radar is a valuable tool in detecting and monitoring potential impact hazards. By reflecting transmitted signals off objects, images and other information can be derived from the echoes. Scientists can learn a great deal about an asteroid's orbit, rotation, size, shape, and metal concentration."
            ,"omets are cosmic snowballs of frozen gases, rock, and dust that orbit the Sun. When frozen, they are the size of a small town. When a comet's orbit brings it close to the Sun, it heats up and spews dust and gases into a giant glowing head larger than most planets. The dust and gases form a tail that stretches away from the Sun for millions of miles. There are likely billions of comets orbiting our Sun in the Kuiper Belt and even more distant Oort Cloud.\n" +
            "\n" + "The current number of known comets is: 3,743 . In the distant past, people were both awed and alarmed by comets, perceiving them as long-haired stars that appeared in the sky unannounced and unpredictably. Chinese astronomers kept extensive records for centuries, including illustrations of characteristic types of comet tails, times of cometary appearances and disappearances, and celestial positions. These historic comet annals have proven to be a valuable resource for later astronomers.\n" +
            "\n" + "We now know that comets are leftovers from the dawn of our solar system around 4.6 billion years ago, and consist mostly of ice coated with dark organic material. They have been referred to as \"dirty snowballs.\" They may yield important clues about the formation of our solar system. Comets may have brought water and organic compounds, the building blocks of life, to the early Earth and other parts of the solar system.\n" +
            "\n" + "Where Do Comets Come From?\n" + "As theorized by astronomer Gerard Kuiper in 1951, a disc-like belt of icy bodies exists beyond Neptune, where a population of dark comets orbits the Sun in the realm of Pluto. These icy objects, occasionally pushed by gravity into orbits bringing them closer to the Sun, become the so-called short-period comets. Taking less than 200 years to orbit the Sun, in many cases their appearance is predictable because they have passed by before. Less predictable are long-period comets, many of which arrive from a region called the Oort Cloud about 100,000 astronomical units (that is, about 100,000 times the distance between Earth and the Sun) from the Sun. These Oort Cloud comets can take as long as 30 million years to complete one trip around the Sun.\n" +
            "\n" + "Each comet has a tiny frozen part, called a nucleus, often no larger than a few kilometers across. The nucleus contains icy chunks, frozen gases with bits of embedded dust. A comet warms up as it nears the Sun and develops an atmosphere, or coma. The Sun's heat causes the comet's ices to change to gases so the coma gets larger. The coma may extend hundreds of thousands of kilometers. The pressure of sunlight and high-speed solar particles (solar wind) can blow the coma dust and gas away from the Sun, sometimes forming a long, bright tail. Comets actually have two tails―a dust tail and an ion (gas) tail.\n" +
            "\n" + "Most comets travel a safe distance from the Sun―comet Halley comes no closer than 89 million kilometers (55 million miles). However, some comets, called sungrazers, crash straight into the Sun or get so close that they break up and evaporate.\n" +
            "\n" + "Exploration of Comets\n" + "Scientists have long wanted to study comets in some detail, tantalized by the few 1986 images of comet Halley's nucleus. NASA's Deep Space 1 spacecraft flew by comet Borrelly in 2001 and photographed its nucleus, which is about 8 kilometers (5 miles) long.\n" +
            "\n" + "NASA's Stardust mission successfully flew within 236 kilometers (147 miles) of the nucleus of Comet Wild 2 in January 2004, collecting cometary particles and interstellar dust for a sample return to Earth in 2006. The photographs taken during this close flyby of a comet nucleus show jets of dust and a rugged, textured surface. Analysis of the Stardust samples suggests that comets may be more complex than originally thought. Minerals formed near the Sun or other stars were found in the samples, suggesting that materials from the inner regions of the solar system traveled to the outer regions where comets formed.\n" +
            "\n" + "Another NASA mission, Deep Impact, consisted of a flyby spacecraft and an impactor. In July 2005, the impactor was released into the path of the nucleus of comet Tempel 1 in a planned collision, which vaporized the impactor and ejected massive amounts of fine, powdery material from beneath the comet's surface. En route to impact, the impactor camera imaged the comet in increasing detail. Two cameras and a spectrometer on the flyby spacecraft recorded the dramatic excavation that helped determine the interior composition and structure of the nucleus.\n" +
            "\n" + "After their successful primary missions, the Deep Impact spacecraft and the Stardust spacecraft were still healthy and were retargeted for additional cometary flybys. Deep Impact's mission, EPOXI (Extrasolar Planet Observation and Deep Impact Extended Investigation), comprised two projects: the Deep Impact Extended Investigation (DIXI), which encountered comet Hartley 2 in November 2010, and the Extrasolar Planet Observation and Characterization (EPOCh) investigation, which searched for Earth-size planets around other stars on route to Hartley 2. NASA returned to comet Tempel 1 in 2011, when the Stardust New Exploration of Tempel 1 (NExT) mission observed changes in the nucleus since Deep Impact's 2005 encounter.\n" +
            "\n" + "How Comets Get Their Names\n" + "Comet naming can be complicated. Comets are generally named for their discoverer—either a person or a spacecraft. This International Astronomical Union guideline was developed only in the last century. For example, comet Shoemaker-Levy 9 was so named because it was the ninth short-periodic comet discovered by Eugene and Carolyn Shoemaker and David Levy. Since spacecraft are very effective at spotting comets many comets have LINEAR, SOHO or WISE in their names."};
    Render render = new Render(detailsrocky.this);
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsrocky);

        tvNameDetail = findViewById(R.id.tv_name_detail);
        imagePlanetDetail = findViewById(R.id.image_planet_detail);

        radius = findViewById(R.id.radius);

        mass = findViewById(R.id.mass_planet);
        len_of_day = findViewById(R.id.length_day);
        data = findViewById(R.id.descrip_data);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            int val = extras.getInt("pos");
            tvNameDetail.setText(namesPlanets[val]);


            radius.setText(rad_plan[val]);

            mass.setText(surf_mass[val]);
            len_of_day.setText(leng_of_day[val]);
            data.setText(describ[val]);
            imagePlanetDetail.setImageResource(imagePlanets[val]);
            render.setAnimation(new Zoom().In(imagePlanetDetail));
            render.start();
        }

    }
}
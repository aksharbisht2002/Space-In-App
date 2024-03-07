package com.example.spacein;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import render.animations.Render;
import render.animations.Zoom;
public class extra_details extends AppCompatActivity {


    TextView tvNameDetail;

    TextView radius;

    TextView mass;
    TextView len_of_day;
    TextView data;
    ImageView imagePlanetDetail;


    int[] imagePlanets = {
            R.drawable.sun,
            R.drawable.moon,
            R.drawable.black,


    };
    String[] namesPlanets = {"Sun","Moon","Planet X"};


    String[] rad_plan={"696,340 km","1,737.4 km" , "-----"  };
    String[] surf_mass = {"1,988,500." , "38 million square km","3.1×1021 kg" ,"----"};
    String[] leng_of_day = {"24.5 Earth days", "29.5306 Earth days" ,"---"};
    String[] describ = {"Our Sun is a 4.5 billion-year-old star – a hot glowing ball of hydrogen and helium at the center of our solar system. The Sun is about 93 million miles (150 million kilometers) from Earth, and without its energy, life as we know it could not exist here on our home planet.The Sun is the largest object in our solar system. The Sun’s volume would need 1.3 million Earths to fill it. Its gravity holds the solar system together, keeping everything from the biggest planets to the smallest bits of debris in orbit around it. The hottest part of the Sun is its core, where temperatures top 27 million degrees Fahrenheit (15 million degrees Celsius). The Sun’s activity, from its powerful eruptions to the steady stream of charged particles it sends out, influences the nature of space throughout the solar system.NASA and other international space agencies monitor the Sun 24/7 with a fleet of spacecraft, studying everything from its atmosphere to its surface, and even peering inside the Sun using special instruments. Sun-exploring spacecraft include Parker Solar Probe, Solar Orbiter, SOHO, ACE, IRIS, WIND, Hinode, Solar Dynamics Observatory, and STEREO. Pop Culture\n" +
            "The Sun has inspired us since ancient times. It’s central to mythology and religion in cultures around the world, including the ancient Egyptians, the Aztecs of Mexico, Native American tribes of North and South America, the Chinese, and many others.Countless musicians have written songs about the Sun. The Beatles had a hit in 1969 with “Here Comes the Sun.” Other popular songs that reference the Sun include: “Walkin’ on the Sun” by Smashmouth; “Ain’t No Sunshine” by Bill Withers; “Walking on Sunshine” by Katrina and the Waves; “Pocketful of Sunshine” by Natasha Bedingfield; and “Let the Sunshine In” by the Fifth Dimension." , "Moons – also known as natural satellites – orbit planets and asteroids in our solar system. Earth has one moon, and there are more than 200 moons in our solar system. Most of the major planets – all except Mercury and Venus – have moons. Pluto and some other dwarf planets, as well as many asteroids, also have small moons. Saturn and Jupiter have the most moons, with dozens orbiting each of the two giant planets.\n" +
            "\n" +
            "Moons come in many shapes, sizes, and types. A few have atmospheres and even hidden oceans beneath their surfaces. Most planetary moons probably formed from the discs of gas and dust circulating around planets in the early solar system, though some are \"captured\" objects that formed elsewhere and fell into orbit around larger worlds.Eyes on the Solar System lets you explore the planets, their moons, asteroids, comets and the spacecraft exploring them from 1950 to 2050. Ride with the Curiosity Rover as it lands on Mars or fly by Pluto with the New Horizons spacecraft all from the comfort of your home computer.Moons – also called natural satellites – come in many shapes, sizes and types. They are generally solid bodies, and few have atmospheres. Most planetary moons probably formed from the discs of gas and dust circulating around planets in the early solar system.There are hundreds of moons in our solar system – even a few asteroids have been found to have small companion moons. Moons that begin with a letter and a year are considered provisional moons. They will be given a proper name when their discoveries are confirmed by additional observations.Of the terrestrial (rocky) planets of the inner solar system, neither Mercury nor Venus have any moons at all, Earth has one and Mars has its two small moons. In the outer solar system, the gas giants Jupiter and Saturn and the ice giants Uranus and Neptune have dozens of moons. As these planets grew in the early solar system, they were able to capture smaller objects with their large gravitational fields."
            ," Overview\n" +
            "Caltech researchers have found mathematical evidence suggesting there may be a \"Planet X\" deep in the solar system. This hypothetical Neptune-sized planet orbits our Sun in a highly elongated orbit far beyond Pluto. The object, which the researchers have nicknamed \"Planet Nine,\" could have a mass about 10 times that of Earth and orbit about 20 times farther from the Sun on average than Neptune. It may take between 10,000 and 20,000 Earth years to make one full orbit around the Sun.\n" +
            "\n" +
            "The announcement does not mean there is a new planet in our solar system. The existence of this distant world is only theoretical at this point and no direct observation of the object nicknamed \"Planet 9\" have been made. The mathematical prediction of a planet could explain the unique orbits of some smaller objects in the Kuiper Belt, a distant region of icy debris that extends far beyond the orbit of Neptune. Astronomers are now searching for the predicted planet.Artist's concept of a hypothetical planet orbiting far from the Sun. Credit: Caltech/R. Hurt (IPAC)\n" +
            "\n" +
            "Overview\n" +
            "Caltech researchers have found mathematical evidence suggesting there may be a \"Planet X\" deep in the solar system. This hypothetical Neptune-sized planet orbits our Sun in a highly elongated orbit far beyond Pluto. The object, which the researchers have nicknamed \"Planet Nine,\" could have a mass about 10 times that of Earth and orbit about 20 times farther from the Sun on average than Neptune. It may take between 10,000 and 20,000 Earth years to make one full orbit around the Sun.\n" +
            "\n" +
            "The announcement does not mean there is a new planet in our solar system. The existence of this distant world is only theoretical at this point and no direct observation of the object nicknamed \"Planet 9\" have been made. The mathematical prediction of a planet could explain the unique orbits of some smaller objects in the Kuiper Belt, a distant region of icy debris that extends far beyond the orbit of Neptune. Astronomers are now searching for the predicted planet.\n" +
            "\n" +
            "In Depth\n" +
            "In January 2015, Caltech astronomers Konstantin Batygin and Mike Brown announced new research that provides evidence of a giant planet tracing an unusual, elongated orbit in the outer solar system. The prediction is based on detailed mathematical modeling and computer simulations, not direct observation.\n" +
            "\n" +
            "This large object could explain the unique orbits of at least five smaller objects discovered in the distant Kuiper Belt.\n" +
            "\n" +
            "\"The possibility of a new planet is certainly an exciting one for me as a planetary scientist and for all of us,\" said Jim Green, director of NASA's Planetary Science Division. \"This is not, however, the detection or discovery of a new planet. It's too early to say with certainty there's a so-called Planet X. What we're seeing is an early prediction based on modeling from limited observations. It's the start of a process that could lead to an exciting result.\"The Caltech scientists believe Planet X may have has a mass about 10 times that of Earth and be similar in size to Uranus or Neptune. The predicted orbit is about 20 times farther from our Sun on average than Neptune (which orbits the Sun at an average distance of 2.8 billion miles). It would take this new planet between 10,000 and 20,000 years to make just one full orbit around the Sun (where Neptune completes an orbit roughly every 165 years).\n" +
            "\n" +
            "When was it Discovered?\n" +
            "Planet X has not yet been discovered, and there is debate in the scientific community about whether it exists. The prediction in the Jan. 20 issue of the Astronomical Journal is based on mathematical modeling."};
    Render render = new Render(extra_details.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_details);

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

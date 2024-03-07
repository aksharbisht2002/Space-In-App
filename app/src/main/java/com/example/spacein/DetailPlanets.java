package com.example.spacein;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import render.animations.*;
import render.animations.Zoom;

public class DetailPlanets extends AppCompatActivity {

    TextView tvNameDetail;
    TextView distance;
    TextView orbit;
    TextView radius;
    TextView surface;
    TextView mass;
    TextView len_of_day;
    TextView data;
    ImageView imagePlanetDetail;

    int[] imagePlanets = {
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6,
            R.drawable.p7,
            R.drawable.p8
    };
    String[] namesPlanets = {
            "Mercury", "Naptune", "Venus", "Earth", "Jupiter", "Saturn", "Uranus", "Mars"
    };
   String[] dis_of_sun={"58 million km","4.495 billion km" ,"108.2 million km","149.6 million km" ,"778.5 million km" , "1.434 billion km","2.871 billion km", "227.9 million km"};
    String[] orbit_sun={ "88 days","165 years" , "225 days","365 days" ,"12 years" , "29 years","84 years" , "687 days"};
    String[] rad_plan={"2,439.7 km","24,622 km" , "6,051.8 km","6,371 km" ,"69,911 km" , "58,232 km","25,362 km" , "3,389.5 km" };
    String[] surf_area = {"74.8 million km²","7.618 billion km²" , "460.2 million km²","510.1 million km²" ,"61.42 billion km²" , "42.7 billion km²","8.083 billion km²" , "144.8 million km²"};
    String[] surf_mass = {"3.285 × 10^23 kg (0.055 M⊕" , "1.024 × 10^26 kg (17.15 M⊕)","4.867 × 10^24 kg (0.815 M⊕)" ,"5.972 × 10^24 kg" , "1.898 × 10^27 kg (317.8 M⊕)","5.683 × 10^26 kg (95.16 M⊕)" , "8.681 × 10^25 kg (14.54 M⊕)","6.4171×1023 kg"};
    String[] leng_of_day = {"58d 15h 30m", "0d 16h 6m", "116d 18h 0m", "24 hours" ,"0d 9h 56m" , "0d 10h 34m","0d 17h 14m","1d 0h 37m"};

    String[] describ = {"The smallest planet in our solar system and nearest to the Sun, Mercury is only slightly larger than Earth's Moon.From the surface of Mercury, the Sun would appear more than three times as large as it does when viewed from Earth, and the sunlight would be as much as seven times brighter. Despite its proximity to the Sun, Mercury is not the hottest planet in our solar system – that title belongs to nearby Venus, thanks to its dense atmosphere.Because of Mercury's elliptical – egg-shaped – orbit, and sluggish rotation, the Sun appears to rise briefly, set, and rise again from some parts of the planet's surface. The same thing happens in reverse at sunset."
            , "Dark, cold, and whipped by supersonic winds, ice giant Neptune is the eighth and most distant planet in our solar system.More than 30 times as far from the Sun as Earth, Neptune is the only planet in our solar system not visible to the naked eye and the first predicted by mathematics before its discovery. In 2011 Neptune completed its first 165-year orbit since its discovery in 1846.NASA's Voyager 2 is the only spacecraft to have visited Neptune up close. It flew past in 1989 on its way out of the solar system."
            , "Venus is the second planet from the Sun and is Earth’s closest planetary neighbor. It’s one of the four inner, terrestrial (or rocky) planets, and it’s often called Earth’s twin because it’s similar in size and density. These are not identical twins, however – there are radical differences between the two worlds.Venus has a thick, toxic atmosphere filled with carbon dioxide and it’s perpetually shrouded in thick, yellowish clouds of sulfuric acid that trap heat, causing a runaway greenhouse effect. It’s the hottest planet in our solar system, even though Mercury is closer to the Sun. Surface temperatures on Venus are about 900 degrees Fahrenheit (475 degrees Celsius) – hot enough to melt lead.The surface is a rusty color and it’s peppered with intensely crunched mountains and thousands of large volcanoes. Scientists think it’s possible some volcanoes are still active.Venus has crushing air pressure at its surface – more than 90 times that of Earth – similar to the pressure you'd encounter a mile below the ocean on Earth.\n" +
            "\n" + "Another big difference from Earth – Venus rotates on its axis backward, compared to most of the other planets in the solar system. This means that, on Venus, the Sun rises in the west and sets in the east, opposite to what we experience on Earth. (It’s not the only planet in our solar system with such an oddball rotation – Uranus spins on its side.)"
            ," Our home planet is the third planet from the Sun, and the only place we know of so far that’s inhabited by living things.While Earth is only the fifth largest planet in the solar system, it is the only world in our solar system with liquid water on the surface. Just slightly larger than nearby Venus, Earth is the biggest of the four planets closest to the Sun, all of which are made of rock and metal .The name Earth is at least 1,000 years old. All of the planets, except for Earth, were named after Greek and Roman gods and goddesses. However, the name Earth is a Germanic word, which simply means “the ground."
          ,"Jupiter has a long history of surprising scientists – all the way back to 1610 when Galileo Galilei found the first moons beyond Earth. That discovery changed the way we see the universe.Fifth in line from the Sun, Jupiter is, by far, the largest planet in the solar system – more than twice as massive as all the other planets combined.Jupiter's familiar stripes and swirls are actually cold, windy clouds of ammonia and water, floating in an atmosphere of hydrogen and helium. Jupiter’s iconic Great Red Spot is a giant storm bigger than Earth that has raged for hundreds of years.\n" +
            "\n" + "One spacecraft – NASA's Juno orbiter – is currently exploring this giant world.",
           "Saturn is the sixth planet from the Sun and the second-largest planet in our solar system.Adorned with thousands of beautiful ringlets, Saturn is unique among the planets. It is not the only planet to have rings – made of chunks of ice and rock – but none are as spectacular or as complicated as Saturn's.\n" +
                   "\n" + "Like fellow gas giant Jupiter, Saturn is a massive ball made mostly of hydrogen and helium.",
       "Uranus is the seventh planet from the Sun, and has the third-largest diameter in our solar system. It was the first planet found with the aid of a telescope, Uranus was discovered in 1781 by astronomer William Herschel, although he originally thought it was either a comet or a star.It was two years later that the object was universally accepted as a new planet, in part because of observations by astronomer Johann Elert Bode. Herschel tried unsuccessfully to name his discovery Georgium Sidus after King George III. Instead, the scientific community accepted Bode's suggestion to name it Uranus, the Greek god of the sky, as suggested by Bode.",
      "Mars is the fourth planet from the Sun – a dusty, cold, desert world with a very thin atmosphere. Mars is also a dynamic planet with seasons, polar ice caps, canyons, extinct volcanoes, and evidence that it was even more active in the past.Mars is one of the most explored bodies in our solar system, and it's the only planet where we've sent rovers to roam the alien landscape.NASA currently has two rovers (Curiosity and Perseverance), one lander (InSight), and one helicopter (Ingenuity) exploring the surface of Mars.\n" +
              "\n" + "Perseverance rover – the largest, most advanced rover NASA has sent to another world – touched down on Mars on Feb. 18, 2021, after a 203-day journey traversing 293 million miles (472 million kilometers). The Ingenuity helicopter rode to Mars attached to the belly of Perseverance.Perseverance is one of three spacecraft that arrived at Mars in 2021. The Hope orbiter from the United Arab Emirates arrived on Feb. 9, 2021. China’s Tianwen-1 mission arrived on Feb. 10, 2021, and includes an orbiter, a lander, and a rover. Europe and India also have spacecraft studying Mars from orbit.\n" +
              "\n" + "In May 2021, China became the second nation to ever land successfully on Mars when its Zhurong Mars rover touched down.\n" +
              "\n" + "An international fleet of eight orbiters is studying the Red Planet from above including three NASA orbiters: 2001 Mars Odyssey, Mars Reconnaissance Orbiter, and MAVEN.\n" +
              "\n" + "These robotic explorers have found lots of evidence that Mars was much wetter and warmer, with a thicker atmosphere, billions of years ago."};

    Render render = new Render(DetailPlanets.this);
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailplanets);

        tvNameDetail = findViewById(R.id.tv_name_detail);
        imagePlanetDetail = findViewById(R.id.image_planet_detail);
        distance = findViewById(R.id.distance_from_sun);
        orbit =  findViewById(R.id.orbit);
        radius = findViewById(R.id.radius);
         surface = findViewById(R.id.Area_surf);
         mass = findViewById(R.id.mass_planet);
         len_of_day = findViewById(R.id.length_day);
         data = findViewById(R.id.descrip_data);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            int val = extras.getInt("pos");
            tvNameDetail.setText(namesPlanets[val]);
            distance.setText(dis_of_sun[val]);
            orbit.setText(orbit_sun[val]);
            radius.setText(rad_plan[val]);
            surface.setText(surf_area[val]);
            mass.setText(surf_mass[val]);
            len_of_day.setText(leng_of_day[val]);
            data.setText(describ[val]);
            imagePlanetDetail.setImageResource(imagePlanets[val]);
            render.setAnimation(new Zoom().In(imagePlanetDetail));
            render.start();
        }
    }
}
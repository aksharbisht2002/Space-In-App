package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import render.animations.Render;
import render.animations.Zoom;

public class detailsdwarf extends AppCompatActivity {

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
            R.drawable.p11,
            R.drawable.p12,
            R.drawable.p13,
            R.drawable.p14,
            R.drawable.p15,

    };
    String[] namesPlanets = {
            "Pluto", "Ceres", "Makemake", "Haumea", "Eris"
    };


    String[] dis_of_sun={"3.7 billion miles","257 million miles" ,"108.2 million km","6,452,000,000 kilometers" ,"778.5 million km" , "1.434 billion km","2.871 billion km", "227.9 million km"};
    String[] orbit_sun={ "248 years","1,682 days" , "225 days","284 years" ,"306 years" , "29 years","84 years" , "687 days"};
    String[] rad_plan={"1,188.3 km","473 km" , "6,051.8 km","816 km" ,"69,911 km" , "58,232 km","25,362 km" , "3,389.5 km" };
    String[] surf_area = {"1.664794×107 km2 0.035","2,770,000 km2" , "6.42×106 km2²","8.14×106 km2" ,"61.42 billion km²" , "42.7 billion km²","8.083 billion km²" , "144.8 million km²"};
    String[] surf_mass = {"(1.303±0.003)×1022 kg 0.00218" , "(9.3835±0.0001)×1020 kg","3.1×1021 kg" ,"(4.006±0.040)×1021 kg 0.00066 Earths" , "1.898 × 10^27 kg (317.8 M⊕)","5.683 × 10^26 kg (95.16 M⊕)" , "8.681 × 10^25 kg (14.54 M⊕)","6.4171×1023 kg"};
    String[] leng_of_day = {"6.4 Earth days", "1,682 Earth days", "22 and a half hours", "4 hours" ,"0d 9h 56m" , "0d 10h 34m","0d 17h 14m","1d 0h 37m"};

    String[] describ = {"Pluto is a dwarf planet in the Kuiper Belt, a donut-shaped region of icy bodies beyond the orbit of Neptune. There may be millions of these icy objects, collectively referred to as Kuiper Belt objects (KBOs) or trans-Neptunian objects (TNOs), in this distant region of our solar system. Pluto – which is smaller than Earth’s Moon – has a heart-shaped glacier that’s the size of Texas and Oklahoma. This fascinating world has blue skies, spinning moons, mountains as high as the Rockies, and it snows – but the snow is red.\n" +
            "\n" +
            "On July 14, 2015, NASA’s New Horizons spacecraft made its historic flight through the Pluto system – providing the first close-up images of Pluto and its moons and collecting other data that has transformed our understanding of these mysterious worlds on the solar system’s outer frontier.\n" +
            "\nIn the years since that groundbreaking flyby, nearly every conjecture about Pluto possibly being an inert ball of ice has been thrown out the window or flipped on its head.\n" +
            "\n" +
            "“It’s clear to me that the solar system saved the best for last!” said Alan Stern, New Horizons principal investigator from the Southwest Research Institute, Boulder, Colorado. “We could not have explored a more fascinating or scientifically important planet at the edge of our solar system. The New Horizons team worked for 15 years to plan and execute this flyby and Pluto paid us back in spades!"
            ,"Dwarf planet Ceres is the largest object in the asteroid belt between Mars and Jupiter, and it's the only dwarf planet located in the inner solar system. It was the first member of the asteroid belt to be discovered when Giuseppe Piazzi spotted it in 1801. And when NASA's Dawn arrived in 2015, Ceres became the first dwarf planet to receive a visit from a spacecraft.\n" +
            "\n" +
            "Called an asteroid for many years, Ceres is so much bigger and so different from its rocky neighbors that scientists classified it as a dwarf planet in 2006. Even though Ceres comprises 25% of the asteroid belt's total mass, Pluto is still 14 times more massive.\n" +
            "\n" +
            "Ceres is named for the Roman goddess of corn and harvests. The word cereal comes from the same name."
            ,"Along with fellow dwarf planets Pluto, Eris, and Haumea, Makemake is located in the Kuiper Belt, a donut-shaped region of icy bodies beyond the orbit of Neptune. Slightly smaller than Pluto, Makemake is the second-brightest object in the Kuiper Belt as seen from Earth (while Pluto is the brightest). It takes about 305 Earth years for this dwarf planet to make one trip around the Sun.\n" +
            "\n" +
            "Makemake holds an important place in the history of solar system studies because it – along with Eris – was one of the objects whose discovery prompted the International Astronomical Union to reconsider the definition of a planet and to create the new group of dwarf planets.\n" +
            "\n" +
            "Makemake was first observed in March 2005 by M.E. Brown, C.A. Trujillo, and D.L. Rabinowitz at the Palomar Observatory. Its unofficial codename was Easterbunny. Before this dwarf planet was confirmed, its provisional name was 2005 FY9. In 2016, NASA’s Hubble Space Telescope spotted a small, dark moon orbiting Makemake."
            ,"Originally designated 2003 EL61 (and nicknamed Santa by one discovery team), Haumea is located in the Kuiper Belt, a donut-shaped region of icy bodies beyond the orbit of Neptune. The other known dwarf planets in the Kuiper Belt are Pluto, Eris, and Makemake (dwarf planet Ceres is located in the main asteroid belt between Mars and Jupiter).\n" +
            "\n" +
            "Haumea is roughly the same size as Pluto. It is one of the fastest rotating large objects in our solar system. The fast spin distorts Haumea's shape, making this dwarf planet look like a football.\n" +
            "\n" +
            "Two teams claim credit for discovering Haumea citing evidence from observations made in 2003 and 2004. The International Astronomical Union’s Gazetteer of Planetary Nomenclature lists the discovery location as Sierra Nevada Observatory in Spain on Mar. 7, 2003, but no official discoverer is listed.\n" +
            "\n" +
            "Everything we know about Haumea is from observations with ground-based telescopes from around the world.\n" +
            "\n" +
            "Other key dates:\n" +
            "2005: Haumea's moons are discovered.\n" +
            "2008: Haumea is recognized as a dwarf planet by the International Astronomical Union and named Haumea."
            ,"Eris is one of the largest known dwarf planets in our solar system. It's about the same size as Pluto but is three times farther from the Sun.\n" +
            "\n" +
            "At first, Eris appeared to be larger than Pluto. This triggered a debate in the scientific community that led to the International Astronomical Union's decision in 2006 to clarify the definition of a planet. Pluto, Eris, and other similar objects are now classified as dwarf planets.\n" +
            "\n" +
            "Eris was discovered on Jan. 5, 2005, from data obtained on Oct. 21, 2003 during a Palomar Observatory survey of the outer solar system by Mike Brown, a professor of planetary astronomy at the California Institute of Technology; Chad Trujillo of the Gemini Observatory; and David Rabinowitz of Yale University.Significant Dates\n" +
            "Jan 8, 2005: Scientists announce they have discovered a Pluto-sized world billions of miles beyond the orbit of Neptune. They nickname the tiny world Xena after a fictional television character. The discovery reignites a debate about the definition of a planet.\n" +
            "Sep 2005: Scientists announce Xena has a tiny moon, which they nickname Gabriella after Xena's sidekick on a television show about a warrior princess.\n" +
            "Aug 26, 2006: After months of debate about how to classify Eris, the International Astronomical Union votes to change the definition of a planet. The new ruling reclassifies Pluto as a dwarf planet and reduces the number of planets in the solar system to eight. Both Eris and the asteroid Ceres are also classified as dwarf planets.\n" +
            "Sep 14, 2006: The International Astronomical Union (IAU) announces that the dwarf planet known as Xena will be called Eris, after the Greek goddess of discord. Eris's moon is named Dysnomia, the demon goddess of lawlessness and the daughter of Eris. This is fitting since the discovery of Eris led to the demotion of Pluto from planet to dwarf planet amidst continuing debate in the science community and the public."};

    Render render = new Render(detailsdwarf.this);
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsdwarf);


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
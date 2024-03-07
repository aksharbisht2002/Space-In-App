package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import render.animations.Render;
import render.animations.Zoom;

public class cons_details extends AppCompatActivity {

    TextView tvNameDetail;

    TextView name_ex;
TextView Stars ;
    TextView Area;
    TextView Decline;
    TextView Symbolise;

    TextView right_asc;

    TextView data;
    ImageView imagePlanetDetail;


    int[] imagePlanets = {
            R.drawable.orion,
            R.drawable.caris,
            R.drawable.ursa,
            R.drawable.cassiopeia,
            R.drawable.taurus


    };
    String[] namesPlanets = {"Orion","Caris","Ursa" ,"Cassiopeia","Taurus"
    };

    String[] name_cel={"The Hunter","The Greater Dog" , "Great Bear" ,"Cassiopeia's Chair" ,"Bull" };
    String[] area_cel = {"594 sq. deg. (26th)" , "380 sq. deg. (43rd)","1280 sq. deg. (3rd)" ,"598 square degrees" , "797 square degrees"};
    String[] decl_cel = {"+5°", "−11.03° to −33.25°", "+55.38°" ,"77.6923447°–48.6632690°" , "16° north"};
    String[] stars_no ={"6 candidates"," 7 candidates"," 21 candidates"," 14 candidates", "9 candidates"};
    String[] symb_cel = {"Orion, the Hunter" ,"The greater dog" ,"Greater Dog" , "the Seated Queen","the Bull"};
    String[] asc_cel = {"5h", "06h 12.5m to 07h 27.5m", "10.67h" ,"1 hour " , "4 hours 20 minutes"};
    String[] describ = {"Orion is located on the celestial equator and can be seen throughout the world. The constellation is named after the hunter in Greek mythology is one of the most obvious and recognizable constellations in the sky. Two of the ten brightest stars in the sky are located in Orion — Rigel (Beta Orionis) and Betelgeuse (Alpha Orionis), according to a stargazing website Astronomy Trek(opens in new tab). Orion is clearly visible in the night sky(opens in new tab) from November to February. Finding Orion's Belt is the easiest way to locate the Orion Constellation. Orion's Belt is formed by three bright stars; Alnilam, Mintaka and Alnitak. Orion is in the southwestern sky if you are in the Northern Hemisphere or the northwestern sky if you are in the Southern Hemisphere. It is best seen between latitudes 85 and minus 75 degrees. Its right ascension is 5 hours, and its declination is 5 degrees.\n" +
            "\n" +
            "Betelgeuse(opens in new tab), the second brightest star in Orion — according to the night sky guide website In-The-Sky.org(opens in new tab), establishes the right shoulder of the hunter. Bellatrix serves as Orion's left shoulder. Other stars in the constellation include Hatsya, which establishes the tip of Orion's sword that hangs off the belt, and Meissa, which forms Orion's head. Saiph serves as Orion's right knee. Rigel(opens in new tab), Orion's brightest star, forms the hunter's left knee With one exception, all of the main stars in Orion are bright young blue giants or supergiants, ranging in distance from Bellatrix (243 light-years) to Alnilam (1,360 light-years). The Orion Nebula is located around 1,350 light-years away from Earth. One light-year is the distance light travels in a single year, about 6 trillion miles (10 trillion kilometers).\n" +
            "\n" +
            "The exception is the star Betelgeuse(opens in new tab), which is a red giant and one of the largest stars known. Observers with a keen eye should be able to see the difference in color between Betelgeuse and all the other stars in Orion. "
            , "The constellation Canis Major, the great dog, is located in the southern hemisphere of the sky. It is visible in the northern hemisphere from December through March. It can be seen at latitudes between 60 degrees and -90 degrees. It is a small to mid-sized constellation covering an area of 380 square degrees. It ranks 43rd in size among the 88 constellations in the night sky.\n" +
            "\n" +
            "Canis Major is one of the 48 constellations originally cataloged by the Greek astronomer Ptolemy in the second century. Its name means “the greater dog” in Latin. It represents the larger of Orion's two hunting dogs who accompany him as he hunts Lepus, the rabbit. It is an ancient constellation with many different meanings to many different cultures. The ancient Babylonians saw it as an arrow aiming towards Orion. Part of the stars from Puppis formed the bow. To the Chinese, the stars in Canis Major were part of the Vermillion Bird. In Greek mythology, the constellation represented the dog Laelaps, a gift from Zeus to Europa. The dog was famous for being the fastest in the world. Zeus eventually placed the dog into the night sky. If you connect the stars with lines, this constellation does somewhat resemble a dog.Canis Major is famous for the bright star Sirius, the brightest star in the night sky. With a visual magnitude of 1.46, it is also the brightest star in the constellation. Sirius is also known as the Dog Star. Its name means “scorching,” which more than likely refers to the star's unmatched brilliance in the sky. It is a binary star system located only 8.6 light years from Earth. This makes it the fifth closest star system to our own. The second brightest star in Canis Major is Adhara with a magnitude of 1.50. It is also a binary star system that lies approximately 430 light years away. Wezen is the third brightest star with a magnitude of 1.83. It is a yellow-white supergiant star that sits about 1,800 light years from our solar system.\n" +
            "\n" +
            "Canis Major contains one Messier object, M41. This is an open star cluster containing about 100 stars. It is 26 light years in diameter and is located 2,300 light years from Earth. A few other notable deep-sky objects can also be found here. These dim objects can only be seen with a large telescope. The Canis Major Dwarf Galaxy, also known as the Canis Major Overdensity, is an irregular galaxy that is thought to be the closest neighboring galaxy to our solar system. Thor’s Helmet (NGC 2359) is an emission nebula that closely resembles a Viking helmet. NGC 2207 and IC 2163 are a pair of interacting spiral galaxies that are in the process of colliding with each other. They will eventually merge to form a larger galaxy."
            ,"Ursa Major constellation lies in the northern sky. Its name means “the great bear,” or “the larger bear,” in Latin. The smaller bear is represented by Ursa Minor.\n" +
            "\n" +
            "Ursa Major is the largest northern constellation and third largest constellation in the sky. Its brightest stars form the Big Dipper asterism, one of the most recognizable shapes in the sky, also known as the Plough. Ursa Major is well-known in most world cultures and associated with a number of myths. It was one of the constellations catalogued by the Greek astronomer Ptolemy in the 2nd century. In Greek mythology, it is associated with Callisto, a nymph who was turned into a bear by Zeus’ jealous wife Hera.\n" +
            "\n" +
            "Ursa Major contains a number of notable stars and famous deep sky objects. These include the Pinwheel Galaxy (M101), Bode’s Galaxy, the Cigar Galaxy, and the Owl Nebula.Ursa Major is a well-known, significant constellation in many cultures. It is one of the oldest constellations in the sky, with a history dating back to ancient times. The constellation is referenced in Homer and the Bible. A great number of tales and legends across the globe associate Ursa Major with a bear.\n" +
            "\n" +
            "Ancient Greeks associated the constellation with the myth of Callisto, the beautiful nymph who had sworn a vow of chastity to the goddess Artemis. Zeus saw the nymph one day and fell in love. The two had a son, and named him Arcas. Artemis had already banished Callisto when she had learned about the nymph’s pregnancy and broken vow.\n" +
            "\n" +
            "However, it was Zeus’ jealous wife Hera, who was not amused by her husband’s philandering, who would do even more damage. Angered by Zeus’ betrayal, she turned Callisto into a bear.\n" +
            "\n" +
            "Callisto lived as a bear for the next 15 years, roaming the forest and always running and hiding from hunters. One day, her son Arcas was walking in the forest and the two came face to face. At the sight of the bear, Arcas quickly drew his spear, scared.Seeing the scene from Olympus, Zeus intervened to prevent a tragedy. He sent a whirlwind that carried both Callisto and Arcas into the heavens, where he turned Arcas into the constellation Boötes, the Herdsman, and Callisto into Ursa Major. (In another version, Arcas becomes the constellation Ursa Minor.) This only further infuriated Hera and she persuaded her foster parents Oceanus and Tethys never to let the bear bathe in the northern waters. This, according to the legend, is why Ursa Major never sets below the horizon in mid-northern latitudes.\n" +
            "\n" +
            "In a different version of the tale, it is not Hera but Artemis who transforms Callisto into a bear. Artemis does this to punish the nymph for breaking her vow of chastity to the goddess. Many years later, both Callisto and Arcas are captured in the forest and taken to King Lycaon as a gift. The mother and son take refuge in the temple of Zeus, and the god intervenes and saves them, placing them both in the sky."
    ,"Cassiopeia, in astronomy, a constellation of the northern sky easily recognized by a group of five bright stars forming a slightly irregular W. It lies at 1 hour right ascension and 60° north declination. Its brightest star, Shedar (Arabic for “breast”), has a magnitude of 2.2. Tycho’s Nova, one of the few recorded supernovas in the Milky Way Galaxy, appeared in Cassiopeia in 1572. This constellation also contains the prominent radio source Cassiopeia A, a supernova remnant, and the nearby galaxies Maffei I and II. In Greek mythology, Cassiopeia was the queen of Ethiopia whose daughter Andromeda was saved by the hero Perseus from being sacrificed to a sea monster.Tycho’s Nova, also called B Cassiopeiae or SN 1572, one of the few recorded supernovas in the Milky Way Galaxy. The Danish astronomer Tycho Brahe first observed the “new star” on Nov. 11, 1572. Other European observers claimed to have noticed it as early as the preceding August, but Tycho’s precise measurements showed that it was not some relatively nearby phenomenon, such as a comet, but at the distance of the stars, and that therefore real changes could occur among them.\n" +
            "\n" +
            "The supernova remained visible to the unaided eye until March 1574. It attained the apparent magnitude of Venus (about −4) and could be seen by day. There is no known stellar remnant but only traces of glowing nebulosity. It is, however, a radio and X-ray source. In 2008 a team of international astronomers used light from the original explosive event reflected off nearby interstellar dust to determine that Tycho’s Nova was a Type Ia supernova, which occurs when a white dwarf star accretes material from a companion star and that material explodes in a thermonuclear reaction that destroys the white dwarf.",
     "Taurus is a large constellation in the northern sky. Its name means “bull” in Latin. The constellation is symbolized by the bull’s head, ♉. It is one of the oldest constellations. Its history dates back to the Bronze Age.\n" +
             "\n" +
             "Taurus is one of the 12 constellations of the zodiac, first catalogued by the Greek astronomer Claudius Ptolemy in the 2nd century CE. In Greek mythology, the constellation is associated with Zeus, who transformed himself into a bull to get close to Europa and abduct her.\n" +
             "\n" +
             "Taurus is known for its bright stars Aldebaran, Elnath, and Alcyone, as well as for the variable star T Tauri. The constellation is also home to the Pleiades (Messier 45), also known as the Seven Sisters, and the Hyades, the two nearest open star clusters to Earth.Taurus has a number of other well-known deep sky objects. These include the supernova remnant Messier 1 (the Crab Nebula), Hind’s Variable Nebula (NGC 1555), the colliding galaxies NGC 1410 and NGC 1409, the Crystal Ball Nebula (NGC 1514), and the Merope Nebula (NGC 1435).\n" +
             "\n" +
             "Facts, location and map\n" +
             "Taurus is the 17th largest constellation in the sky, occupying an area of 797 square degrees. It is one of the 15 equatorial constellations. It is located in the first quadrant of the northern hemisphere (NQ1) and can be seen at latitudes between +90° and -65°. The neighboring constellations are Aries, Auriga, Cetus, Eridanus, Gemini, Orion and Perseus.\n" +
             "\n" +
             "The constellation name Taurus is pronounced /ˈtɔːrəs/. In English, the constellation is known as the Bull. The genitive form of Taurus, used in star names, is Tauri (pronunciation: /ˈtɔːraɪ/). The three-letter abbreviation, adopted by the International Astronomical Union (IAU) in 1922, is Tau.\n" +
             "\n" +
             "Taurus belongs to the zodiac family of constellations, along with Aries, Gemini, Cancer, Leo, Virgo, Libra, Scorpius, Sagittarius, Capricornus and Pisces.Taurus contains two Messier objects – Messier 1 (M1, NGC 1952, Crab Nebula) and Messier 45 (the Pleiades) – and has five stars that may have planets in their orbits. The brightest star in the constellation is Aldebaran, Alpha Tauri, with an apparent magnitude of 0.85. Aldebaran is also the 13th brightest star in the sky. There are two meteor showers associated with the constellation; the Taurids and the Beta Taurids. The Taurids peak in November, while the Beta Taurids can be seen in June and July.\n" +
             "\n" +
             "Taurus contains 17 formally named stars. The star names approved by the International Astronomical Union (IAU) are Ain, Alcyone, Aldebaran, Asterope, Atlas, Celaeno, Chamukuy, Electra, Elnath, Hoggar, Maia, Merope, Pleione, Prima Hyadum, Secunda Hyadum, Taygeta, and Tianguan." };
    Render render = new Render(cons_details.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cons_details);

        tvNameDetail = findViewById(R.id.tv_name_detail);
        imagePlanetDetail = findViewById(R.id.image_planet_detail);

        name_ex = findViewById(R.id.ex_name);
         Stars = findViewById(R.id.stars_of_planet);
        Area = findViewById(R.id.area);
        Decline = findViewById(R.id.decline);
        Symbolise = findViewById(R.id.symbol);
        right_asc = findViewById(R.id.right_ascen);
        data = findViewById(R.id.descrip_data);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            int val = extras.getInt("pos");
            tvNameDetail.setText(namesPlanets[val]);


            name_ex.setText(name_cel[val]);

            Area.setText(area_cel[val]);
            Decline.setText(decl_cel[val]);
            Stars.setText(stars_no[val]);
            Symbolise.setText(symb_cel[val]);

            right_asc.setText(asc_cel[val]);

            data.setText(describ[val]);
            imagePlanetDetail.setImageResource(imagePlanets[val]);
            render.setAnimation(new Zoom().In(imagePlanetDetail));
            render.start();
        }

    }
    }

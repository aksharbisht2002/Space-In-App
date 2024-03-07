package com.example.spacein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Fandq extends AppCompatActivity {
    

    RecyclerView recyclerView;
    List<Question> questionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fandq);

        recyclerView = findViewById(R.id.recyclerView);

        initData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        QuestionAdapter questionAdapter = new QuestionAdapter(questionList);
        recyclerView.setAdapter(questionAdapter);
        recyclerView.setHasFixedSize(true);


    }

    private void initData() {

        questionList = new ArrayList<>();

            questionList.add(new Question("01. I don't remember my password?", "\n" +
                    "Answer: You have already created an account but you can't remember your password? Click on 'Login/Sign Up' at the top of the page. Then click on 'Forgot Password?'. Fill out your phone number and a password recovery will be sent to you by phone."));
            questionList.add(new Question("02. How can I create an account at spacein.com?", "Answer: Click on 'Login & Sign up' at the top of the page. Then fill out your information in the 'Create an account' section and click the 'Sign Up' button."));
            questionList.add(new Question("03. How can I pursue a career in astronomy research?", "Answer: A good background in maths, physics, chemistry and computer science is required to be a modern astronomer — this means pursuing a scientific high school curriculum followed by earning a university degree in physics or maths or engineering and then earning a PhD in astronomy or astrophysics.\n" +
                    "\n" +
                    "Read more at: http://www.iau.org/public/careers/"));
            questionList.add(new Question("04. How can you calculate the position of the planets on a specific date?", "\n" +
                    "Answer: NASA's JPL Horizons website has an online tool for calculating the position of planets: http://ssd.jpl.nasa.gov/horizons.cgi\n" +
                    "\n" +
                    "For years earlier than 1000, include 'AD' or 'BC' in the ‘Time Span’ field."));
            questionList.add(new Question(" 05. Should I report the astronomical transient (supernova, etc…) to the CBAT or the TNS?", "\n" +
                    "Answer: The IAU Transient Name Server is the only official tool for reporting astronomical transients. The Central Bureau for Astronomical Telegrams(CBAT) in regards to transients ended on 1 January 2016.\n" +
                    "\n" +
                    "Read more about reporting procedures in general here: https://iau.org/public/themes/discoveries/"));
            questionList.add(new Question("06.I need help with my education. Can you help me? ", "Answer: We offer a number of programmes for recognition and skills development for early-career astronomers, such as the International School for Young Astronomers for master’s students and IAU PhD Prize for recent PhD graduates. We also grant a number of travel grants for each IAU meeting. You can find links here:\n" +
                    "\n" +
                    "International School for Young Astronomers: https://iau.org/training/school_for_young_astronomers/\n" +
                    "IAU PhD Prize: https://iau.org/science/grants_prizes/phd_prize/\n" +
                    "IAU travel grants: https://iau.org/science/grants_prizes/iau_grants/symposia_regional/\n" +
                    "\n" +
                    "The IAU offices also manage or fund a number of educational and outreach programmes that change throughout the year. Please see their websites for more information about opportunities through these offices:\n" +
                    "\n" +
                    "Office of Astronomy for Development: http://www.astro4dev.org\n" +
                    "Office for Astronomy Outreach: https://www.iau.org/public/oao/\n" +
                    "Office of Astronomy for Education: https://astro4edu.org\n" +
                    "\n" +
                    "The IAU does not offer direct funding, like scholarships, for educational opportunities at this time."));
            questionList.add(new Question(" 07. I have a specific question about an astronomical topic. Can you help?", "Answer:Unfortunately we are not able to answer emails about specific astronomical topics. However, there are several websites that can give you detailed information if you post a question.\n" +
                    "\n" +
                    "Some of these websites include:\n" +
                    "http://curious.astro.cornell.edu/\n" +
                    "https://imagine.gsfc.nasa.gov/ask_astro/index.html\n" +
                    "https://public.nrao.edu/ask/\n" +
                    "https://askanastronomer.org/"));
            questionList.add(new Question("08. I would like to know about the distribution of astronomers in my country and gender distribution of astronomers.?", "\n" +
                    "Answer: Please see our webpage on our membership statistics here: http://iau.org/administration/membership/individual/distribution/."));
            questionList.add(new Question("09. Can I send in feedback?", "Answer: Yes please use the feedback form to get in touch. we will try our best to improve in the future"));
            questionList.add(new Question("10.Will Apple's purchase and shut down of the Dark Sky APIs impact Astrospheric? ", "Answer: No. Astrospheric process raw planets weather model data on its own servers instead of repackaging other company's planets weather APIs. However, astronomers using apps such as Clear Outside or the myriad of other weather apps that state \"Powered by Dark Sky\" or \"Powered by Forecast' may notice changes as those app developers find new sources for their data. "));
            questionList.add(new Question("11.What other planets weather data sources are valuable to astronomers? ", "Answer: There are thousands of planets weather apps and websites available, but it can be tough to know if they will work well for astronomy. Here are a few tips that can help in picking them out.\n" +
                    "\n" +
                    "Go to the source of the data and know what weather model you're looking at.\n" +
                    "\n" +
                    "Check more than one weather model. Look at the data on a map since it's still the best way to understand the weather patterns.\n" +
                    "\n" +
                    "Weather gov is a great resource for those in the USA since it gets you access to the primary US weather models (GFS, NAM, HRRR, etc). If you're feeling adventurous, you can access raw model data at https://nomads.ncep.noaa.gov/"));
            questionList.add(new Question("12. Support team contact ?", "Answer: Mail Id: customercare@SpaceIn.com Phone No: +91 - 9821764483\n"));
            questionList.add(new Question("13. Why doesn't Astrospheric work on my (insert Android device) ?", "Answer: I like Android and use it on my daily phone. Technically I've targeted the build to work on Android 5.1 and higher, which means it can run on tens of thousands of different devices. Unfortunately it is not possible for me to test all of these configurations so I've placed a few blocks on certain devices to ensure a better user experience.\n" +
                    "\n" +
                    "• The device must be on Android 5.1 or higher. • The device must have at least 1GB of RAM.\n" +
                    "\n" +
                    "• The device must be running a Google approved version of Android which passes attestation tests.\n" +
                    "\n" +
                    "Devices that have had the base Android OS modified (rooted, custom ROM, etc) will likely not pass. If you have a device meeting the above requirements but Google Play reports the app isn't compatible with your device then it's likely an attestation test failure.\"\n" +
                    "\n" +
                    "Note: I do not get data on why your device has failed an attestation test so I can not help in figuring out why the app isn't compatible. The example here is just one of many tests the Google Play store runs to verify device compatibility.\n" +
                    "\n" +
                    "Without these basic tests in place, I found I was spending well over 90% of my development time fielding Android issues. This cuts into development time for other aspects of the service (iOS, browser, backend services, etc)."));


    }
}
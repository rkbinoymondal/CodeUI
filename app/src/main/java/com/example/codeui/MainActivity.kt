package com.example.codeui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.codeui.Adapter.ProfileAdapter
import com.example.codeui.Model.ProfileData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val profileList = findViewById<RecyclerView>(R.id.profileList)

        val dataList = mutableListOf<ProfileData>(
            ProfileData(
                "About Me",
                "Hello! My name is Binoy Mondal.\n● I am a first-year B.Tech student at the Indian Institute of Information Technology (IIIT) Lucknow pursuing Information Technology(IT) branch.\n● I completed my schooling at DAV Public School, DVC, MTPS, securing 93.4% in Class 10 and 96% in Class 12.\n" +
                        "● Passionate about exploring CS, building skills, and gaining hands-on experience."
            ),
            ProfileData(
                "Skills", "● Learning Kotlin, XML for Android Development\n" +
                        "● Basic understanding of Python\n" +
                        "● Learning C and C++ to strengthen problem-solving and logic-building skills(Competitive Programming)\n" +
                        "● Familiar with writing clean and readable code\n" +
                        "● Basic understanding of programming logic, loops, and functions"
            ),
            ProfileData(
                "Achievements", "● Attained 9.5 SGPA in 1st Sem\n" +
                        "● Secured 93.4% in Class 10 and 96% in Class 12 from DAV Public School, DVC, MTPS.\n" +
                        "● Achieved a General Merit Rank of 618 in WBJEE.\n" +
                        "● Scored 99.27 percentile in JEE Mains.\n" +
                        "● Secured an All India Rank of 9967 in JEE Advanced.\n" +
                        "● Attained a 1486 rating on CodeChef.\n" +
                        "● Winner of Karamat(App Event)"
            ),
            ProfileData(
                "Hobbies", "● Enjoy playing Badminton\n" +
                        "● Love to do Competitive Programming\n" +
                        "● Enjoy walking in nature to refresh myself"
            ),
            ProfileData(
                "Social Media Handles", "● Github : https://github.com/rkbinoymondal\n" +
                        "● LinkedIn : https://www.linkedin.com/in/binoy-mondal-361065381/"
            ),
            ProfileData(
                "Contact Details", "● Phone : 6297253638\n" +
                        "● email Id : lit2025032@iiitl.ac.in\n" +
                        "● Address : Bankura, WestBengal, India"
            )
        )

        val adapt = ProfileAdapter(this,dataList)
        profileList.adapter = adapt

        val layoutManager = com.google.android.material.carousel.CarouselLayoutManager()
        profileList.layoutManager = layoutManager


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
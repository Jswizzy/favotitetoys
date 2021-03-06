package com.example.jns.favotitetoys

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toybox.forEach {
            tv_toy_names.append("$it\n\n\n")
        }
    }
}

val toybox = listOf(
        "Red Toy Wagon",
        "Chemistry Set",
        "Yo-Yo",
        "Pop-Up Book",
        "Generic Uncopyrighted Mouse",
        "Finger Paint",
        "Sock Monkey",
        "Microscope Set",
        "Beach Ball",
        "BB Gun",
        "Green Soldiers",
        "Bubbles",
        "Spring Toy",
        "Fortune Telling Ball",
        "Plastic Connecting Blocks",
        "Water Balloon",
        "Paint-by-Numbers Kit",
        "Tuber Head",
        "Cool Ball with Holes in It",
        "Toy Truck",
        "Flying Disc",
        "Two-Handed Pogo Stick",
        "Toy Hoop",
        "Dysmorphia Doll",
        "Toy Train",
        "Fake Vomit",
        "Toy Telephone",
        "Barrel of Primates",
        "Remote Control Car",
        "Square Puzzle Cube",
        "Football",
        "Intergalactic Electronic Phasers",
        "Baby Horse Dolls",
        "Machines that turn into other Machines",
        "Teddy Bears",
        "Shaved Ice Maker",
        "Glow Stick",
        "Squirt Guns",
        "Miniature Replica Animals Stuffed with Beads that you swore to your parents would be worth lots of money one day",
        "Creepy Gremlin Doll",
        "Neodymium-Magnet Toy"
)
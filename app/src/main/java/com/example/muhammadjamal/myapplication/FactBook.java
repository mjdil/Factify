package com.example.muhammadjamal.myapplication;


import java.util.Random;

public class FactBook {

    private String[] mfacts = {
            "There are more Barbie dolls in Italy than there are Canadians in Canada.",
            "It is physically impossible for pigs to look up into the sky.",
            "If you fart consistently for 6 years and 9 months, enough gas is produced to create explosion that is equal to an atomic bomb.",
            "To escape the grip of a crocodile's jaws, push your thumbs into its eyeballs - it will let you go instantly.",
            "In England, the Speaker of the House is not allowed to speak.",
            "Every continent begins and ends in the same letter.",
            "Every continent has a city called Rome.",
            "Two thirds of the world's eggplant is grown in New Jersey.",
            "The electric chair was invented by a dentist.",
            "Right handed people live on average nine years longer than left handed people do.",
            "The sentence ‘the quick brown fox jumps over the lazy dog’ uses every letter in the English language.",
            "No president of the United States was an only child.",
            "TYPEWRITER is one of the longest words that can be made using the letters on only one row of the keyboard.",
            "If the population of China walked past you in single file, the line would never end because of the rate of reproduction.",
            "The word racecar and kayak are the same whether they are read left to right or right to left.",
            "A snail can sleep for 3 years.",
            "American Airlines saved $40,000 in 1987 by eliminating one olive from each salad served in first-class.",
            "China has more English speakers than the United States.",
            "An average chocolate bar has 8 insects' legs in it.",
            "An average human eats 8 spiders in their lifetime at night.",
            "A cockroach can live nine days without its head before it starves to death.",
            "Donald Duck comics were banned in Finland because Donald Duck does not wear pants.",
            "STEWARDESSE is one of the longest words typed with only the left hand.",
            "Marilyn Monroe had six toes.",
            "By the age of 65 an average person will have seen 2,000,000 commercials.",
            "Women blink nearly twice as much as men.",
            "The longest town name in the world has 167 letters.",
            "In a year the average person walks four miles making his or her bed.",
            "A goldfish's attention span is three seconds.",
            "A camel has 3 eyelids.",
            "You burn 20 calories per hour chewing gum.",
            "An average American will eat 35,000 cookies during his or her lifetime.",
            "Every day more money is printed for Monopoly than for the US Treasury.",
            "Men can read smaller print than women can; women can hear better.",
            "Only 1 out of 1000 people can lick their elbow.",
            "Most people that read this will try to lick their elbow.",
            "The state with the highest percentage of people who walk to work is Alaska.",
            "The cost of raising a medium sized dog to the age of eleven is $6,400.",
            "The average number of people airborne over the US at any given hour is 61,000.",
            "Intelligent people have more zinc and copper in their hair.",
            "The world's youngest parents were 8 and 9 years old and lived in China in 1910.",
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."};


    public String getfact() {


        String fact = "";
        //randomly select a fact
        Random randomGenerator = new Random();
        int randomnumber = randomGenerator.nextInt(mfacts.length);
        fact = mfacts[randomnumber];
        return fact;


    }
}

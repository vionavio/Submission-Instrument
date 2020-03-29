package com.example.instrument.data;

import com.example.instrument.R;
import com.example.instrument.model.Instrument;

import java.util.ArrayList;

import javax.net.ssl.TrustManager;

public class InstrumentData {

    private static String[] InstrumentNames = {
            "Bass Drum",
            "Cello",
            "Clarinet",
            "Cymbals",
            "Double Bass",
            "Flute",
            "French Horn",
            "Harp",
            "Oboe",
            "Piano",
            "Saxophone",
            "Timpani",
            "Trombone",
            "Trumpet",
            "Tuba",
            "Viola",
            "Violin"
    };

    private static String[] yearInvented = {
            "1909",
            "1535-1536",
            "1700",
            "7th century BC",
            "1542",
            "1794-1881",
            "1800s",
            "2500 BC",
            "Mid 1700s",
            "Early 18th century",
            "28th June 1846",
            "Late 1800's",
            "Between 1500s - 1800s",
            "1500 BC",
            "1835",
            "1530 and 1550",
            "16th century"
    };

    private static String[] placeInvented = {
            "Chicago",
            "Italy",
            "Germany",
            "China",
            "Venice",
            "Germany",
            "Germany",
            "France",
            "France",
            "Italy",
            "Belgium",
            "Timpani",
            "Vienna",
            "Egypt",
            "Germany",
            "Western Europe",
            "Italy"
    };

    private static String[] inventedBy = {
            "William F. Ludwig",
            "Gaudenzio Fenali in Saronno",
            "Johann Christoph Denner",
            "unknown",
            "Silvestro Ganassi",
            "Theobald Boehm",
            "unknown",
            "Jacques-Georges Cousineau",
            "unknown",
            "Bartolomeo Cristofori",
            "Antoine-Joseph",
            "Pittrich",
            "unknown",
            "Heinrich Stoelzel and Friedrich Bluhmel",
            "Wilhelm Friedrich Wieprecht and Johann Gottfried Moritz",
            "Andrea Amati",
            "Gaudenzio Ferrari"
    };


    private static String[] BassDrum = { "Percussion","Individual", "Drummer"};
    private static String[] Cello = { "Violoncello","Strings", "Cellist"};
    private static String[] Clarinet = { "Wind","Woodwind", "Clarinetist"};
    private static String[] Cymbals = { "Percussion","Alloy", "Cymbalist."};
    private static String[] DooubleBass = { "Bass","Strings", "Bassist"};
    private static String[] Flute = { "Woodwind","Aerophone", "Flutist"};
    private static String[] FrenchHorn = { "Horn","Aerophone","Wind", "Horn player"};
    private static String[] Harp = { "Nylon","String", "Harpist"};
    private static String[] Oboe = { "Double reed","Woodwind", "Oboe Player"};
    private static String[] Piano = { "Acoustic","Pianoforte", "Pianist"};
    private static String[] Saxophone = { "Woodwind","Aerophone", "Saxophonist"};
    private static String[] Timpani = { "Kettledrums","Timps", "Timpanist"};
    private static String[] Trombone = { "Wind","Brass", "Trombonist"};
    private static String[] Trumpet = { "Wind","Brass", "Trumpeter"};
    private static String[] Tuba = { "Wind","Brass", " Tubist"};
    private static String[] Viola = { "Wood","Strings", "Violist"};
    private static String[] Violin = { "Wood","Strings", "Violinist"};

    private static String[][] Instrument ={BassDrum,Cello,Clarinet, Cymbals, DooubleBass,
    Flute, FrenchHorn, Harp,  Oboe, Piano, Saxophone, Timpani,Trombone, Trumpet
            ,Tuba , Viola,Violin
    };

    private static String[] InstrumentDetails = {
            "A bass drum, or kick drum, is a large drum that produces a note of low definite or indefinite pitch. A bass drum is typically cylindrical, with the drum's diameter much greater than the drum's depth. There is normally a struck head at both ends of the cylinder. The heads may be made of calf skin or plastic.",
            "The cello or violoncello is a bowed string instrument of the violin family. Its four strings are usually tuned in perfect fifths: from low to high, C₂, G₂, D₃ and A₃, an octave lower than the viola. Music for the cello is generally written in the bass clef, with tenor clef and treble clef used for higher-range passages.",
            "The clarinet is a family of woodwind instruments. It has a single-reed mouthpiece, a straight, cylindrical tube with an almost cylindrical bore, and a flared bell. A person who plays a clarinet is called a clarinetist (sometimes spelled clarinettist).  ",
            "Cymbals are used in many ensembles ranging from the orchestra, percussion ensembles, jazz bands, heavy metal bands, and marching groups. Drum kits usually incorporate at least a crash, ride, or crash/ride, and a pair of hi-hat cymbals. A player of cymbals is known as a cymbalist.",
            "The double bass, or simply the bass (and numerous other names), is the largest and lowest-pitched bowed string instrument in the modern symphony orchestra. It is a standard member of the orchestra's string section, as well as the concert band, and is featured in concertos, solo, and chamber music in Western classical music",
            "The flute is a family of musical instruments in the woodwind group. Unlike woodwind instruments with reeds, a flute is an aerophone or reedless wind instrument that produces its sound from the flow of air across an opening. According to the instrument classification of Hornbostel–Sachs, flutes are categorized as edge-blown aerophones. A musician who plays the flute can be referred to as a flute player, flautist, flutist or, less commonly, fluter or flutenist. ",
            "The French horn (since the 1930s known simply as the \"horn\" in some professional music circles) is a brass instrument made of tubing wrapped into a coil with a flared bell. The double horn in F/B♭ (technically a variety of German horn) is the horn most often used by players in professional orchestras and bands. A musician who plays a French horn is known as a horn player or hornist. ",
            "The harp is a stringed musical instrument that has a number of individual strings running at an angle to its soundboard; the strings are plucked with the fingers. Harps have been known since antiquity in Asia, Africa and Europe, dating back at least as early as 3500 BC. The instrument had great popularity in Europe during the Middle Ages and Renaissance, where it evolved into a wide range of variants with new technologies, and was disseminated to Europe's colonies, finding particular popularity in Latin America. Although some ancient members of the harp family died out in the Near East and South Asia, descendants of early harps are still played in Myanmar and parts of Africa, and other defunct variants in Europe and Asia have been utilized by musicians in the modern era. ",
            "The Oboe (/ˈoʊboʊ/ OH-boh) is a type of double reed woodwind instrument. Oboes are usually made of wood, but may also be made of synthetic materials, such as plastic or resin. The most common oboe plays in the treble or soprano range. A soprano oboe measures roughly 65 cm (25 1⁄2 in) long, with metal keys, a conical bore and a flared bell. Sound is produced by blowing into the reed at a sufficient air pressure, causing it to vibrate with the air column. The distinctive tone is versatile and has been described as \"bright\". When the word oboe is used alone, it is generally taken to mean the treble instrument rather than other instruments of the family, such as the bass oboe, the cor anglais (English horn), or oboe d'amore. A musician who plays the oboe is called an oboist. ",
            "The piano is an acoustic, stringed musical instrument invented in Italy by Bartolomeo Cristofori around the year 1700 (the exact year is uncertain), in which the strings are struck by hammers. It is played using a keyboard, which is a row of keys (small levers) that the performer presses down or strikes with the fingers and thumbs of both hands to cause the hammers to strike the strings.  The word piano is a shortened form of pianoforte, the Italian term for the early 1700s versions of the instrument, which in turn derives from gravicembalo col piano e forte[1] and fortepiano. The Italian musical terms piano and forte indicate \"soft\" and \"loud\" respectively, in this context referring to the variations in volume (i.e., loudness) produced in response to a pianist's touch or pressure on the keys: the greater the velocity of a key press, the greater the force of the hammer hitting the strings, and the louder the sound of the note produced and the stronger the attack.",
            "The saxophone (referred to colloquially as the sax) is a woodwind instrument. Saxophones are usually made of brass and played with a single-reed mouthpiece similar to that of the clarinet. Although most saxophones are made from brass, they are categorized as woodwind instruments, because sound is produced by an oscillating reed, traditionally made out of woody cane, rather than lips vibrating in a mouthpiece cup as with the brass instrument family. As with the other woodwind instruments, the pitch of the note being played is controlled by covering holes in the body tube to control the resonant frequency of the air column by changing the effective length of the tube.\n" +
                    "\n" +
                    "The saxophone is used in classical music (such as concert bands, chamber music, solo repertoire, and, occasionally, orchestras), military bands, marching bands, jazz (such as big bands and jazz combos), and contemporary music. The saxophone is also used as a solo and melody instrument or as a member of a horn section in some styles of rock and roll and popular music. Saxophone players are called saxophonists. ",
            "Timpani (/ˈtɪmpəni/; Italian pronunciation: [ˈtimpani]) or kettledrums (also informally called timps) are musical instruments in the percussion family. A type of drum categorised as a semispherical drum, they consist of a membrane called a head stretched over a large bowl traditionally made of copper. Most modern timpani are pedal timpani and can be tuned quickly and accurately to specific pitches by skilled players through the use of a movable foot-pedal. They are played by striking the head with a specialized drum stick called a timpani stick or timpani mallet. Timpani evolved from military drums to become a staple of the classical orchestra by the last third of the 18th century. Today, they are used in many types of ensembles, including concert bands, marching bands, orchestras, and even in some rock bands. ",
            "The trombone is a musical instrument in the brass family. As on all brass instruments, sound is produced when the player's vibrating lips (embouchure) cause the air column inside the instrument to vibrate. Nearly all trombones have a telescoping slide mechanism that varies the length of the instrument to change the pitch. Many modern trombone models also use a valve attachment to lower the pitch of the instrument. Variants such as the valve trombone and superbone have three valves similar to those on the trumpet.\n" +
                    "\n" +
                    "The word \"trombone\" derives from Italian tromba (trumpet) and -one (a suffix meaning \"large\"), so the name means \"large trumpet\".",
            "A trumpet is a brass instrument commonly used in classical and jazz ensembles. The trumpet group contains the instruments (such as the piccolo trumpet) with the highest register in the brass family. Trumpet-like instruments have historically been used as signaling devices in battle or hunting, with examples dating back to at least 1500 BC; they began to be used as musical instruments only in the late 14th or early 15th century. Trumpets are used in art music styles, for instance in orchestras, concert bands, and jazz ensembles, as well as in popular music. They are played by blowing air through nearly-closed lips (called the player's embouchure), producing a \"buzzing\" sound that starts a standing wave vibration in the air column inside the instrument. Since the late 15th century they have primarily been constructed of brass tubing, usually bent twice into a rounded rectangular shape.",
            "The tuba (/ˈtjuːbə/; Italian: [ˈtuːba]) (bass) is the lowest-pitched musical instrument in the brass family. As with all brass instruments, the sound is produced by lip vibration into a large mouthpiece. It first appeared in the mid-19th century, making it one of the newer instruments in the modern orchestra and concert band. The tuba largely replaced the ophicleide. Tuba is Latin for 'trumpet'.\n" +
                    "\n" +
                    "In America, a person who plays the tuba is known as a tubaist or tubist. In the United Kingdom, a person who plays the tuba in an orchestra is known simply as a tuba player; in a brass band or military band, they are known as bass players. ",
            "The viola (/viˈoʊlə/ vee-OH-lə, also UK: /vaɪˈoʊlə/ vy-OH-lə,[a] Italian: [ˈvjɔːla, viˈɔːla]) is a string instrument that is bowed or played with varying techniques. It is slightly larger than a violin and has a lower and deeper sound. Since the 18th century, it has been the middle or alto voice of the violin family, between the violin (which is tuned a perfect fifth above) and the cello (which is tuned an octave below). The strings from low to high are typically tuned to C3, G3, D4, and A4.\n" +
                    "\n" +
                    "In the past, the viola varied in size and style, as did its names. The word viola originates from the Italian language. The Italians often used the term: viola da braccio meaning literally: 'of the arm'. \"Brazzo\" was another Italian word for the viola, which the Germans adopted as Bratsche. The French had their own names: cinquiesme was a small viola, haute contre was a large viola, and taile was a tenor. Today, the French use the term alto, a reference to its range. ",
            "The violin, sometimes known as a fiddle, is a wooden string instrument in the violin family. Most violins have a hollow wooden body. It is the smallest and highest-pitched instrument in the family in regular use. Smaller violin-type instruments exist, including the violino piccolo and the kit violin, but these are virtually unused. The violin typically has four strings, usually tuned in perfect fifths with notes G3, D4, A4, E5, and is most commonly played by drawing a bow across its strings, though it can also be played by plucking the strings with the fingers (pizzicato) and by striking the strings with the wooden side of the bow (col legno).\n" +
                    "\n" +
                    "Violins are important instruments in a wide variety of musical genres. They are most prominent in the Western classical tradition, both in ensembles (from chamber music to orchestras) and as solo instruments and in many varieties of folk music, including country music, bluegrass music and in jazz. Electric violins with solid bodies and piezoelectric pickups are used in some forms of rock music and jazz fusion, with the pickups plugged into instrument amplifiers and speakers to produce sound. Further, the violin has come to be played in many non-Western music cultures, including Indian music and Iranian music. The name fiddle is often used regardless of the type of music played on it. "
             };

    private static int[] InstrumentesImages = {
            R.drawable.bass_drum,
            R.drawable.cello,
            R.drawable.clarinet,
            R.drawable.cymbals,
            R.drawable.double_bass,
            R.drawable.flute,
            R.drawable.french_horn,
            R.drawable.harp,
            R.drawable.oboe,
            R.drawable.piano,
            R.drawable.saxophone,
            R.drawable.timpani,
            R.drawable.trombone,
            R.drawable.trumpet,
            R.drawable.tuba,
            R.drawable.viola,
            R.drawable.violin
    };

    public static ArrayList<Instrument> getListData() {
        ArrayList<Instrument> list = new ArrayList<>();
        for (int position = 0; position < InstrumentNames.length; position++) {
            Instrument Instrument = new Instrument();
            Instrument.setName(InstrumentNames[position]);
            Instrument.setPenemu(inventedBy[position]);
            Instrument.setTempat(placeInvented[position]);
            Instrument.setTahun(yearInvented[position]);
            Instrument.setDetail(InstrumentDetails[position]);
            Instrument.setPhoto(InstrumentesImages[position]);
            list.add(Instrument);
        }
        return list;
    }

}

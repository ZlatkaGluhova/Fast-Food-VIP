package objectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    public static final String DASHES = "--------------------------";

    public static void main(String[] args) {

        String[] allMusic = new String[]{"Azis_Saint Tropez_3:35", "Fiki_Otpusni se_4:12", "Galena_Euphoria_3:43",
                "Fiki_Chupki v krusta_4:53", "Galena_Ti ne si za men_3:39", "Azis_Buda bar_4:41", "Azis_Buda bar2_4:42",
                "Galena_Welcome to Bulgaria_4:43", "Azis_Napipai go_3:27", "Fiki2_Sen Tropez(Remix)_3:35"};

        init(allMusic);
    }


    private static void init(String[] allMusic){
        Scanner scanner = new Scanner(System.in);
        List<Music> songs = new ArrayList<>();

        createMusicWithSongs(allMusic, songs);
        printText();
        List<String> unicArtists = createUnicListOfArtists(songs);

        // TODO Print unic Artists

        checkNumbers(scanner, unicArtists, songs);

//        checkArtist(scanner, unicArtists);
        String filter = checkArtist(scanner, unicArtists);
        System.out.println(DASHES);
        filterByCategory(songs, filter);
        System.out.println(DASHES);
    }


    private static String checkArtist(Scanner scanner, List<String> unicArtists){

        int inputArtist = Integer.parseInt(scanner.nextLine());
        String filter = "not found";
        for (int i = 0; i < unicArtists.size(); i++) {
            if (inputArtist == i + 1) {
                filter = unicArtists.get(i);
            }
        }

        if (filter.equals("not found")) {
            exception();

           //TODO return;
        }
        return filter;
    }


    private static void checkNumbers(Scanner scanner, List<String> unicArtists,  List<Music> songs){
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 1) {
            printAnotherText();
            int number = 1;
            for (String artist : unicArtists) {
                System.out.printf("%d. %s%n", number, artist);
                number += 1;
            }
        } else if (input == 2) {
            printAnotherText();
            for (int i = 0; i < songs.size(); i++) {
                Music music = songs.get(i);
                System.out.printf("%d. %s%n", i + 1, music.getName());
            }
        } else {
            exception();
            return;
        }
        System.out.println(DASHES);

        if (input == 2) {
            int numberOfTheSong = Integer.parseInt(scanner.nextLine());

            if (numberOfTheSong <= 0 || numberOfTheSong > songs.size()) {
                exception();
                return;
            }

            for (int i = 0; i < songs.size(); i++) {
                Music music = songs.get(i);
                if (i + 1 == (numberOfTheSong)) {
                    System.out.println(DASHES);
                    System.out.println("You chose the following song:");
                    System.out.println(DASHES);
                    System.out.printf("%d. %s - %s - %s%n", numberOfTheSong, music.getCategory(), music.getName(), music.getMinutes());
                    System.out.println(DASHES);
                    return;
                }
            }
        }
    }

    private static List<String> createUnicListOfArtists(List<Music> songs) {
        List<String> unicArtists = new ArrayList<>();
        for (int i = 0; i < songs.size(); i++) {
            Music music = songs.get(i);
            if (!unicArtists.contains(music.getCategory())) {
                unicArtists.add(music.getCategory());
            }
        }
        return unicArtists;
    }

    private static void createMusicWithSongs(String[] allMusic, List<Music> songs) {
        for (int i = 0; i < allMusic.length; i++) {
            Music music = createMusic(allMusic[i]);
            songs.add(music);
        }
    }

    private static Music createMusic(String musicUnit){
        String[] theSongs = musicUnit.split("_");
        Music music = new Music();
        music.setCategory(theSongs[0]);
        music.setName(theSongs[1]);
        music.setMinutes(theSongs[2]);

        return music;
    }


    private static void exception() {
        System.out.println(DASHES);
        System.out.println("Not found in current list!");
        System.out.println("Retry!");
        System.out.println(DASHES);
    }

    private static void printText() {
        System.out.println(DASHES);
        System.out.println("Welcome to music library!");
        System.out.println(DASHES);
        System.out.println("Choose by number from current list:");
        System.out.println(DASHES);
        System.out.println("1. Artist");
        System.out.println("2. Name of song");
        System.out.println(DASHES);

    }

    private static void printAnotherText() {
        System.out.println(DASHES);
        System.out.println("Choose by number from current list:");
        System.out.println(DASHES);

    }

    private static void filterByCategory(List<Music> songs, String filter) {
        for (int i = 0; i < songs.size(); i++) {
            Music music = songs.get(i);
            if (music.getCategory().equals(filter)) {
                System.out.printf("%s - %s - %s%n", filter, music.getName(), music.getMinutes());
            }
        }
    }
}
/*
Welcome to music library!
...........
Choose by number from current list:
1. artist -> samo Azis, Galena, Fiki -> izkarvam "Pesni na Azis" - vsichki pesni + vremetraeneto - bez imeto na izpulnitelq
2. Name of song -> samo imenata na pesnite -> da printiram imeto na izpulnitelq, pesenta i vremeto ili "not found" - po nomer
...........
Choose by number, name of the song:
 */

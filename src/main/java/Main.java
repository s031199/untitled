import java.sql.SQLOutput;
import java.util.*;
import java.util.logging.Level;

enum menupasirinkimai {
    MENIU,
    Kompozicija,
    Comparable,
    Comparator,
    Queue
}

public class Main extends Naudotojas {
    public static void main(String[] args) {
        System.out.println("Programos meniu:");
        System.out.println(menupasirinkimai.MENIU + " Meniu pateikimas");
        boolean keepGoing = true;


do {
    Scanner input = new Scanner(System.in);
    String menupasirinkimai = input.next();
    switch (menupasirinkimai) {
        case "MENIU":
            System.out.println("MENIU PATEIKIMAS");
            EnumSet.allOf(menupasirinkimai.class)
                    .forEach(day -> System.out.println(day));
            break;
        case "Kompozicija":
            Naudotojas naudotojas = new Naudotojas();
            System.out.println("Irasykite savo varda: ");
            naudotojas.setVardas(input.next());
            System.out.println("Irasykite savo pavarde: ");
            naudotojas.setPavarde(input.next());
            System.out.println("Irasykite savo amziu: ");

            try {
                naudotojas.setAmzius(Integer.parseInt(input.next()));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Blogai irasytas skaicius ");
            }

            Person person = new Person();
            String vardas = person.getNaudotojasvardas();
            String pavarde = person.getNaudotojaspavarde();
            int amzius = person.getNaudotojasamzius();

            System.out.println(vardas + " " + pavarde + " " + amzius);

            break;
        case "Comparable":
            ArrayList<Movie> list = new ArrayList<Movie>();
            list.add(new Movie("Force Awakens", 8.3, 2015));
            list.add(new Movie("Star Wars", 8.7, 1977));
            list.add(new Movie("Empire Strikes Back", 8.8, 1980));
            list.add(new Movie("Return of the Jedi", 8.4, 1983));

            Collections.sort(list);

            System.out.println("Movies after sorting : ");
            for (Movie movie : list) {
                System.out.println(movie.getName() + " " +
                        movie.getRating() + " " +
                        movie.getYear());
            }

            break;
        case "Comparator":
            ArrayList<Movie> listcomparator = new ArrayList<Movie>();
            listcomparator.add(new Movie("Force Awakens", 8.3, 2015));
            listcomparator.add(new Movie("Star Wars", 8.7, 1977));
            listcomparator.add(new Movie("Empire Strikes Back", 8.8, 1980));
            listcomparator.add(new Movie("Return of the Jedi", 8.4, 1983));

            // Sort by rating : (1) Create an object of ratingCompare
            //                  (2) Call Collections.sort
            //                  (3) Print Sorted list
            System.out.println("Sorted by rating");
            RatingCompare ratingCompare = new RatingCompare();
            Collections.sort(listcomparator, ratingCompare);
            for (Movie movie : listcomparator)
                System.out.println(movie.getRating() + " " +
                        movie.getName() + " " +
                        movie.getYear());
            break;
        case "Queue":
            Queue<Integer> q = new LinkedList<>();

            // Adds elements {0, 1, 2, 3, 4} to queue
            for (int i = 0; i < 5; i++)
                q.add(i);

            // Display contents of the queue.
            System.out.println("Elements of queue-" + q);

            // To remove the head of queue.
            int removedele = q.remove();
            System.out.println("removed element-" + removedele);

            System.out.println(q);

            // To view the head of queue
            int head = q.peek();
            System.out.println("head of queue-" + head);

            // Rest all methods of collection interface,
            // Like size and contains can be used with this
            // implementation.
            int size = q.size();
            System.out.println("Size of queue-" + size);
            break;
        case "iseiti":
                keepGoing = false;
                break;
            default:
            System.out.println("Prasome irasyti is naujo");
            break;
    }
}while(keepGoing);
        System.out.println("Viso gero!"); // Display the string.
    }
}


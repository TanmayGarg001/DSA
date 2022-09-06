<<<<<<< HEAD
//4.Why is String immutable in Java?
package com.company;

public class Main4 {

    public static void main(String[] args) {
        //https://stackoverflow.com/questions/22397861/why-is-string-immutable-in-java
        //https://www.javatpoint.com/why-string-is-immutable-or-final-in-java#:~:text=The%20String%20is%20immutable%20in,it%20makes%20the%20String%20immutable.
        //https://www.baeldung.com/java-string-immutable
        //https://www.geeksforgeeks.org/java-string-is-immutable-what-exactly-is-the-meaning/
        //In short String in java are immutable because of thread safety,synchronization,security purposes and optimization.
        //features that immutability provides, such as caching, security, easy reuse without replication, etc.
        //https://youtu.be/NcQd0cN0JC4
        //WATCH THIS VIDEO:-
        //https://www.youtube.com/watch?v=4cEsJtuW4YY
        //String is immutable for several reasons, here is a summary:
        //Security: parameters are typically represented as String in network connections, database connection urls, usernames/passwords etc. If it were mutable,
        // these parameters could be easily changed.
        //Synchronization and concurrency: making String immutable automatically makes them thread safe thereby solving the synchronization issues.
        //Caching: when compiler optimizes your String objects, it sees that if two objects have same valued (a="test", and b="test") and thus you need
        // only one string object (for both a and b, these two will point to the same object).
        //Class loading: String is used as arguments for class loading. If mutable, it could result in wrong class being loaded (because mutable objects change their state).

        String s = new String("Timmy");//Creates object in heap memory
        String s2 = "Timmy";//Creates object in String Literal Pool and will check if Timmy already exists and s2 will refer that
        //if I make s3="Timmy" it will not create new object as it will point to the same value in String Literal Pool.
        System.out.println(s);
        s.concat("Savage");
        System.out.println(s);
        s = s.concat("Savage");//This will create a new object and point to that now
        System.out.println(s);
    }

}
=======
//4.Why is String immutable in Java?
package com.company;

public class Main4 {

    public static void main(String[] args) {
        //https://stackoverflow.com/questions/22397861/why-is-string-immutable-in-java
        //https://www.javatpoint.com/why-string-is-immutable-or-final-in-java#:~:text=The%20String%20is%20immutable%20in,it%20makes%20the%20String%20immutable.
        //https://www.baeldung.com/java-string-immutable
        //https://www.geeksforgeeks.org/java-string-is-immutable-what-exactly-is-the-meaning/
        //In short String in java are immutable because of thread safety,synchronization,security purposes and optimization.
        //features that immutability provides, such as caching, security, easy reuse without replication, etc.
        //https://youtu.be/NcQd0cN0JC4
        //WATCH THIS VIDEO:-
        //https://www.youtube.com/watch?v=4cEsJtuW4YY
        //String is immutable for several reasons, here is a summary:
        //Security: parameters are typically represented as String in network connections, database connection urls, usernames/passwords etc. If it were mutable,
        // these parameters could be easily changed.
        //Synchronization and concurrency: making String immutable automatically makes them thread safe thereby solving the synchronization issues.
        //Caching: when compiler optimizes your String objects, it sees that if two objects have same valued (a="test", and b="test") and thus you need
        // only one string object (for both a and b, these two will point to the same object).
        //Class loading: String is used as arguments for class loading. If mutable, it could result in wrong class being loaded (because mutable objects change their state).

        String s = new String("Timmy");//Creates object in heap memory
        String s2 = "Timmy";//Creates object in String Literal Pool and will check if Timmy already exists and s2 will refer that
        //if I make s3="Timmy" it will not create new object as it will point to the same value in String Literal Pool.
        System.out.println(s);
        s.concat("Savage");
        System.out.println(s);
        s = s.concat("Savage");//This will create a new object and point to that now
        System.out.println(s);
    }

}
>>>>>>> 26b1aac (Final Commit_1)

package oops;

/*
 * Demonstrates:
 * - finalize() method
 * - Garbage Collection
 * - Object eligibility for GC
 *
 * ⚠ finalize() is deprecated from Java 9 onward.
 * This example is ONLY for learning & interviews.
 */

class GarbageCollectionFinalizePractice {

    private int id;

    GarbageCollectionFinalizePractice(int id) {
        this.id = id;
        System.out.println("Object created with id: " + id);
    }

    // finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called for object id: " + id);
    }

    public static void main(String[] args) {

        System.out.println("Main started");

        // Creating objects
        GarbageCollectionFinalizePractice obj1 =
                new GarbageCollectionFinalizePractice(1);

        GarbageCollectionFinalizePractice obj2 =
                new GarbageCollectionFinalizePractice(2);

        // Making objects eligible for Garbage Collection
        obj1 = null;
        obj2 = null;

        // Requesting JVM for Garbage Collection
        System.gc();

        System.out.println("End of main method");
    }
}

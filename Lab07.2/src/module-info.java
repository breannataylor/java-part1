/*
 * A module is a collection of related packages.
 * Those packages are not listed here, they are simply the ones that live here together.
 * com.entertainment
 * com.entertainment.util
 */
module com.entertainment{
        // which of my two packages are exposed to other java modules?
        // an exported package is visible to other modules.
        exports com.entertainment;
        }
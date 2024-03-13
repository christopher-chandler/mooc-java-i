public class Archive {

    private String name;
    private String identifier;


    public Archive (String name, String identifier)  {
        this.name = name;
        this.identifier = identifier;

    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchiveItem = (Archive) compared;

        return this.identifier.equals(comparedArchiveItem.identifier);


    }
        @Override
    public String toString() {
        return identifier + ": " +name;
    }
}

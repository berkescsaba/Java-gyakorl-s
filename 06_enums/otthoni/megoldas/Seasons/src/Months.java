public enum Months {

    JANUARY("Január", 1, Seasons.WINTER, 31, true),
    FEBRUARY("Február", 2, Seasons.WINTER, 28, false),
    MARCH("Március", 3, Seasons.SPRING, 31, true),
    APRIL("Április", 4, Seasons.SPRING, 30, false),
    MAY("Május", 5, Seasons.SPRING, 31, true),
    JUNE("Június", 6, Seasons.SUMMER, 30, false),
    JULY("Július", 7, Seasons.SUMMER, 31, false),
    AUGUST("Augusztus", 8, Seasons.SUMMER, 31, true),
    SEPTEMBER("Szeptember", 9, Seasons.FALL, 30, false),
    OCTOBER("Október", 10, Seasons.FALL, 31, true),
    NOVEMBER("November", 11, Seasons.FALL, 30, false),
    DECEMBER("December", 12, Seasons.WINTER, 31, true);


    private final String name;
    private final int whichMonthOfTheYear;
    private final Seasons seasons;
    private final int numberOfDays;
    private boolean hasHolidays;


    Months(String name, int whichMonthOfTheYear, Seasons seasons, int numberOfDays, boolean hasHolidays) {
        this.name = name;
        this.whichMonthOfTheYear = whichMonthOfTheYear;
        this.seasons = seasons;
        this.numberOfDays = numberOfDays;
        this.hasHolidays = hasHolidays;
    }

    public String getName() {
        return name;
    }

    public int getWhichMonthOfTheYear() {
        return whichMonthOfTheYear;
    }

    public static Months getByNumber(int number) {
        for (Months month : Months.values()) {
            if (month.getWhichMonthOfTheYear() == number) {
                return month;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.getName() + "{ " +
                "évszak=" + seasons.getName() + ", az év "
                + this.whichMonthOfTheYear + ". hónapja, napok száma=" + numberOfDays +
                (this.hasHolidays ? ", van ünnepe is }" : ", nincs ünnepe }");

    }


}

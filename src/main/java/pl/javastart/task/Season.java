package pl.javastart.task;

public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty"});

    private String polishName;
    private String[] months;

    Season(String polishName, String[] months) {
        this.polishName = polishName;
        this.months = months;
    }

    public String getPolishName() {
        return polishName;
    }

    public String[] getMonths() {
        return months;
    }
}
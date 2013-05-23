package winestore

class Smell {
    String cleanliness
    List aromas
    String notes

    static belongsTo = [Notes]
    static constraints = {
    }
}

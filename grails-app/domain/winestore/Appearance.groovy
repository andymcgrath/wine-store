package winestore

class Appearance {
    String clarity
    String viscosity
    String color
    String colorIntensity
    String notes

    static belongsTo = [Notes]
    static constraints = {
    }
}

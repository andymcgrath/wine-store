package winestore

class Taste {
    String firstImpression
    String acidity
    String tannins
    String body
    String alcohol
    String length
    String notes

    static belongsTo = [Notes]
    static constraints = {
    }
}

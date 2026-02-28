// Program to compute volume of Earth

class EarthVolumeComputation {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = 3.14159;
        double conversionFactor = 1.609; // km to miles

        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;
        double radiusMiles = radiusKm / conversionFactor;
        double volumeMiles = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is "
                + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
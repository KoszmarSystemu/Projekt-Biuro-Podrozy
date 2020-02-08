package Strona_glowna;

public class MainSite {
    private String WhereFlyOut;
    private String WhatHotelIn;
    private Integer PriceOfVacation;
    private Integer WhenFlyIn;
    private Integer HowLongStay;

    @Override
    public String toString() {
        return "Wycieczka{" + "  Kraj początkowy " + WhereFlyOut + "+ Hotel Docelowy " + WhatHotelIn + " + Cena Wycieczki "
                + PriceOfVacation + " Kiedy Wylot " + WhenFlyIn + "+ Kiedy Powrót " + HowLongStay + "}";
    }

    public MainSite(String WhereFlyOut, String WhatHotelIn, Integer PriceOfVacation, Integer WhenFlyIn, Integer HowLongStay) {
        this.WhereFlyOut = WhereFlyOut;
        this.WhatHotelIn = WhatHotelIn;
        this.PriceOfVacation = PriceOfVacation;
        this.WhenFlyIn = WhenFlyIn;
        this.HowLongStay = HowLongStay;
    }
}

package cz.vse.java.adventura;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    public ImageView obrazekLokace;
    private IHra hra;

    public Label jmenoLokace;
    public Label popisLokace;

    public void setHra(IHra hra){
        this.hra = hra;

        HerniPlan herniPlan = hra.getHerniPlan();
        Prostor aktualniProstor = herniPlan.getAktualniProstor();

        popisLokace.setText(aktualniProstor.dlouhyPopis());
        jmenoLokace.setText(aktualniProstor.getNazev());

        String nazevObrazku = "/"+aktualniProstor.getNazev()+".jpg";
        Image image = new Image(getClass().getResourceAsStream(nazevObrazku));
        obrazekLokace.setImage(image);
    }

}

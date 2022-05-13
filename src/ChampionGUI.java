import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ChampionGUI {
    public static void main(String[] args) {
        Jinx jinx = new Jinx(25,
                             "Jinx",
                             "Marksmen",
                             "Moderate",
                             "jinxbg.jpg",
                             "A manic and impulsive criminal from Zaun, Jinx lives to" +
                                     " wreak havoc without care for the consequences.");
        Screen champ = new Screen("Jinx");
        Screen abilities = new Screen("Jinx's Abilities");

        champ.setVisible(true);
        champ.setBounds(0,0,780,700);
        champ.changeStyle("Impact", 50, Colors.BoyZone);
        jinx.Introduce(champ, jinx.getName(), jinx.getBgArt());
        champ.changeStyle("Tahoma", 18, Colors.BalticSea);
        champ.out(jinx.showDescription());


        abilities.setVisible(true);
        abilities.setBounds(800,0,1100,800);
        abilities.changeStyle("Tahoma", 18, Colors.BalticSea);
        jinx.GetExcited(abilities);
        jinx.Swticheroo(abilities);
        jinx.FlameChompers(abilities);
        jinx.Zap(abilities);
        jinx.SuperRocket(abilities);

    }
}

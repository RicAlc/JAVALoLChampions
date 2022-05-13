public class Jinx extends Champion implements JinxAbilities{

    public Jinx(int id, String name, String role, String difficulty,String BgArt, String description) {
        super(id, name, role, difficulty, BgArt, description);
    }

    @Override
    public void Introduce(Screen s1, String name, String bgart){
        s1.out("                       " + name+"\n");
        s1.showImage(bgart);
    }

    @Override
    public void GetExcited(Screen s2){
        s2.out("\n Get Excited! \n");
        s2.showImage("GetExcited.gif");
    }

    @Override
    public void Swticheroo(Screen s2) {
        s2.out("\nSwitcheroo\n");
        s2.showImage("Switcheroo.gif");
    }

    @Override
    public void Zap(Screen s2) {
        s2.out("\nZap\n");
        s2.showImage("Zap.gif");
    }

    @Override
    public void FlameChompers(Screen s2) {
        s2.out("\nFlame Chompers\n");
        s2.showImage("FlameChompers.gif");
    }

    @Override
    public void SuperRocket(Screen s2) {
        s2.out("\nSuper Mega Death Rocket\n");
        s2.showImage("SuperRocket.gif");
    }
}
